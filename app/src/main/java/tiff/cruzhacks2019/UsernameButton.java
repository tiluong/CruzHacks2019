package tiff.cruzhacks2019;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.support.annotation.Nullable;

public class UsernameButton extends AppCompatActivity {

    TextView note1;
    TextView note2;
    EditText nameInput;
    EditText pwInput;
    Button submitButton;
    String user;
    String pw;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = getIntent();
        String name = i.getStringExtra("name");
        android.support.v7.app.ActionBar mActionBar = getSupportActionBar();
        mActionBar.setTitle(name);
        setContentView(R.layout.activity_username);

        note1 = (TextView) findViewById(R.id.createText);
        note2 = (TextView) findViewById(R.id.textView);

        nameInput = (EditText) findViewById(R.id.editText);

        submitButton = (Button) findViewById(R.id.button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user = nameInput.getText().toString();
                pw = pwInput.getText().toString();
//                password1 = passInput.getText().toString();
//                password2 = pass2Input.getText().toString();

//                if (password1.compareTo(password2)!=0 ){
//                    Toast.makeText(VolunteerButton.this,
//                            "Passwords do not match!",
//                            Toast.LENGTH_SHORT).show();
//                }
//                showToast(email);
                // Intent i = new Intent(UsernameButton.this);
//                startActivity(i);
            }
        });
    }
}
