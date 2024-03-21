package com.example.travelplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Footprint1 extends AppCompatActivity {

    private Button btn26;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_footprint1);
        btn26 = (Button) findViewById(R.id.btn26);
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openFootprint2();

            }
        });
    }
    public void openFootprint2() {
        Intent intent = new Intent(this, FootPrint2.class);
        startActivity(intent);
    }
}