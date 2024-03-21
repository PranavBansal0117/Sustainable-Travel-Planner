package com.example.travelplanner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MyPlansPage extends AppCompatActivity {

    private Button btn32;
    private Button btn33;
    private Button btn34;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_my_plans_page);
        btn32 = (Button) findViewById(R.id.btn32);
        btn33 = (Button) findViewById(R.id.btn33);
        btn34 = (Button) findViewById(R.id.btn34);
        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openHaw();

            }
        });
        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openAus();

            }
        });
        btn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openCan();

            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void openHaw() {
        Intent intent = new Intent(this, Hawaii.class);
        startActivity(intent);
    }
    public void openAus() {
        Intent intent = new Intent(this, Australia.class);
        startActivity(intent);
    }
    public void openCan() {
        Intent intent = new Intent(this, Canada.class);
        startActivity(intent);
    }
}