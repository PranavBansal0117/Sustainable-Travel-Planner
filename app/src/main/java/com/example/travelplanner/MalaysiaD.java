package com.example.travelplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MalaysiaD extends AppCompatActivity {

    private Button btn25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malaysia_d);
        btn25 = (Button) findViewById(R.id.btn25);
        btn25.setOnClickListener(new View.OnClickListener() {
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