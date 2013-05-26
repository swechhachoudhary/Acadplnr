package com.acadplnr;

import android.app.ListActivity;
import com.acadplnr.NewCourses;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

 
public class Courses extends ListActivity {
	
	public String courses[]={"course1","timetable","course3"};
	
	public NewCourses crs1 = new NewCourses("Mth101","iitk.ac.in/mth101","joydeep");
	public TextView V = (TextView) findViewById(R.id.crs1);

	
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(Courses.this, android.R.layout.simple_list_item_1, courses));
		V.setText("text");
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		
		super.onListItemClick(l, v, position, id);
		String lcourses = courses[position];
		try{
		Class Myclass = Class.forName("com.acadplnr.Courses." + lcourses);
		Intent myintent = new Intent(Courses.this,Myclass);
		startActivity(myintent);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}

	
	

}
