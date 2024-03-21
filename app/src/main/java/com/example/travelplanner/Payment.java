package com.example.travelplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Payment extends AppCompatActivity {

    private Button btn27;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        btn27 = (Button) findViewById(R.id.btn27);
        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openSuccess();

            }
        });

    }

    public void openSuccess() {
        Intent intent = new Intent(this, ConfirmSuccessfulPage.class);
        startActivity(intent);
    }
}