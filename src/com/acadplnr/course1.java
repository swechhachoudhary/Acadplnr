package com.acadplnr;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class course1 extends ListActivity {
	
	String courses[] = {"Add","Add","Add","Add","Add","Add","Add","Add"};
	String courseid[] = {"crs1","crs2","crs3","crs4","crs5","crs6","crs7","crs8"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(course1.this, android.R.layout.simple_list_item_1, courses));
	}
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		
		super.onListItemClick(l, v, position, id);
		String lcourses = courseid[position];
		try{
			Class Myclass = Class.forName("com.acadplnr.course1." + lcourses);
			Intent myintent = new Intent(course1.this,Myclass);
			startActivity(myintent);
			}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
		
	}

}
