package com.iezview.tour.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.iezview.tour.entity.Coach;
import com.tour.ydt.R;

public class CoachActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coach);
        Coach coach = (Coach) getIntent().getSerializableExtra("coach");
        
    }
}
