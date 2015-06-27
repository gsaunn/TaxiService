package com.ogomegbulam.clara;

import java.util.HashMap;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends Activity {
	private Button btnLogin;
    private TextView btnLinkToRegister;
    private EditText inputEmail;
    private EditText inputPassword;
    private ProgressDialog pDialog;
    private SessionManager session;
    private SQLiteHandler db;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		
		 inputEmail = (EditText) findViewById(R.id.email_login);
	        inputPassword = (EditText) findViewById(R.id.password_login);
	        btnLogin = (Button) findViewById(R.id.Loginbt);
	        btnLinkToRegister = (TextView) findViewById(R.id.linktoregister);
	        db = new SQLiteHandler(getApplicationContext());
	     // Session manager
	        session = new SessionManager(getApplicationContext());
	 
	        // Check if user is already logged in or not
	        if (session.isLoggedIn()) {
	            // User is already logged in. Take him to main activity
	            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
	            startActivity(intent);
	            finish();
	        }
	 
	        // Login button Click Event
	        btnLogin.setOnClickListener(new View.OnClickListener() {
	 
	            @Override
				public void onClick(View view) {
	                String Eemail = inputEmail.getText().toString();
	                String password = inputPassword.getText().toString();
	                HashMap<String, String> user = db.getUserDetails();
	                String name = user.get("name");
	                String email = user.get("email");
	                String passwordd = user.get("password");
	               
	              
	                // Check for empty data in the form
	               if (Eemail.trim().length() > 0 && password.trim().length() > 0) {
	            	   if(password.equalsIgnoreCase(passwordd)&&Eemail.equalsIgnoreCase(email))
	            	   {session.setLogin(true);
	                   
	                   // Launch main activity
	                 Intent intent = new Intent(LoginActivity.this,
	                          MainActivity.class);
	                           startActivity(intent);
	                             finish();}
	            	   else { Toast.makeText(getApplicationContext(),
	                           "Invalid email or password!", Toast.LENGTH_LONG)
	                           .show();}}
	                    // login user
	                    //checkLogin(email, password);
	                else {
	                    // Prompt user to enter credentials
	                    Toast.makeText(getApplicationContext(),
	                            "Please enter the credentials!", Toast.LENGTH_LONG)
	                            .show();
	                }
	            }
	 
	        });
	 
		 //TextView registerScreen = (TextView) findViewById(R.id.linktoregister);
		  // Listening to register new account link
	        btnLinkToRegister.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View v) {
					// Switching to Register screen
					Intent i = new Intent(getApplicationContext(), RegisterActivity.class);
					startActivity(i);
				}
			});
	}
}
