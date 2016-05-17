package com.prac;

import java.io.IOException;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

public class StartScren extends Activity implements OnClickListener {

	MediaPlayer mp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.startscrene);

		// Set up click listeners for all the buttons
		View continueButton = this.findViewById(R.id.continue_button);
		continueButton.setOnClickListener(this);
		View newButton = this.findViewById(R.id.new_button);
		newButton.setOnClickListener(this);
		View aboutButton = this.findViewById(R.id.about_button);
		aboutButton.setOnClickListener(this);
		View exitButton = this.findViewById(R.id.exit_button);
		exitButton.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.about_button:
			Intent i = new Intent(this, About.class);
			startActivity(i);
			break;
		case R.id.continue_button:
			// startGame(Game.DIFFICULTY_CONTINUE);
			break;
		case R.id.new_button:
			openNewGameDialog();
			break;
		case R.id.exit_button:
			finish();
			break;
		// More buttons go here (if any) ...
		}

	}

	private void openNewGameDialog() {
		new AlertDialog.Builder(this)
				.setTitle(R.string.new_game_title)
				.setItems(R.array.difficulty,
						new DialogInterface.OnClickListener() {
							public void onClick(
									DialogInterface dialoginterface, int i) {
								startGame(i);
							}
						}).show();
	}

	protected void startGame(int i) {
		// TODO Auto-generated method stub
		Intent in=new Intent(StartScren.this,MainActivity.class);
		startActivity(in);
		finish();
		
	}

	/*
	 * private void startGame(int i) { // Log.d(TAG, "clicked on " + i); //
	 * Start game here... Intent intent = new Intent(StartScren.this,
	 * MainActivity.class); startActivity(intent); }
	 */
	
	@Override
	protected void onResume() {
		super.onResume();
		 mp = MediaPlayer.create(getApplicationContext(), R.raw.game);
		try {
			mp.prepare();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mp.setLooping(true);
		mp.start();
	}

	@Override
	protected void onPause() {
		super.onPause();
		mp.stop();
		mp.release();
	}

}
