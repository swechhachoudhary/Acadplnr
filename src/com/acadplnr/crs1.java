package com.acadplnr;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.EditText;
import android.widget.TextView;

public class crs1 extends Activity {

	TextView cors1;
	AlertDialog.Builder alert = new AlertDialog.Builder(crs1.this);
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		cors1 = (TextView)findViewById(R.id.crs1);
		cors1.setOnLongClickListener(new View.OnLongClickListener() {
			
			@Override
			public boolean onLongClick(View v) {
				// TODO Auto-generated method stub
				return false;
				
				

			}
		});
	}
	

}
