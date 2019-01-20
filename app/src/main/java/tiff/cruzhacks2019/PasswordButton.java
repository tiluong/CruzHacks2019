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

public class PasswordButton extends AppCompatActivity {
    TextView note1;
    TextView note2;
    EditText passInput;
    Button submitButton;
    String pw;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = getIntent();
        String name = i.getStringExtra("name");
        android.support.v7.app.ActionBar mActionBar = getSupportActionBar();
        mActionBar.setTitle(name);
        setContentView(R.layout.activity_password;

        note1 = (TextView)findViewById(R.id.passText);
        note2 = (TextView)findViewById(R.id.textView2);

        passInput = (EditText) findViewById(R.id.passText);

        nextButton = (Button) findViewById(R.id.button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pw = passInput.getText().toString();
                // Intent i = new Intent(PasswordButton.this);
//                startActivity(i);
            }
        });
}
