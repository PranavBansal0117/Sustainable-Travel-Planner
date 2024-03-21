package com.example.travelplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DubaiD extends AppCompatActivity {

    private Button btn23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dubai_d);

        btn23 = (Button) findViewById(R.id.btn23);
        btn23.setOnClickListener(new View.OnClickListener() {
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