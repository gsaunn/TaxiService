package com.ogomegbulam.clara;

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

public class RegisterActivity extends Activity {
	  private static final String TAG = RegisterActivity.class.getSimpleName();
	private Button btnRegister;
    private TextView btnLinkToLogin;
    private EditText inputFullName;
    private EditText inputEmail;
    private EditText phonenumber;
    private EditText inputPassword;
    private ProgressDialog pDialog;
    private SessionManager session;
    private SQLiteHandler db;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		 inputFullName = (EditText) findViewById(R.id.registeration_name);
	        inputEmail = (EditText) findViewById(R.id.registration_email);
	        inputPassword = (EditText) findViewById(R.id.reg_password);
	        phonenumber =(EditText) findViewById(R.id.reg_phone);
	        btnRegister = (Button) findViewById(R.id.Register_button);
	        btnLinkToLogin = (TextView) findViewById(R.id.linktologin);
	     // Session manager
	        session = new SessionManager(getApplicationContext());
	 
	        // SQLite database handler
	        db = new SQLiteHandler(getApplicationContext());
	 
	        // Check if user is already logged in or not
	        if (session.isLoggedIn()) {
	            // User is already logged in. Take him to main activity
	            Intent intent = new Intent(RegisterActivity.this,
	                    MainActivity.class);
	            startActivity(intent);
	            finish();
	        }
	 
	        // Register Button Click event
	        btnRegister.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View view) {
	                String name = inputFullName.getText().toString();
	                String email = inputEmail.getText().toString();
	                String password = inputPassword.getText().toString();
	                String phoneno = phonenumber.getText().toString();
	                if (!name.isEmpty() && !email.isEmpty() && !password.isEmpty()&&!phoneno.isEmpty()) {
	                    db.addUser(name, email, password, null);//addUser(name, email, password);
	                    Intent intent = new Intent(
	                            RegisterActivity.this,
	                            LoginActivity.class);
	                    startActivity(intent);
	                    finish();
	                } else {
	                    Toast.makeText(getApplicationContext(),
	                            "Please enter your details!", Toast.LENGTH_LONG)
	                            .show();
	                }
	            }
	        });
		  
	        
	        // Listening to Login Screen link
	        btnLinkToLogin.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// Switching to Login Screen/closing register screen
					 Intent i = new Intent(getApplicationContext(),
		                        LoginActivity.class);
		                startActivity(i);
					finish();
				}
			});
	}
}
