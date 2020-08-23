package com.example.wayezisetting.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.wayezisetting.R;

public class WayeziFAQAcitvity extends AppCompatActivity {

    TextView q1,q2,q3,q4,q5,q6,faqTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wayezi_f_a_q_acitvity);

        q1 = findViewById(R.id.q1);
        q2 = findViewById(R.id.q2);
        q3 = findViewById(R.id.q3);
        q4 = findViewById(R.id.q4);
        q5 = findViewById(R.id.q5);
        q6 = findViewById(R.id.q6);
        faqTv = findViewById(R.id.faqTv);
    }
}