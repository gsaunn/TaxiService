package com.ogomegbulam.clara;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class RequestTime extends Activity{
 
	
	TimePicker tp=null;
	DatePicker dp=null;
	Button    btnnex;
	
	
	
	
	
	
	
	

	    /* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_time_selector);
	
	
	//Initializing next button and date and time picker
    btnnex.findViewById(R.id.btnnext);
    tp.findViewById(R.id.timePicker1);
    dp.findViewById(R.id.datePicker1);
    //btnnex.setOnClickListener(new OnClickListener(){ 
    	
    //	@Override
           //  public void onClick(View v) {
    		
    	//Intent i = new Intent("ClientLocationFragment");
    	//startActivity(i);
            	 //getting the selected date and time
             	 
                 //String strDateTime = dp.getYear() + "-" + (dp.getMonth() + 1) + "-" + dp.getDayOfMonth() + " "+ tp.getCurrentHour() + ":" + tp.getCurrentMinute();

                 //Toast.makeText(getActivity(), "User selected Date and Time....=" + strDateTime , Toast.LENGTH_LONG).show();  
               //Fragment fragmentclientlocation = new ClientLocationFragment();
               //FragmentTransaction transaction =getChildFragmentManager().beginTransaction();
              // transaction.add(R.id.frame2_container, fragmentclientlocation).commit();
    		/*DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {

    	        public void onClick(DialogInterface dialog, int which) {
    	            switch (which){
    	            case DialogInterface.BUTTON_POSITIVE:
    	                //Yes button clicked
    	               Toast.makeText(getApplication(), "your taxi is on the way", Toast.LENGTH_LONG).show();
    	                break;

    	            case DialogInterface.BUTTON_NEGATIVE:
    	                //No button clicked
    	            	//Intent i = new Intent(getActivity(),MainActivity.class);
    			    	//startActivity(i);
    	                break;
    	            }
    	        }
    	    };

    	    AlertDialog.Builder builder = new AlertDialog.Builder(null).
    	    setMessage(" Within the campus is N200,others negotiable")
    	    .setPositiveButton("ACCEPT", dialogClickListener)
    	     .setNegativeButton("REJECT", dialogClickListener)
    	     .setCancelable(false)
    	     .setTitle("Agree to price");
    	     builder.show();*/

             //}});
     
   
	}}
