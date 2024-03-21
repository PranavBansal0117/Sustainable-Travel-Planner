package com.example.travelplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SettingsPage extends AppCompatActivity {

    private Button btn36;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_page);
        btn36 = (Button) findViewById(R.id.btn36);
        btn36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openLogin();

            }
        });
    }
    public void openLogin() {
        Intent intent = new Intent(this, LoginPage.class);
        startActivity(intent);
        Toast.makeText(SettingsPage.this, "User Successfully Logged Out!", Toast.LENGTH_SHORT).show();
    }
}