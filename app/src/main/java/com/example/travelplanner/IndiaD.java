package com.example.travelplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IndiaD extends AppCompatActivity {

    private Button btn22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_india_d);

        btn22 = (Button) findViewById(R.id.btn22);
        btn22.setOnClickListener(new View.OnClickListener() {
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