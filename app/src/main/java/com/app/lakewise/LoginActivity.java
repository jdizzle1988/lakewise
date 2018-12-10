package com.app.lakewise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button;
        Button button1;
        button = (Button) findViewById(R.id.btnViewRegion);
        button1 = (Button) findViewById(R.id.btnLogin);

        // Capture button clicks
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent ViewRegion = new Intent(LoginActivity.this, RegionsActivity.class);
                startActivity(ViewRegion);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent ViewClubs = new Intent(LoginActivity.this, ClubActivity.class);
                startActivity(ViewClubs);
            }
        });
    }
}
