package com.example.wayezisetting.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.wayezisetting.R;
import com.google.android.material.card.MaterialCardView;

public class AppThemeSettingActivity extends AppCompatActivity {

    Button lightBtn, darkBtn;
    MaterialCardView lightcard,darkCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_theme_setting);

        lightBtn = findViewById(R.id.lightBtn);
        darkBtn = findViewById(R.id.darkBtn);
        darkCard = findViewById(R.id.darkcard);
        lightcard = findViewById(R.id.lightCard);


        darkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            }
        });

        lightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            }
        });


    }
}