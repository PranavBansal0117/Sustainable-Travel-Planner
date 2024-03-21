package com.example.travelplanner;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.travelplanner.databinding.ActivityConfirmUnsuccessfulPageBinding;

public class ConfirmUnsuccessfulPage extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityConfirmUnsuccessfulPageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}