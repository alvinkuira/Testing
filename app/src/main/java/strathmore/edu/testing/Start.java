package strathmore.edu.testing;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import static strathmore.edu.testing.R.id.username;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button lgnButton = (Button) findViewById(R.id.login);
        lgnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(Start.this,Home.class);
                //login.putExtra("username",username.getText().toString());
                startActivity(login);
            }
        });
        Button caButton = (Button) findViewById(R.id.createaccount);
        caButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent createAccount = new Intent(Start.this,Signup.class);
                //login.putExtra("username",username.getText().toString());
                startActivity(createAccount);
            }
        });
    }
}
