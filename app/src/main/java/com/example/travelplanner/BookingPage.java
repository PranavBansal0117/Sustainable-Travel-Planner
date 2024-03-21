package com.example.travelplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BookingPage extends AppCompatActivity {

    public Button btn28;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_page);

        btn28 = (Button) findViewById(R.id.btn28);
        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openBooking2();

            }
        });
    }
    public void openBooking2() {

        Intent intent = new Intent(this, BookingPage2.class);
        startActivity(intent);

    }
}