package com.example.wayezisetting.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.wayezisetting.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class SchoolSettingActivity extends AppCompatActivity {

    TextInputEditText childName, childAge,parentName,schoolName,classtext,schoolAddress,busnum;
    TextView childText,SchoolText;
    TextInputLayout name, age,parent,school,address,schoolClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_setting);
        childAge = findViewById(R.id.childAge);
        parentName = findViewById(R.id.parentName);
        childName = findViewById(R.id.childName);
        schoolName = findViewById(R.id.schoolName);
        schoolAddress = findViewById(R.id.schoolAddress);
        classtext = findViewById(R.id.classtext);
        busnum = findViewById(R.id.busnum);
        childText = findViewById(R.id.childSetting);
        SchoolText = findViewById(R.id.schoolsetting);
        name = findViewById(R.id.TILNAME);
        age = findViewById(R.id.TILAGE);
        parent = findViewById(R.id.TILParentName);
        school = findViewById(R.id.TILschoolName);
        address = findViewById(R.id.TILaddress);
        schoolClass = findViewById(R.id.TILclass);
    }
}