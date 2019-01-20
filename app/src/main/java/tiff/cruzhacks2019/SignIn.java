package tiff.cruzhacks2019;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.content.Intent;


public class SignIn extends AppCompatActivity {
    // Signing in brings you back to your instant messaging page where you can message
    // your mentors, and/or your mentees.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin); // display the signin XML we created
        android.support.v7.app.ActionBar menu = getSupportActionBar();


    }


}