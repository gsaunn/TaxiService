package com.ogomegbulam.clara;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class ClientLocationFragment extends Activity{
	Button bottondest;
	private GoogleMap googleMap;
	private Location listener;
	private final LatLng LOCATION_UNN =new LatLng(6.86890650000000000,7.399358099999972000);
	
	//ClientLocationFragment(){}
	// Google Map
		//public GoogleMap googleMap;
	/* (non-Javadoc)
	 * @see android.app.Fragment#onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)
	 */
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.select_destination_point);
		// TODO Auto-generated method stub
		 
			googleMap = ((MapFragment) getFragmentManager().findFragmentById(
					R.id.fragment3)).getMap();
            googleMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
            CameraUpdate update =CameraUpdateFactory.newLatLngZoom(LOCATION_UNN, 8);
            googleMap.animateCamera(update);
            //googleMap.addMarker(new MarkerOptions().position(LOCATION_UNN).title("Pick Me Here"));
            googleMap.setMyLocationEnabled(true);
            
		bottondest.findViewById(R.id.button4);
		bottondest.setOnClickListener(new OnClickListener() {
			
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplication(),RequestTime.class);
		    	startActivity(i);
			}
		});
		}}
            
	



