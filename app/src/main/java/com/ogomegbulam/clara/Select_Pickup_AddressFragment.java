package com.ogomegbulam.clara;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;

import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Select_Pickup_AddressFragment extends Fragment {
	public GoogleMap  mMap;
  public Select_Pickup_AddressFragment(){}
  private static View rootView;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	        Bundle savedInstanceState) {

		 if (rootView != null) {
		        ViewGroup parent = (ViewGroup) rootView.getParent();
		        if (parent != null)
		            parent.removeView(rootView);
		    }
		    try {
		    	rootView = inflater.inflate(R.layout.activity_test_main, container, false);
		    } catch (InflateException e) {
		        /* map is already there, just return view as it is  */
		    }
	    //View rootView = inflater.inflate(R.layout.activity_test_main, container, false);
		Button pickupbtn =(Button)rootView.findViewById(R.id.buttonpickupaddr);
		pickupbtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(getActivity(),AddressSearch.class);
		    	startActivity(i);
				
		    	
		    	
			}
			
			
			
			
		});
		
		
		return rootView;
		
		
	}
	}
	
	
	

	
