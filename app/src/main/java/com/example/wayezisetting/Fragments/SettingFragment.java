package com.example.wayezisetting.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.wayezisetting.Activity.AppThemeSettingActivity;
import com.example.wayezisetting.Activity.ChatThemeActivity;
import com.example.wayezisetting.Activity.GeneralSetting;
import com.example.wayezisetting.Activity.PrivacyPolicyActivity;
import com.example.wayezisetting.Activity.ProfileSettingsActivity;
import com.example.wayezisetting.Activity.SchoolSettingActivity;
import com.example.wayezisetting.Activity.WayeziFAQAcitvity;
import com.example.wayezisetting.R;
import com.google.android.material.card.MaterialCardView;


public class SettingFragment extends Fragment {



    RelativeLayout general,profile,school,appTheme,chatTheme,wayezifaq,privacypolicy,Logout;
    CardView accountCard,themeCard,otherCard;
    public SettingFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_setting, container, false);

        general = view.findViewById(R.id.generalRL);
        profile = view.findViewById(R.id.profileRL);
        school = view.findViewById(R.id.schoolRL);
        appTheme = view.findViewById(R.id.appThemeRL);
        chatTheme = view.findViewById(R.id.chatThemeRL);
        wayezifaq = view.findViewById(R.id.FAQRL);
        privacypolicy = view.findViewById(R.id.privacypolicyRL);
        accountCard = view.findViewById(R.id.accountCard);
        themeCard = view.findViewById(R.id.themeCard);
        otherCard = view.findViewById(R.id.othercard);


        wayezifaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WayeziFAQAcitvity.class);
                startActivity(intent);
            }
        });

        general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), GeneralSetting.class);
                startActivity(intent);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ProfileSettingsActivity.class);
                startActivity(intent);
            }
        });

        school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SchoolSettingActivity.class);
                startActivity(intent);
            }
        });
        appTheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AppThemeSettingActivity.class);
                startActivity(intent);
            }
        });

        chatTheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ChatThemeActivity.class);
                startActivity(intent);
            }
        });

        wayezifaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WayeziFAQAcitvity.class);
                startActivity(intent);

            }
        });

        privacypolicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PrivacyPolicyActivity.class);
                startActivity(intent);

            }
        });



        return view;
    }
}