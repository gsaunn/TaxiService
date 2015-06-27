package com.ogomegbulam.clara;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;

public class DriverActivity extends Activity {
	TimePicker tp=null;
	DatePicker dp=null;
	Button    btnnex;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_driver);
		setContentView(R.layout.fragment_time_selector);
		
		
		//Initializing next button and date and time picker
	    btnnex.findViewById(R.id.btnnext);
	    tp.findViewById(R.id.timePicker1);
	    dp.findViewById(R.id.datePicker1);}
}
