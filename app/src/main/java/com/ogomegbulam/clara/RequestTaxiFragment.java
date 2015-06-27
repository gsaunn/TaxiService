package com.ogomegbulam.clara;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class RequestTaxiFragment extends Fragment {

	
	
	Button btnnex;
	TimePicker tp=null;
	DatePicker dp=null;
	TextView   tv;
	public RequestTaxiFragment(){}
	@SuppressWarnings("deprecation")
	@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {

    View rootView = inflater.inflate(R.layout.fragment_time_selector, container, false);
    
    
    
    
    //Fragment fragmentclienttime = new RequestTime();
    //FragmentTransaction transaction =getChildFragmentManager().beginTransaction();
   // transaction.add(R.id.frame_container5, fragmentclienttime).commit();
    
    
    btnnex = (Button)rootView.findViewById(R.id.btnnext);
    tp =(TimePicker)rootView.findViewById(R.id.timePicker1);
    dp =(DatePicker)rootView.findViewById(R.id.datePicker1);
    tv =(TextView)rootView.findViewById(R.id.textView1);       
btnnex.setOnClickListener(new 	View.OnClickListener(){ 
    	
    	@Override
             public void onClick(View v) {
    		
    	Intent i = new Intent(getActivity(),Select_Pickup_AddressFragment.class);
    	startActivity(i);
            	 //getting the selected date and time
             	 
                 //String strDateTime = dp.getYear() + "-" + (dp.getMonth() + 1) + "-" + dp.getDayOfMonth() + " "+ tp.getCurrentHour() + ":" + tp.getCurrentMinute();

                 //Toast.makeText(getActivity(), "User selected Date and Time....=" + strDateTime , Toast.LENGTH_LONG).show();  
             /** Fragment fragmentclientlocation = new ClientLocationFragment();
               FragmentTransaction transaction =getChildFragmentManager().beginTransaction();
               transaction.add(R.id.frame_container6,fragmentclientlocation).commit();
               btnnex.setVisibility(View.GONE);
               dp.setVisibility(View.GONE);
               tp.setVisibility(View.GONE);
               tv.setVisibility(View.GONE);**/
             }});
     
    return rootView;}}
	
	
