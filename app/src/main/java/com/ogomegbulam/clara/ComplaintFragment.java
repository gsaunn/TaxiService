package com.ogomegbulam.clara;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ComplaintFragment extends Fragment{
	EditText submitt;
	Button  submitbtn;
public ComplaintFragment(){}



@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_complaint, container, false);
       
      submitt=  (EditText)rootView.findViewById(R.id.editTextcomplain);
      submitbtn=(Button)rootView.findViewById(R.id.submitgreen);
      submitbtn.setOnClickListener(new OnClickListener(){
      @Override
              public void onClick(View v){
    	 
    	  {if (submitt.getText().toString().trim().length()==0){
    		  Toast.makeText(getActivity(), "please type in the space", Toast.LENGTH_SHORT).show();
    	  }
    	  else { Toast.makeText(getActivity(), "please submit", Toast.LENGTH_SHORT).show();}; 
    	  }
    	  
    	  
      }});    	  
      
        return rootView;
    }

}
