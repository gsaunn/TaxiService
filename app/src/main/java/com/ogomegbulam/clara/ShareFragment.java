package com.ogomegbulam.clara;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class ShareFragment extends Fragment{
     public    ShareFragment (){}
        
ImageButton twitimage;
ImageButton smsimage;
ImageButton otherimage;
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			 View rootView = inflater.inflate(R.layout.fragment_share, container, false);
	  twitimage =(ImageButton)rootView.findViewById(R.id.imagetwwtter);
	  smsimage =(ImageButton)rootView.findViewById(R.id.imageMSSG);
	  otherimage =(ImageButton)rootView.findViewById(R.id.imageotther);
	  
	  
	  twitimage.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			String message ="Text I mtt Jay.";
			Intent share =new Intent(android.content.Intent.ACTION_SEND);
		    share.setType("text/plain");
		     share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
		     share.putExtra(Intent.EXTRA_SUBJECT, "Download Lion Taxi");
		     share.putExtra(Intent.EXTRA_TEXT, "Lion Taxi is an Android Taxi service application which " +
		     		"allow you to get a taxi by a few click. " +
		     		"It takes less than ten minutes for the taxi to arrive. " +
		     		"Download at http//:mntnextappstore.com.ng");
		     startActivity(Intent.createChooser(share, "TELL YOUR FRIEND THROUGH"));		
		}
	});
	   smsimage.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			String message ="Text I mtt Jay.";
			Intent share =new Intent(android.content.Intent.ACTION_SEND);
		    share.setType("text/plain");
		     share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
		     share.putExtra(Intent.EXTRA_SUBJECT, "Download Lion Taxi");
		     share.putExtra(Intent.EXTRA_TEXT, "Lion Taxi is an Android Taxi service application which " +
		     		"allow you to get a taxi by a few click. " +
		     		"It takes less than ten minutes for the taxi to arrive. " +
		     		"Download at http//:mntnextappstore.com.ng");
		     startActivity(Intent.createChooser(share, "TELL YOUR FRIEND THROUGH"));		
		}
	});
	   otherimage.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			String message ="Text I mtt Jay.";
			Intent share =new Intent(android.content.Intent.ACTION_SEND);
		    share.setType("text/plain");
		     share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
		     share.putExtra(Intent.EXTRA_SUBJECT, "Download Lion Taxi");
		     share.putExtra(Intent.EXTRA_TEXT, "Lion Taxi is an Android Taxi service application which " +
		     		"allow you to get a taxi by a few click. " +
		     		"It takes less than ten minutes for the taxi to arrive. " +
		     		"Download at http//:mntnextappstore.com.ng");
		     startActivity(Intent.createChooser(share, "TELL YOUR FRIEND THROUGH"));		
		}
	});
			
			return rootView;}
		

/**private void twtter() {
			// TODO Auto-generated method stub
	String message ="Text I mtt Jay.";
	Intent share =new Intent(android.content.Intent.ACTION_SEND);
    share.setType("text/plain");
     share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
     share.putExtra(Intent.EXTRA_SUBJECT, "Download Lion Taxi");
     share.putExtra(Intent.EXTRA_TEXT, "Lion Taxi is an Android Taxi service application which " +
     		"allow you to get a taxi by a few click. " +
     		"It takes less than ten minutes for the taxi to arrive. " +
     		"Download at http//:mntnextappstore.com.ng");
     startActivity(Intent.createChooser(share, "TELL YOUR FRIEND THROUGH"));	
		}**/


/**@Override
public void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	String message ="Text I mtt Jay.";
		Intent share =new Intent(android.content.Intent.ACTION_SEND);
        share.setType("text/plain");
         share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
         share.putExtra(Intent.EXTRA_SUBJECT, "Download Lion Taxi");
         share.putExtra(Intent.EXTRA_TEXT, "Lion Taxi is an Android Taxi service application which " +
         		"allow you to get a taxi by a few click. " +
         		"It takes less than ten minutes for the taxi to arrive. " +
         		"Download at http//:mntnextappstore.com.ng");
         startActivity(Intent.createChooser(share, "TELL YOUR FRIEND THROUGH"));
         
         
        //**///return rootView;
}


