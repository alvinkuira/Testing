package strathmore.edu.testing;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Home extends AppCompatActivity {

    TextView fnameText;
    TextView lnameText;
    TextView phoneText;
    TextView emailText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fnameText = (TextView) findViewById(R.id.fname);
        lnameText = (TextView) findViewById(R.id.lname);
        phoneText = (TextView) findViewById(R.id.phone);
        emailText = (TextView) findViewById(R.id.email);
        Intent intent = getIntent();

        String fname = intent.getStringExtra("fname");
        String lname = intent.getStringExtra("lname");
        String phone = intent.getStringExtra("phone");
        String email = intent.getStringExtra("email");


        fnameText.setText(String.format("First Name: %s", fname));
        lnameText.setText(String.format("Last Name: %s", lname));
        phoneText.setText(String.format("Phone Number: %s", phone));
        emailText.setText(String.format("Email: %s", email));

    }

}
