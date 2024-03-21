package com.example.travelplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class ConfirmSuccessfulPage extends AppCompatActivity {

    private Button btn37;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_successful_page);
        btn37 = (Button) findViewById(R.id.btn37);
        btn37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openHome();

            }
        });

    }
    public void openHome() {

        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
        Toast.makeText(ConfirmSuccessfulPage.this, "Returned to Home Page!", Toast.LENGTH_SHORT).show();

    }

}