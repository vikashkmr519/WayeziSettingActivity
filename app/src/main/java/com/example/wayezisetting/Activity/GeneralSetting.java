package com.example.wayezisetting.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wayezisetting.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;

public class GeneralSetting extends AppCompatActivity {
    TextView emailTv, emialIdText,changePasswordtext;
    TextInputEditText newEmailId, newPassword, confirmPassword;
    ImageView imgEmail,imgPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_setting);

        emailTv = findViewById(R.id.emailTv);
        newEmailId = findViewById(R.id.newEmailId);
        newPassword = findViewById(R.id.newPassword);
        confirmPassword = findViewById(R.id.confirmPassword);
        emialIdText = findViewById(R.id.emailId);
        changePasswordtext = findViewById(R.id.changePassword);

    }

}