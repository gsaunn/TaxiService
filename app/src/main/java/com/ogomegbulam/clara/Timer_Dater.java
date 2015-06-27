package com.ogomegbulam.clara;

import javax.xml.datatype.Duration;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class Timer_Dater extends Activity {
	Button btnnexttt=null;
	 TimePicker tpp=null;
	 DatePicker dpp=null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_timer__dater);
		 dpp = (DatePicker)findViewById(R.id.datePicker1);
         tpp = (TimePicker) findViewById(R.id.timePicker1);
          
         Button btnnexttt=(Button)findViewById(R.id.button111);
         
         btnnexttt.setOnClickListener(new OnClickListener() {

          @Override
          public void onClick(View v) {
        	  openAlert(v);
			}
		});
	}
	
	private void openAlert(View view) {
		 AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Timer_Dater.this);
	     
		 alertDialogBuilder.setTitle( "AGREE TO TAXI FARE");
		 alertDialogBuilder.setMessage("Within Campus is N200,other locations are negotiable");
		 // set positive button: Yes message
		 alertDialogBuilder.setPositiveButton("Accept",new DialogInterface.OnClickListener() {
				//public void onClick(DialogInterface dialog,int id) {
					// go to a new activity of the app
					//Intent positveActivity = new Intent(getApplicationContext(),
                          //PositiveActivity.class);
		            //startActivity(positveActivity);	
				//}
			  //});
		 // set negative button: No message
		 //alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog,int id) {
					// cancel the alert box and put a Toast to the user
					dialog.cancel();
					Toast.makeText(getApplicationContext(), "Your Taxi is on the way", 
							Toast.LENGTH_LONG).show();
				}
			});
		 // set neutral button: Exit the app message
		 alertDialogBuilder.setNeutralButton("Reject",new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog,int id) {
					// exit the app and go to the HOME
					Timer_Dater.this.finish();
				}
			});
		 
		 AlertDialog alertDialog = alertDialogBuilder.create();
		 // show alert
		 alertDialog.show();
	}
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  /*
          	 
              //String strDateTime = dpp.getYear() + "-" + (dpp.getMonth() + 1) + "-" + dpp.getDayOfMonth() + " "+ tpp.getCurrentHour() + ":" + tpp.getCurrentMinute();

             // Toast.makeText(getApplicationContext(), "User selected Date and Time....=" + strDateTime , Toast.LENGTH_LONG).show();  
              DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {

                  public void onClick(DialogInterface dialog, int which) {
                      switch (which){
                      case DialogInterface.BUTTON_POSITIVE:
                          //Yes button clicked
                        // Toast.makeText(getApplicationContext(), "text", Toast.LENGTH_LONG).show(); 
                          break;

                      case DialogInterface.BUTTON_NEGATIVE:
                          //No button clicked
                          break;
                      }
                  }
              };

              AlertDialog.Builder builder = new Builder(getApplicationContext())
              .setMessage("Do You Want TO Exit Lion Taxi ?")
              .setPositiveButton("Yes", dialogClickListener)
               .setNegativeButton("No", dialogClickListener)
               .setCancelable(false)
               .setTitle("Close Lion Taxi");
               builder.show();*/
          };;//}//);//}//}

