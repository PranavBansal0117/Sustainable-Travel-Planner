package com.example.travelplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginPage extends AppCompatActivity {

    private Button btn4;
    private Button btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        btn4 = (Button) findViewById(R.id.btn4);
        btn6 = (Button) findViewById(R.id.btn6);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openHome();

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openSignUp();

            }
        });

    }

    public void openHome() {

        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);

    }
    public void openSignUp() {

        Intent intent = new Intent(this, SignUpPage.class);
        startActivity(intent);

    }
}