package strathmore.edu.testing;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Signup extends AppCompatActivity {

    EditText fname;
    EditText lname;
    EditText phone;
    EditText email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fname = (EditText) findViewById(R.id.fname);
        lname = (EditText) findViewById(R.id.lname);
        phone = (EditText) findViewById(R.id.phone);
        email = (EditText) findViewById(R.id.email);

        final Button suButton = (Button) findViewById(R.id.signupbutton);
        suButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent createAccount = new Intent(Signup.this,Home.class);
                createAccount.putExtra("fname",fname.getText().toString());
                createAccount.putExtra("lname",lname.getText().toString());
                createAccount.putExtra("phone",phone.getText().toString());
                createAccount.putExtra("email",email.getText().toString());
                startActivity(createAccount);
            }
        });
    }

}
