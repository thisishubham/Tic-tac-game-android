package com.prac;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
	int flag = 0;
	RelativeLayout relativelayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b1 = (Button) findViewById(R.id.button1);
		b2 = (Button) findViewById(R.id.button2);
		b3 = (Button) findViewById(R.id.button3);
		b4 = (Button) findViewById(R.id.button4);
		b5 = (Button) findViewById(R.id.button5);
		b6 = (Button) findViewById(R.id.button6);
		b7 = (Button) findViewById(R.id.button7);
		b8 = (Button) findViewById(R.id.button8);
		b9 = (Button) findViewById(R.id.button9);
		relativelayout = (RelativeLayout) findViewById(R.id.layout);
		b1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				b1.setText("X");
				b1.setEnabled(false);
				soni();
				priyeshc();
			}
		});
		b2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				b2.setText("X");
				b2.setEnabled(false);
				soni();
				priyeshc();
			}
		});
		b3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				b3.setText("X");
				b3.setEnabled(false);
				soni();
				priyeshc();
			}
		});
		b4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				b4.setText("X");
				b4.setEnabled(false);
				soni();
				priyeshc();
			}
		});
		b5.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				b5.setText("X");
				b5.setEnabled(false);
				soni();
				priyeshc();
			}
		});
		b6.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				b6.setText("X");
				b6.setEnabled(false);
				soni();
				priyeshc();
			}
		});
		b7.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				b7.setText("X");
				b7.setEnabled(false);
				soni();
				priyeshc();
			}
		});
		b8.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				b8.setText("X");
				b8.setEnabled(false);
				soni();
				priyeshc();
			}
		});
		b9.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				b9.setText("X");
				b9.setEnabled(false);
				soni();
				priyeshc();
			}
		});
	}

	protected void soni() {
		// TODO Auto-generated method stub
		String a1 = b1.getText().toString();
		String a2 = b2.getText().toString();
		String a3 = b3.getText().toString();
		String b1 = b4.getText().toString();
		String b2 = b5.getText().toString();
		String b3 = b6.getText().toString();
		String c1 = b7.getText().toString();
		String c2 = b8.getText().toString();
		String c3 = b9.getText().toString();
		Intent i = new Intent(getApplicationContext(), Gstart.class);
		if ((a1 == "O" && b2 == "O" && c3 == "O")
				|| (a3 == "O" && b2 == "O" && c1 == "O")
				|| (a2 == "O" && b2 == "O" && c2 == "O")
				|| (a3 == "O" && b3 == "O" && c3 == "O")
				|| (a1 == "O" && a2 == "O" && a3 == "O")
				|| (b1 == "O" && b2 == "O" && b3 == "O")
				|| (c1 == "O" && c2 == "O" && c3 == "O")
				|| (a1 == "O" && b1 == "O" && c1 == "O")) {

			if (a1 == "O" && b2 == "O" && c3 == "O") {
				MainActivity.this.b1.setBackgroundColor(Color.CYAN);
				MainActivity.this.b5.setBackgroundColor(Color.CYAN);
				MainActivity.this.b9.setBackgroundColor(Color.CYAN);
				relativelayout.startAnimation(AnimationUtils.loadAnimation(
						this, R.anim.shakes));

				Toast.makeText(getApplicationContext(), "Game over. You lost!",
						Toast.LENGTH_LONG).show();
				startActivity(i);
				finish();

			}
			if (a3 == "O" && b2 == "O" && c1 == "O") {
				MainActivity.this.b3.setBackgroundColor(Color.CYAN);
				MainActivity.this.b5.setBackgroundColor(Color.CYAN);
				MainActivity.this.b7.setBackgroundColor(Color.CYAN);
				relativelayout.startAnimation(AnimationUtils.loadAnimation(
						this, R.anim.shakes));
				Toast.makeText(getApplicationContext(), "Game over. You lost!",
						Toast.LENGTH_LONG).show();
				startActivity(i);
				finish();
			}
			if (a2 == "O" && b2 == "O" && c2 == "O") {
				MainActivity.this.b2.setBackgroundColor(Color.CYAN);
				MainActivity.this.b5.setBackgroundColor(Color.CYAN);
				MainActivity.this.b8.setBackgroundColor(Color.CYAN);
				relativelayout.startAnimation(AnimationUtils.loadAnimation(
						this, R.anim.shakes));
				Toast.makeText(getApplicationContext(), "Game over. You lost!",
						Toast.LENGTH_LONG).show();
				startActivity(i);
				finish();
			}
			if (a3 == "O" && b3 == "O" && c3 == "O") {
				MainActivity.this.b3.setBackgroundColor(Color.CYAN);
				MainActivity.this.b6.setBackgroundColor(Color.CYAN);
				MainActivity.this.b9.setBackgroundColor(Color.CYAN);
				relativelayout.startAnimation(AnimationUtils.loadAnimation(
						this, R.anim.shakes));
				Toast.makeText(getApplicationContext(), "Game over. You lost!",
						Toast.LENGTH_LONG).show();
				startActivity(i);
				finish();
			}
			if (a1 == "O" && a2 == "O" && a3 == "O") {
				MainActivity.this.b1.setBackgroundColor(Color.CYAN);
				MainActivity.this.b2.setBackgroundColor(Color.CYAN);
				MainActivity.this.b3.setBackgroundColor(Color.CYAN);
				relativelayout.startAnimation(AnimationUtils.loadAnimation(
						this, R.anim.shakes));
				Toast.makeText(getApplicationContext(), "Game over. You lost!",
						Toast.LENGTH_LONG).show();
				startActivity(i);
				finish();
			}
			if (b1 == "O" && b2 == "O" && b3 == "O") {
				MainActivity.this.b4.setBackgroundColor(Color.CYAN);
				MainActivity.this.b5.setBackgroundColor(Color.CYAN);
				MainActivity.this.b6.setBackgroundColor(Color.CYAN);
				relativelayout.startAnimation(AnimationUtils.loadAnimation(
						this, R.anim.shakes));
				Toast.makeText(getApplicationContext(), "Game over. You lost!",
						Toast.LENGTH_LONG).show();
				startActivity(i);
				finish();
			}
			if (c1 == "O" && c2 == "O" && c3 == "O") {
				MainActivity.this.b7.setBackgroundColor(Color.CYAN);
				MainActivity.this.b8.setBackgroundColor(Color.CYAN);
				MainActivity.this.b9.setBackgroundColor(Color.CYAN);
				relativelayout.startAnimation(AnimationUtils.loadAnimation(
						this, R.anim.shakes));
				Toast.makeText(getApplicationContext(), "Game over. You lost!",
						Toast.LENGTH_LONG).show();
				startActivity(i);
				finish();
			}
			if (a1 == "O" && b1 == "O" && c1 == "O") {
				MainActivity.this.b1.setBackgroundColor(Color.CYAN);
				MainActivity.this.b4.setBackgroundColor(Color.CYAN);
				MainActivity.this.b7.setBackgroundColor(Color.CYAN);
				relativelayout.startAnimation(AnimationUtils.loadAnimation(
						this, R.anim.shakes));
				Toast.makeText(getApplicationContext(), "Game over. You lost!",
						Toast.LENGTH_LONG).show();
				startActivity(i);
				finish();
			}
		} else if ((a1 == "X" && b2 == "X" && c3 == "X")
				|| (a3 == "X" && b2 == "X" && c1 == "X")
				|| (a2 == "X" && b2 == "X" && c2 == "X")
				|| (a3 == "X" && b3 == "X" && c3 == "X")
				|| (a1 == "X" && a2 == "X" && a3 == "X")
				|| (b1 == "X" && b2 == "X" && b3 == "X")
				|| (c1 == "X" && c2 == "X" && c3 == "X")
				|| (a1 == "X" && b1 == "X" && c1 == "X")) {

			if (a1 == "X" && b2 == "X" && c3 == "X") {
				MainActivity.this.b1.setBackgroundColor(Color.CYAN);
				MainActivity.this.b5.setBackgroundColor(Color.CYAN);
				MainActivity.this.b9.setBackgroundColor(Color.CYAN);

				Toast.makeText(getApplicationContext(), "Game over. You win!",
						Toast.LENGTH_LONG).show();
				startActivity(i);
				finish();
			}
			if (a3 == "X" && b2 == "X" && c1 == "X") {
				MainActivity.this.b3.setBackgroundColor(Color.CYAN);
				MainActivity.this.b5.setBackgroundColor(Color.CYAN);
				MainActivity.this.b7.setBackgroundColor(Color.CYAN);
				Toast.makeText(getApplicationContext(), "Game over. You win!",
						Toast.LENGTH_LONG).show();

				startActivity(i);
				finish();
			}
			if (a2 == "X" && b2 == "X" && c2 == "X") {
				MainActivity.this.b2.setBackgroundColor(Color.CYAN);
				MainActivity.this.b5.setBackgroundColor(Color.CYAN);
				MainActivity.this.b8.setBackgroundColor(Color.CYAN);
				Toast.makeText(getApplicationContext(), "Game over. You win!",
						Toast.LENGTH_LONG).show();

				startActivity(i);
				finish();
			}
			if (a3 == "X" && b3 == "X" && c3 == "X") {
				MainActivity.this.b3.setBackgroundColor(Color.CYAN);
				MainActivity.this.b6.setBackgroundColor(Color.CYAN);
				MainActivity.this.b9.setBackgroundColor(Color.CYAN);
				Toast.makeText(getApplicationContext(), "Game over. You win!",
						Toast.LENGTH_LONG).show();

				startActivity(i);
				finish();
			}
			if (a1 == "X" && a2 == "X" && a3 == "X") {
				MainActivity.this.b1.setBackgroundColor(Color.CYAN);
				MainActivity.this.b2.setBackgroundColor(Color.CYAN);
				MainActivity.this.b3.setBackgroundColor(Color.CYAN);
				Toast.makeText(getApplicationContext(), "Game over. You win!",
						Toast.LENGTH_LONG).show();

				startActivity(i);
				finish();
			}
			if (b1 == "X" && b2 == "X" && b3 == "X") {
				MainActivity.this.b4.setBackgroundColor(Color.CYAN);
				MainActivity.this.b5.setBackgroundColor(Color.CYAN);
				MainActivity.this.b6.setBackgroundColor(Color.CYAN);
				Toast.makeText(getApplicationContext(), "Game over. You win!",
						Toast.LENGTH_LONG).show();

				startActivity(i);
				finish();
			}
			if (c1 == "X" && c2 == "X" && c3 == "X") {
				MainActivity.this.b7.setBackgroundColor(Color.CYAN);
				MainActivity.this.b8.setBackgroundColor(Color.CYAN);
				MainActivity.this.b9.setBackgroundColor(Color.CYAN);
				Toast.makeText(getApplicationContext(), "Game over. You win!",
						Toast.LENGTH_LONG).show();

				startActivity(i);
				finish();
			}
			if (a1 == "X" && b1 == "X" && c1 == "X") {
				MainActivity.this.b1.setBackgroundColor(Color.CYAN);
				MainActivity.this.b4.setBackgroundColor(Color.CYAN);
				MainActivity.this.b7.setBackgroundColor(Color.CYAN);
				Toast.makeText(getApplicationContext(), "Game over. You win!",
						Toast.LENGTH_LONG).show();

				startActivity(i);
				finish();
			}

		} else if ((a1.equals("X") || a1.equals("O"))
				&& (a2.equals("X") || a2.equals("O"))
				&& (a3.equals("X") || a3.equals("O"))
				&& (b1.equals("X") || b1.equals("O"))
				&& (b2.equals("X") || b2.equals("O"))
				&& (b3.equals("X") || b3.equals("O"))
				&& (c1.equals("X") || c1.equals("O"))
				&& (c2.equals("X") || c2.equals("O"))
				&& (c3.equals("X") || c3.equals("O"))) {
			Toast.makeText(getApplicationContext(), "Game over. It's a draw!",
					Toast.LENGTH_LONG).show();
			startActivity(i);
			finish();
		}
	}

	private void priyeshc() {
		// TODO Auto-generated method stub
		String a1 = b1.getText().toString();
		String a2 = b2.getText().toString();
		String a3 = b3.getText().toString();
		String b1 = b4.getText().toString();
		String b2 = b5.getText().toString();
		String b3 = b6.getText().toString();
		String c1 = b7.getText().toString();
		String c2 = b8.getText().toString();
		String c3 = b9.getText().toString();

		if (a1.equals(" ")
				&& ((a2.equals("O") && a3.equals("O"))
						|| (b2.equals("O") && c3.equals("O")) || (b1
						.equals("O") && c1.equals("O")))) {
			// markSquare(1, 1);
			this.b1.setText("O");
			this.b1.setEnabled(false);
			soni();
		}

		else if (a2.equals(" ")
				&& ((b2.equals("O") && c2.equals("O")) || (a1.equals("O") && a3
						.equals("O")))) {
			// markSquare(1, 2);
			this.b2.setText("O");
			this.b2.setEnabled(false);
			soni();
		} else if (a3.equals(" ")
				&& ((a1.equals("O") && a2.equals("O"))
						|| (c1.equals("O") && b2.equals("O")) || (b3
						.equals("O") && c3.equals("O")))) {
			// markSquare(1, 3);
			this.b3.setText("O");
			this.b3.setEnabled(false);
			soni();
		} else if (b1.equals(" ")
				&& ((b2.equals("O") && b3.equals("O")) || (a1.equals("O") && c1
						.equals("O")))) {
			// markSquare(2, 1);
			this.b4.setText("O");
			this.b4.setEnabled(false);
			soni();
		} else if (b2.equals(" ")
				&& ((a1.equals("O") && c3.equals("O"))
						|| (a2.equals("O") && c2.equals("O"))
						|| (c1.equals("O") && a3.equals("O")) || (b1
						.equals("O") && b3.equals("O")))) {
			// markSquare(2, 2);
			this.b5.setText("O");
			this.b5.setEnabled(false);
			soni();
		} else if (b3.equals(" ")
				&& ((b1.equals("O") && b2.equals("O")) || (a3.equals("O") && c3
						.equals("O")))) {
			// markSquare(2, 3);
			this.b6.setText("O");
			this.b6.setEnabled(false);
			soni();
		} else if (c1.equals(" ")
				&& ((a1.equals("O") && b1.equals("O"))
						|| (c2.equals("O") && c3.equals("O")) || (b2
						.equals("O") && a3.equals("O")))) {
			// markSquare(3, 1);
			this.b7.setText("O");
			this.b7.setEnabled(false);
			soni();
		} else if (c2.equals(" ")
				&& ((a2.equals("O") && b2.equals("O")) || (c1.equals("O") && c3
						.equals("O")))) {
			// markSquare(3, 2);
			this.b8.setText("O");
			this.b8.setEnabled(false);
			soni();
		} else if (c3.equals(" ")
				&& ((a1.equals("O") && b2.equals("O"))
						|| (a3.equals("O") && b3.equals("O")) || (c1
						.equals("O") && c2.equals("O")))) {
			// markSquare(3, 3);
			this.b9.setText("O");
			this.b9.setEnabled(false);
			soni();
		}

		else if (a1.equals(" ")
				&& ((a2.equals("X") && a3.equals("X"))
						|| (b2.equals("X") && c3.equals("X")) || (b1
						.equals("X") && c1.equals("X")))) {
			// markSquare(1, 1);
			this.b1.setText("O");
			this.b1.setEnabled(false);
			soni();
		} else if (a2.equals(" ")
				&& ((b2.equals("X") && c2.equals("X")) || (a1.equals("X") && a3
						.equals("X")))) {
			// markSquare(1, 2);
			this.b2.setText("O");
			this.b2.setEnabled(false);
			soni();
		} else if (a3.equals(" ")
				&& ((a1.equals("X") && a2.equals("X"))
						|| (c1.equals("X") && b2.equals("X")) || (b3
						.equals("X") && c3.equals("X")))) {
			// markSquare(1, 3);
			this.b3.setText("O");
			this.b3.setEnabled(false);
			soni();
		} else if (b1.equals(" ")
				&& ((b2.equals("X") && b3.equals("X")) || (a1.equals("X") && c1
						.equals("X")))) {
			// markSquare(2, 1);
			this.b4.setText("O");
			this.b4.setEnabled(false);
			soni();
		} else if (b2.equals(" ")
				&& ((a1.equals("X") && c3.equals("X"))
						|| (a2.equals("X") && c2.equals("X"))
						|| (c1.equals("X") && a3.equals("X")) || (b1
						.equals("X") && b3.equals("X")))) {
			// markSquare(2, 2);
			this.b5.setText("O");
			this.b5.setEnabled(false);
			soni();
		} else if (b3.equals(" ")
				&& ((b1.equals("X") && b2.equals("X")) || (a3.equals("X") && c3
						.equals("X")))) {
			// markSquare(2, 3);
			this.b6.setText("O");
			this.b6.setEnabled(false);
			soni();
		} else if (c1.equals(" ")
				&& ((a1.equals("X") && b1.equals("X"))
						|| (c2.equals("X") && c3.equals("X")) || (b2
						.equals("X") && a3.equals("X")))) {
			// markSquare(3, 1);
			this.b7.setText("O");
			this.b7.setEnabled(false);
			soni();
		} else if (c2.equals(" ")
				&& ((a2.equals("X") && b2.equals("X")) || (c1.equals("X") && c3
						.equals("X")))) {
			// markSquare(3, 2);
			this.b8.setText("O");
			this.b8.setEnabled(false);
			soni();
		} else if (c3.equals(" ")
				&& ((a1.equals("X") && b2.equals("X"))
						|| (a3.equals("X") && b3.equals("X")) || (c1
						.equals("X") && c2.equals("X")))) {
			// markSquare(3, 3);
			this.b9.setText("O");
			this.b9.setEnabled(false);
			soni();
		}

		else if (flag == 0 && b2.equals(" ")) {
			this.b5.setText("O");
			this.b5.setEnabled(false);
			flag++;
		}

		else if (a1.equals(" ") && (a2.equals("X") && b1.equals("X"))) {
			this.b1.setText("O");
			this.b1.setEnabled(false);
			soni();
		} else if (a3.equals(" ") && (a2.equals("X") && b3.equals("X"))) {
			this.b3.setText("O");
			this.b3.setEnabled(false);
			soni();
		} else if (c1.equals(" ") && (b1.equals("X") && c2.equals("X"))) {
			this.b7.setText("O");
			this.b7.setEnabled(false);
			soni();
		} else if (c3.equals(" ") && (b3.equals("X") && c2.equals("X"))) {
			this.b9.setText("O");
			this.b9.setEnabled(false);
			soni();
		}

		else if (flag == 0) {
			Random r = new Random();
			int a = r.nextInt(3);
			switch (a) {
			case 0: {
				this.b1.setText("O");
				this.b1.setEnabled(false);
				flag++;
				break;
			}
			case 1: {
				this.b3.setText("O");
				this.b3.setEnabled(false);
				flag++;
				break;
			}
			case 2: {
				this.b7.setText("O");
				this.b7.setEnabled(false);
				flag++;
				break;
			}
			case 3: {
				this.b9.setText("O");
				this.b9.setEnabled(false);
				flag++;
				break;
			}

			}
		} else if (a1.equals(" ")) {
			this.b1.setText("O");
			this.b1.setEnabled(false);
			soni();
		} else if (a2.equals(" ")) {
			this.b2.setText("O");
			this.b2.setEnabled(false);
			soni();
		} else if (a3.equals(" ")) {
			this.b3.setText("O");
			this.b3.setEnabled(false);
			soni();
		} else if (b1.equals(" ")) {
			this.b4.setText("O");
			this.b4.setEnabled(false);
			soni();
		} else if (b2.equals(" ")) {
			this.b5.setText("O");
			this.b5.setEnabled(false);
			soni();
		} else if (b3.equals(" ")) {
			this.b6.setText("O");
			this.b6.setEnabled(false);
			soni();
		} else if (c1.equals(" ")) {
			this.b7.setText("O");
			this.b7.setEnabled(false);
			soni();
		} else if (c2.equals(" ")) {
			this.b8.setText("O");
			this.b8.setEnabled(false);
			soni();
		} else if (c3.equals(" ")) {
			this.b9.setText("O");
			this.b9.setEnabled(false);
			soni();
		}

	}
}