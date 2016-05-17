package com.prac;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Store extends Activity {
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
	int flag = 0;

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
		priyesh();
		b1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(b1.getText().toString()=="1"||b1.getText().toString()=="0")
				{
					Toast.makeText(getApplicationContext(), "cell is already full", Toast.LENGTH_LONG).show();
				}
				else if (flag == 0) {
					b1.setText("1");
					flag = 1;
				} else {
					b1.setText("0");
					flag = 0;
				}
				String a1 = b1.getText().toString();
				String a2 = b2.getText().toString();
				String a3 = b3.getText().toString();

				String b1 = b4.getText().toString();
				String c1 = b7.getText().toString();

				String b2 = b5.getText().toString();
				String c3 = b9.getText().toString();

				if (a1 == a2 && a1 == a3) {
					Store.this.b1.setBackgroundColor(Color.CYAN);
					Store.this.b2.setBackgroundColor(Color.CYAN);
					Store.this.b3.setBackgroundColor(Color.CYAN);
					Intent ao=new Intent(getApplicationContext(), Gstart.class);
					startActivity(ao);
				}

				if (a1 == b1 && a1 == c1) {
					Store.this.b1.setBackgroundColor(Color.CYAN);
					Store.this.b4.setBackgroundColor(Color.CYAN);
					Store.this.b7.setBackgroundColor(Color.CYAN);
					Intent ao=new Intent(getApplicationContext(), Gstart.class);
					startActivity(ao);
				}
				if (a1 == b2 && a1 == c3) {
					Store.this.b1.setBackgroundColor(Color.CYAN);
					Store.this.b5.setBackgroundColor(Color.CYAN);
					Store.this.b9.setBackgroundColor(Color.CYAN);
					Intent ao=new Intent(getApplicationContext(), Gstart.class);
					startActivity(ao);
				}

			}
		});
		b2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(b2.getText().toString()=="1"||b2.getText().toString()=="0")
				{
					Toast.makeText(getApplicationContext(), "cell is already full", Toast.LENGTH_LONG).show();
				}
				else if (flag == 0) {
					b2.setText("1");
					flag = 1;
				} else {
					b2.setText("0");
					flag = 0;

				}
				String a1 = b1.getText().toString();
				String a2 = b2.getText().toString();
				String a3 = b3.getText().toString();

				String b2 = b5.getText().toString();
				String c2 = b8.getText().toString();
				if (a1 == a2 && a1 == a3) {
					Store.this.b1.setBackgroundColor(Color.CYAN);
					Store.this.b2.setBackgroundColor(Color.CYAN);
					Store.this.b3.setBackgroundColor(Color.CYAN);
					Intent ao=new Intent(getApplicationContext(), Gstart.class);
					startActivity(ao);
				}
				if (a2 == b2 && a2 == c2) {
					Store.this.b2.setBackgroundColor(Color.CYAN);
					Store.this.b5.setBackgroundColor(Color.CYAN);
					Store.this.b8.setBackgroundColor(Color.CYAN);
					Intent ao=new Intent(getApplicationContext(), Gstart.class);
					startActivity(ao);
				}
			}
		});
		b3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(b3.getText().toString()=="1"||b3.getText().toString()=="0")
				{
					Toast.makeText(getApplicationContext(), "cell is already full", Toast.LENGTH_LONG).show();
				}
				else
				if (flag == 0) {
					b3.setText("1");
					flag = 1;
				} else {
					b3.setText("0");
					flag = 0;
				}
				String a1 = b1.getText().toString();
				String a2 = b2.getText().toString();
				String a3 = b3.getText().toString();

				String b3 = b6.getText().toString();
				String c3 = b9.getText().toString();

				String b2 = b5.getText().toString();
				String c1 = b7.getText().toString();
				if (a1 == a2 && a1 == a3) {
					Store.this.b1.setBackgroundColor(Color.CYAN);
					Store.this.b2.setBackgroundColor(Color.CYAN);
					Store.this.b3.setBackgroundColor(Color.CYAN);
					Intent ao=new Intent(getApplicationContext(), Gstart.class);
					startActivity(ao);
				}
				if (a3 == b3 && a3 == c3) {
					Store.this.b3.setBackgroundColor(Color.CYAN);
					Store.this.b6.setBackgroundColor(Color.CYAN);
					Store.this.b9.setBackgroundColor(Color.CYAN);
					Intent ao=new Intent(getApplicationContext(), Gstart.class);
					startActivity(ao);
				}
				if (a3 == b2 && a3 == c1) {
					Store.this.b3.setBackgroundColor(Color.CYAN);
					Store.this.b5.setBackgroundColor(Color.CYAN);
					Store.this.b7.setBackgroundColor(Color.CYAN);
					Intent ao=new Intent(getApplicationContext(), Gstart.class);
					startActivity(ao);
				}
			}
		});
		b4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(b4.getText().toString()=="1"||b4.getText().toString()=="0")
				{
					Toast.makeText(getApplicationContext(), "cell is already full", Toast.LENGTH_LONG).show();
				}
				else
				if (flag == 0) {
					b4.setText("1");
					flag = 1;
				} else {
					b4.setText("0");
					flag = 0;
				}
				String a1 = b1.getText().toString();
				String b1 = b4.getText().toString();
				String c1 = b7.getText().toString();

				String b2 = b5.getText().toString();
				String b3 = b6.getText().toString();
				if (a1 == b1 && a1 == c1) {
					Store.this.b1.setBackgroundColor(Color.CYAN);
					Store.this.b4.setBackgroundColor(Color.CYAN);
					Store.this.b7.setBackgroundColor(Color.CYAN);
					Intent ao=new Intent(getApplicationContext(), Gstart.class);
					startActivity(ao);
				}
				if (b1 == b2 && b1 == b3) {
					Store.this.b4.setBackgroundColor(Color.CYAN);
					Store.this.b5.setBackgroundColor(Color.CYAN);
					Store.this.b6.setBackgroundColor(Color.CYAN);
					Intent ao=new Intent(getApplicationContext(), Gstart.class);
					startActivity(ao);
				}
			}
		});
		b5.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(b5.getText().toString()=="1"||b5.getText().toString()=="0")
				{
					Toast.makeText(getApplicationContext(), "cell is already full", Toast.LENGTH_LONG).show();
				}
				else
				if (flag == 0) {
					b5.setText("1");
					flag = 1;
				} else {
					b5.setText("0");
					flag = 0;
				}
				String a1 = b1.getText().toString();
				String a2 = b2.getText().toString();
				String a3 = b3.getText().toString();

				String b1 = b4.getText().toString();
				String b2 = b5.getText().toString();
				String b3 = b6.getText().toString();

				String c1 = b7.getText().toString();
				String c2 = b8.getText().toString();
				String c3 = b9.getText().toString();

				if (a2 == b2 && a2 == c2) {
					Store.this.b2.setBackgroundColor(Color.CYAN);
					Store.this.b5.setBackgroundColor(Color.CYAN);
					Store.this.b8.setBackgroundColor(Color.CYAN);
					Intent ao=new Intent(getApplicationContext(), Gstart.class);
					startActivity(ao);
				}
				if (b1 == b2 && b1 == b3) {
					Store.this.b4.setBackgroundColor(Color.CYAN);
					Store.this.b5.setBackgroundColor(Color.CYAN);
					Store.this.b6.setBackgroundColor(Color.CYAN);
					Intent ao=new Intent(getApplicationContext(), Gstart.class);
					startActivity(ao);
				}
				if (a1 == b2 && a1 == c3) {
					Store.this.b1.setBackgroundColor(Color.CYAN);
					Store.this.b5.setBackgroundColor(Color.CYAN);
					Store.this.b9.setBackgroundColor(Color.CYAN);
					Intent ao=new Intent(getApplicationContext(), Gstart.class);
					startActivity(ao);
				}
				if (a3 == b2 && a3 == c1) {
					Store.this.b3.setBackgroundColor(Color.CYAN);
					Store.this.b5.setBackgroundColor(Color.CYAN);
					Store.this.b7.setBackgroundColor(Color.CYAN);
					Intent ao=new Intent(getApplicationContext(), Gstart.class);
					startActivity(ao);
				}

			}
		});
		b6.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(b6.getText().toString()=="1"||b6.getText().toString()=="0")
				{
					Toast.makeText(getApplicationContext(), "cell is already full", Toast.LENGTH_LONG).show();
				}
				else
				if (flag == 0) {
					b6.setText("1");
					flag = 1;
				} else {
					b6.setText("0");
					flag = 0;
				}
				String b1 = b4.getText().toString();
				String b2 = b5.getText().toString();
				String b3 = b6.getText().toString();

				String a3 = Store.this.b3.getText().toString();
				String c3 = b9.getText().toString();
				if (b1 == b2 && b1 == b3) {
					Store.this.b4.setBackgroundColor(Color.CYAN);
					Store.this.b5.setBackgroundColor(Color.CYAN);
					Store.this.b6.setBackgroundColor(Color.CYAN);
					Intent ao=new Intent(getApplicationContext(), Gstart.class);
					startActivity(ao);
				}
				if (a3 == b3 && a3 == c3) {
					Store.this.b3.setBackgroundColor(Color.CYAN);
					Store.this.b6.setBackgroundColor(Color.CYAN);
					Store.this.b9.setBackgroundColor(Color.CYAN);
					Intent ao=new Intent(getApplicationContext(), Gstart.class);
					startActivity(ao);
				}
			}
		});
		b7.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(b7.getText().toString()=="1"||b7.getText().toString()=="0")
				{
					Toast.makeText(getApplicationContext(), "cell is already full", Toast.LENGTH_LONG).show();
				}
				else
				if (flag == 0) {
					b7.setText("1");
					flag = 1;
				} else {
					b7.setText("0");
					flag = 0;
				}
				String a1 = b1.getText().toString();
				String b1 = b4.getText().toString();
				String c1 = b7.getText().toString();

				String c2 = b8.getText().toString();
				String c3 = b9.getText().toString();

				String b2 = b5.getText().toString();
				String a3 = b3.getText().toString();

				if (a1 == b1 && a1 == c1) {
					Store.this.b1.setBackgroundColor(Color.CYAN);
					Store.this.b4.setBackgroundColor(Color.CYAN);
					Store.this.b7.setBackgroundColor(Color.CYAN);
					Intent ao=new Intent(getApplicationContext(), Gstart.class);
					startActivity(ao);
				}
				if (c1 == c2 && c1 == c3) {
					Store.this.b7.setBackgroundColor(Color.CYAN);
					Store.this.b8.setBackgroundColor(Color.CYAN);
					Store.this.b9.setBackgroundColor(Color.CYAN);
					Intent ao=new Intent(getApplicationContext(), Gstart.class);
					startActivity(ao);
				}
				if (c1 == b2 && c1 == a3) {
					Store.this.b3.setBackgroundColor(Color.CYAN);
					Store.this.b5.setBackgroundColor(Color.CYAN);
					Store.this.b7.setBackgroundColor(Color.CYAN);
					Intent ao=new Intent(getApplicationContext(), Gstart.class);
					startActivity(ao);
				}
			}
		});
		b8.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(b8.getText().toString()=="1"||b8.getText().toString()=="0")
				{
					Toast.makeText(getApplicationContext(), "cell is already full", Toast.LENGTH_LONG).show();
				}
				else
				if (flag == 0) {
					b8.setText("1");
					flag = 1;
				} else {
					b8.setText("0");
					flag = 0;
				}
				String c1 = b7.getText().toString();
				String c2 = b8.getText().toString();
				String c3 = b9.getText().toString();

				String a2 = b2.getText().toString();
				String b2 = b5.getText().toString();
				if (c1 == c2 && c1 == c3) {
					Store.this.b7.setBackgroundColor(Color.CYAN);
					Store.this.b8.setBackgroundColor(Color.CYAN);
					Store.this.b9.setBackgroundColor(Color.CYAN);
					Intent ao=new Intent(getApplicationContext(), Gstart.class);
					startActivity(ao);
				}
				if (a2 == b2 && a2 == c2) {
					Store.this.b2.setBackgroundColor(Color.CYAN);
					Store.this.b5.setBackgroundColor(Color.CYAN);
					Store.this.b8.setBackgroundColor(Color.CYAN);
					Intent ao=new Intent(getApplicationContext(), Gstart.class);
					startActivity(ao);
				}
			}
		});
		b9.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(b9.getText().toString()=="1"||b9.getText().toString()=="0")
				{
					Toast.makeText(getApplicationContext(), "cell is already full", Toast.LENGTH_LONG).show();
				}
				else
				if (flag == 0) {
					b9.setText("1");
					flag = 1;
				} else {
					b9.setText("0");
					flag = 0;
				}
				String c1 = b7.getText().toString();
				String c2 = b8.getText().toString();
				String c3 = b9.getText().toString();

				String a1 = b1.getText().toString();
				String b2 = b5.getText().toString();

				String a3 = b3.getText().toString();
				String b3 = b6.getText().toString();
				if (c1 == c2 && c1 == c3) {
					Store.this.b7.setBackgroundColor(Color.CYAN);
					Store.this.b8.setBackgroundColor(Color.CYAN);
					Store.this.b9.setBackgroundColor(Color.CYAN);
					Intent ao=new Intent(getApplicationContext(), Gstart.class);
					startActivity(ao);
				}
				if (a3 == b3 && a3 == c3) {
					Store.this.b3.setBackgroundColor(Color.CYAN);
					Store.this.b6.setBackgroundColor(Color.CYAN);
					Store.this.b9.setBackgroundColor(Color.CYAN);
					Intent ao=new Intent(getApplicationContext(), Gstart.class);
					startActivity(ao);
				}
				if (a1 == b2 && a1 == c3) {
					Store.this.b1.setBackgroundColor(Color.CYAN);
					Store.this.b5.setBackgroundColor(Color.CYAN);
					Store.this.b9.setBackgroundColor(Color.CYAN);
					Intent ao=new Intent(getApplicationContext(), Gstart.class);
					startActivity(ao);
				}
			}
		});
	}
	private void priyesh() {
		// TODO Auto-generated method stub
//		Random r= new Random();
//		int a=r.nextInt(2);
//		int b=r.nextInt(2);
		
	}
}
