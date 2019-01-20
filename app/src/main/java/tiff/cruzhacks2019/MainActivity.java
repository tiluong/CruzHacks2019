package tiff.cruzhacks2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    // Home page of the app asks user to Sign In or Sign Up to Menter.
    Button signinButton;
    Button signupButton;


    // Create actions for buttons.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        signinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent myIntent = new Intent(MainActivity.this);
//
//                startActivity(myIntent);
            }
        });
        signupButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
//
//                Intent myIntent = new Intent(MainActivity.this);
//
//                startActivity(myIntent);
            }
        });
    }
}
