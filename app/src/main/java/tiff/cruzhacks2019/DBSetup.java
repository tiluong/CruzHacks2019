package tiff.cruzhacks2019;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DBSetup extends Activity {
    private DBHelper mydb;
    TextView name ;
    TextView email;
    TextView college;
    TextView major;
    TextView type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_setup);

        mydb = new DBHelper(this);

//        SQLiteDatabase mydatabase = openOrCreateDatabase("your database name",MODE_PRIVATE,null);
////        mydatabase.execSQL("CREATE TABLE IF NOT EXISTS users(type INT, username VARCHAR,password VARCHAR, email VARCHAR, college VARCHAR, major VARCHAR) ;");
//        mydatabase.execSQL(
//                "create table users " +
//                        "(name text,phone text,email text, college text,major text, type int)"
//        );
//        mydatabase.execSQL("INSERT INTO users VALUES('admin','admin');");

        name = (TextView) findViewById(R.id.editTextName);
        email = (TextView) findViewById(R.id.editTextEmail);
        college = (TextView) findViewById(R.id.editTextCollege);
        major = (TextView) findViewById(R.id.editTextMajor);
        type = (TextView) findViewById(R.id.editTextType);
    }
    public void saveUserToDatabase(View view){
        mydb.insertUser(name.getText().toString(), email.getText().toString(), college.getText().toString(),
                major.getText().toString(), Integer.parseInt(type.getText().toString()));
        Toast.makeText(getApplicationContext(), "YAYAYAYA",
                Toast.LENGTH_SHORT).show();
    }

}
