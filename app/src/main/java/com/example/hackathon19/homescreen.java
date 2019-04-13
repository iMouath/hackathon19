package com.example.hackathon19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class homescreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);
    }

    public void onProfileBtnPressed(View v)
    {
        Intent i = new Intent(this, Profile.class);
        this.startActivity(i);
    }
}
