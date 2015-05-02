package com.thenewboston.travis;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StartingPoint extends Activity {
	/** Called when the activity is first created...*/
	int counter;
	Button add, sub;
	TextView display;

	
	protected void onCreate(Bundle savedInstanceState) {/**this method makes the button do
														something when we click*/
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		counter = 0;
		add = (Button)findViewById(R.id.bAdd);/**setting up reference to xml*/
		sub = (Button) findViewById(R.id.bSubtract);
		display = (TextView) findViewById(R.id.tvDisplay);
		add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter++;
				display.setText("Your total is "+ counter);
				
			}
		});
		sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter--;
				display.setText("Your total is "+ counter);
			}
		});
	}

}
