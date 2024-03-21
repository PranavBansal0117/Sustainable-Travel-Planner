package com.example.travelplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class HomePage extends AppCompatActivity {

    private ImageButton btn9;
    private ImageButton btn10;
    private ImageButton btn8;
    private ImageButton btn13;
    private Button btn11;
    private ImageButton btn12;
    private ImageButton btn15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        btn9 = (ImageButton) findViewById(R.id.btn9);
        btn15 = (ImageButton) findViewById(R.id.btn15);
        btn8 = (ImageButton) findViewById(R.id.btn8);
        btn10 = (ImageButton) findViewById(R.id.btn10);
        btn13 = (ImageButton) findViewById(R.id.btn13);
        btn11 = (Button) findViewById(R.id.btn11);
        btn12 = (ImageButton) findViewById(R.id.btn12);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openBooking();

            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openHome();

            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openSettings();

            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openPopular();

            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openFootprint();

            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openPopular();

            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openPopular();

            }
        });
    }

    public void openBooking() {

        Intent intent = new Intent(this, BookingPage.class);
        startActivity(intent);

    }

    public void openHome() {

        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);

    }

    public void openPopular() {

        Intent intent = new Intent(this, PopularDestinations.class);
        startActivity(intent);
    }

    public void openFootprint() {
        Intent intent = new Intent(this, Footprint1.class);
        startActivity(intent);
    }
    public void openMyPlans() {
        Intent intent = new Intent(this, MyPlansPage.class);
        startActivity(intent);
    }
    public void openSettings() {
        Intent intent = new Intent(this, SettingsPage.class);
        startActivity(intent);
    }

}