package com.example.travelplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PopularDestinations extends AppCompatActivity {

    private ImageButton btn16;
    private ImageButton btn17;
    private ImageButton btn18;
    private ImageButton btn19;
    private ImageButton btn20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular_destinations);

        btn16 = (ImageButton) findViewById(R.id.btn16);
        btn17 = (ImageButton) findViewById(R.id.btn17);
        btn18 = (ImageButton) findViewById(R.id.btn18);
        btn19 = (ImageButton) findViewById(R.id.btn19);
        btn20 = (ImageButton) findViewById(R.id.btn20);

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openSingapore();

            }
        });

        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openIndia();

            }
        });

        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openDubai();

            }
        });

        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openNewYork();

            }
        });

        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openMalaysia();

            }
        });
    }

    public void openSingapore() {

        Intent intent = new Intent(this, SingaporeD.class);
        startActivity(intent);

    }

    public void openIndia() {

        Intent intent = new Intent(this, IndiaD.class);
        startActivity(intent);

    }

    public void openDubai() {

        Intent intent = new Intent(this, DubaiD.class);
        startActivity(intent);

    }

    public void openNewYork() {

        Intent intent = new Intent(this, NewYorkD.class);
        startActivity(intent);

    }

    public void openMalaysia() {

        Intent intent = new Intent(this, MalaysiaD.class);
        startActivity(intent);

    }
}