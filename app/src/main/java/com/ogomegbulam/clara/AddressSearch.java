package com.ogomegbulam.clara;

import java.util.List;
import java.util.Locale;

import android.app.Activity;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;


public class AddressSearch extends Activity {
 @SuppressWarnings("unused")
private  GoogleMap mMap;
 EditText Pickupaddress; 
 EditText Destinationaddress;
	Button		Next;
		
		Geocoder geocoder;

		private final LatLng LOCATION_SCHOOL =new LatLng(6.8689,7.3994);
		
 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pickup_address_search);
		Pickupaddress= (EditText)findViewById(R.id.editTextpickup);
		Destinationaddress = (EditText)findViewById(R.id.editTextdestination);
		Next= (Button)findViewById(R.id.buttongetaddress);
			//ctoaButon= (Button)findViewById(R.id.buttonctoa);

				
				//geocoder = new Geocoder(this, Locale.ENGLISH);
		mMap = ((MapFragment) getFragmentManager().findFragmentById(
				R.id.fragmentmap)).getMap();
		mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
		mMap.setMyLocationEnabled(true);
		CameraUpdate cam = CameraUpdateFactory.newLatLngZoom(LOCATION_SCHOOL, 17);
        mMap.animateCamera(cam);
		Next.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//String customerpickupaddr = Pickupaddress.getText().toString();
               // String customerdestinationaddr= Destinationaddress.getText().toString();
                
               
              
                // Check for empty data in the form
               if (Pickupaddress.length() > 0 ) {
            	   
                   // Launch main activity
                 Intent intent = new Intent(getApplicationContext(),
                		 Timer_Dater.class);
                           startActivity(intent);}
                             //finish();}
            	  
                else {
                    // Prompt user to enter credentials
                    Toast.makeText(getApplicationContext(),
                            "Please enter the pickup address!", Toast.LENGTH_LONG).show();}
               
}
			
			;
		});}}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				/*// TODO Auto-generated method stub
				List<Address> addresses;
				try {
				addresses =geocoder.getFromLocationName(addressText.getText().toString(),1);
	Address address = addresses.get(0);
	Double latitudeScaled = new Double(address.getLatitude())*1E6;
	Double longitudeScaled = new Double(address.getLongitude())*1E6;
	int latitudeInt = latitudeScaled.intValue();
	int longitudeInt = longitudeScaled.intValue();
	GeoPoint targetPoint =new GeoPoint(latitudeInt,longitudeInt);
	mapController.setCenter(targetPoint);
	mapController.setZoom(21);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				*/
			/**Log.v("Geocoder",e.toString());
			}**/
		//}
			
			//;
		//});}}
		/**{
			
		public void onClick(View arg0){
		/**if(arg0.getId()==R.id.buttonatoc){
			//Log.v("Geocoder", "a_to_c");**/
			/**List<Address> addresses;
			try {
			addresses =geocoder.getFromLocationName(addressText.getText().toString(),1);
Address address = addresses.get(0);
Double latitudeScaled = new Double(address.getLatitude())*1E6;
Double longitudeScaled = new Double(address.getLongitude())*1E6;
int latitudeInt = latitudeScaled.intValue();
int longitudeInt = longitudeScaled.intValue();
GeoPoint targetPoint =new GeoPoint(latitudeInt,longitudeInt);
mapController.setCenter(targetPoint);
mapController.setZoom(21);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		/**Log.v("Geocoder",e.toString());
		}**/
//	}
		/**else if(arg0.getId()==R.id.buttonctoa){
			Log.v("Geocoder", "c_to_a");
			GeoPoint mapCenter =mMap.getMapCenter();
			double latitude =(mapCenter.getLatitudeE6()*1.0)/1E6;
			double longitude =(mapCenter.getLongitudeE6()*1.0)/1E6;
			
		}**/
//}});}}**/
