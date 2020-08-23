package com.example.wayezisetting.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wayezisetting.R;
import com.google.android.material.textfield.TextInputEditText;

public class ProfileSettingsActivity extends AppCompatActivity {

    ImageView profileImg;
    TextInputEditText username;
    TextView profileSettingHeading, usernameTv;
    CardView imgCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_settings);

        profileImg = findViewById(R.id.profileImg);
        username = findViewById(R.id.username);
        profileSettingHeading = findViewById(R.id.profileSettingHeading);
        imgCard = findViewById(R.id.imgCard);
        usernameTv = findViewById(R.id.usernameTv);


    }
}