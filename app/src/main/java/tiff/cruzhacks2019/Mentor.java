package tiff.cruzhacks2019;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Mentor extends AppCompatActivity {
    // The Sign Up process lets students select their level of education
    // High School, College, Graduate Student.
    // Graduate and college students can be mentors.
    // College and high school students can be mentees.

    private Button mentorButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup1);

        mentorButton = (Button) findViewById(R.id.mentor_btn);

        mentorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Mentor.this, SignUp.class);

                startActivity(myIntent);
            }
        });

    }

}


