package com.ogomegbulam.clara;

import java.util.HashMap;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class ProfileFragment extends Fragment{
	public TextView txtName;
    private TextView txtEmail;
	private TextView txtPassword;
    private TextView txtphonenumber;
    private Button btnLogout;
 
    SQLiteHandler db;
    private SessionManager session;

public ProfileFragment(){}
@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);
        txtName = (TextView)rootView.findViewById(R.id.name_profile);
        txtEmail = (TextView)rootView.findViewById(R.id.email_profile);
        btnLogout = (Button)rootView.findViewById(R.id.logout_btn);
        txtPassword =(TextView)rootView.findViewById(R.id.password_profile);
        txtphonenumber =(TextView)rootView.findViewById(R.id.phone_profile);
 
       
 
       
    
 
         
        return rootView;
    }
/* (non-Javadoc)
 * @see android.app.Fragment#onActivityCreated(android.os.Bundle)
 */
@Override
public void onActivityCreated(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	// SqLite database handler
    db = new SQLiteHandler(getActivity());

     //Ssession manager;
   session = new SessionManager(getActivity());
	 if (!session.isLoggedIn()) {
         logoutUser();
     }

     // Fetching user details from sqlite
     HashMap<String, String> user = db.getUserDetails();

     String name = user.get("name");
     String email = user.get("email");
     String phone = user.get("phoneno");
     String password =user.get("password");

     // Displaying the user details on the screen
     txtName.setText(name);
     txtEmail.setText(email);
     txtPassword.setText(password);
     txtphonenumber.setText(phone);

     // Logout button click event
     btnLogout.setOnClickListener(new View.OnClickListener() {

         @Override
         public void onClick(View v) {
             logoutUser();
         }
     });
	super.onActivityCreated(savedInstanceState);
}
private void logoutUser() {
	// TODO Auto-generated method stub
	session.setLogin(false);
	 
    //
	db.deleteUsers();

    // Launching the login activity
    Intent intent = new Intent(getActivity(), LoginActivity.class);
    startActivity(intent);
    //finish();
	
}
// SqLite database handler

// db = new SQLiteHandler();

  //Ssession manager;
// session = new SessionManager(getApplicationContext());
}
