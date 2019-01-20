package tiff.cruzhacks2019;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
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
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    // Home page of the app asks user to Sign In or Sign Up to Menter.
//    Button signinButton;
//    Button signupButton;

    String inputText;
    EditText inputt;
//    SharedPreferences prefs = this.getSharedPreferences(
//            "tiff.cruzhacks2019", Context.MODE_PRIVATE);


//    public Button but1;
//    public void init() {
//        but1 = (Button)findViewById(R.id.signinbtn);
//        but1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent dropDown = new Intent(this, SignUp2.class);
//            }
//        });
//    }

    private Button b_signup;
    private Button b_signin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // init();

//----------------
        //submit button
        Button submit = (Button) findViewById(R.id.signupbtn);
//        inputt = (EditText) findViewById(R.id.input);
//
//        submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                //To edit shared preferences use editor as follows
////                SharedPreferences.Editor editor = prefs.edit();
////                editor.putString("key","value");
////                editor.commit();
//
//                inputText = inputt.getText().toString();
//            }
//        });

//-----------------

//        signinButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Intent myIntent = new Intent(MainActivity.this);
////
////                startActivity(myIntent);
//            }
//        });
//        signupButton.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
////
////                Intent myIntent = new Intent(MainActivity.this);
////
////                startActivity(myIntent);
//            }
//        });


        //**************** Link MENTOR --> SIGN UP MENTOR DROPDOWN ****************
//        private Button mentorButton;
//        mentorButton = (Button)findViewById(R.id.signinbtn);
//        mentorButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openDropDownPage();
//            }
//        });
//
//        public void openDropDownPage(){
////            Intent intent = new Intent(this, SignUp2.class);
////            startActivity(intent);
//        }



        //**************** DROP DOWN MENU FOR MENTOR SIGN UP ****************
//        Spinner mentorSpinner = (Spinner) findViewById(R.id.spinner);
//        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity.this,
//                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.schools));
//        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        mentorSpinner.setAdapter(myAdapter);

    }
//    @Override
//    protected void onStart() {
//        super.onStart();
//    }
//    @Override
//    protected void onResume() {
//        super.onResume();
//
//    }
//
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//    }


}
