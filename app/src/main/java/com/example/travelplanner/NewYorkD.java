package com.example.travelplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewYorkD extends AppCompatActivity {

    private Button btn24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_york_d);
        btn24 = (Button) findViewById(R.id.btn24);
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openPayment();

            }
        });
    }
    public void openPayment() {
        Intent intent = new Intent(this, Payment.class);
        startActivity(intent);
    }
}