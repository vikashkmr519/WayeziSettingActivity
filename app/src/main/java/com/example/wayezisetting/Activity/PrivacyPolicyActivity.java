package com.example.wayezisetting.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.wayezisetting.R;

public class PrivacyPolicyActivity extends AppCompatActivity {

    TextView privacyHeading, fulltext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);
        privacyHeading = findViewById(R.id.privacyHeading);
        fulltext = findViewById(R.id.fulltext);
    }
}