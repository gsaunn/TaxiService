package com.ogomegbulam.clara;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMapClickListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerDragListener;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.app.Activity;
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

public class Select_Pickup_Point extends Activity {
	Button locationbtn;
	private GoogleMap googleMap;
	private Location listener;
	private final LatLng LOCATION_SCHOOL =new LatLng(6.86890650000000000,7.399358099999972000);
/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_select__pickup__point);
	



	  
	
			googleMap = ((MapFragment) getFragmentManager().findFragmentById(
					R.id.fragment2)).getMap();
            googleMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
            googleMap.setMyLocationEnabled(true);
            CameraUpdate cam = CameraUpdateFactory.newLatLngZoom(LOCATION_SCHOOL, 21);
            googleMap.animateCamera(cam);
            //CameraUpdate update =CameraUpdateFactory.newLatLngZoom(LOCATION_UNN, 8);
            //googleMap.animateCamera(update);
            //googleMap.addMarker(new MarkerOptions().position(LOCATION_UNN).title("Pick Me Here"));
           // googleMap.setMyLocationEnabled(true);
            
            locationbtn.findViewById(R.id.buttonpick);
            locationbtn.setOnClickListener(new OnClickListener() {
				
				
				public void onClick(View v) {
					// TODO Auto-generated method stub

					Intent i = new Intent(getApplication(),ClientLocationFragment.class);
			    	startActivity(i);
					
				}
			});
            
			}
	

	}

	

