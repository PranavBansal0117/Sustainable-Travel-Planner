package com.example.travelplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SingaporeD extends AppCompatActivity {

    private Button btn21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singapore_d);
        btn21 = (Button) findViewById(R.id.btn21);
        btn21.setOnClickListener(new View.OnClickListener() {
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