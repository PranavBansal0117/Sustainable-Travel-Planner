package com.example.travelplanner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUpPage extends AppCompatActivity {


    private Button btn7;
    private EditText et1;
    private EditText et2;
    private EditText et3;
    private EditText et4;
    private EditText et5;
    private EditText et6;

    FirebaseAuth fAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);

        btn7 = (Button) findViewById(R.id.btn7);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        et4 = (EditText) findViewById(R.id.et4);
        et6 = (EditText) findViewById(R.id.et6);
        fAuth = FirebaseAuth.getInstance();

        if(fAuth.getCurrentUser() != null){
            openLogin();
            finish();
        }
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = et1.getText().toString().trim();
                String email = et2.getText().toString().trim();
                String mn = et3.getText().toString().trim();
                String pass = et4.getText().toString().trim();
                String add = et6.getText().toString().trim();

                if(TextUtils.isEmpty(name)) {
                    et1.setError("Name is required.");
                    return;
                }
                if(TextUtils.isEmpty(email)) {
                    et2.setError("Email is required.");
                    return;
                }
                if(TextUtils.isEmpty(mn)) {
                    et3.setError("Mobile Number is required.");
                    return;
                }
                if(TextUtils.isEmpty(pass)) {
                    et4.setError("Password is required.");
                    return;
                }

                if(TextUtils.isEmpty(add)) {
                    et6.setError("Address is required.");
                    return;
                }

                fAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()) {
                            Toast.makeText(SignUpPage.this, "User Created", Toast.LENGTH_SHORT).show();
                            openLogin();
                        }
                        else{
                            Toast.makeText(SignUpPage.this, "Error!" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });



            }
        });
    }


    public void openLogin() {

        Intent intent = new Intent(this, LoginPage.class);
        startActivity(intent);

    }
}