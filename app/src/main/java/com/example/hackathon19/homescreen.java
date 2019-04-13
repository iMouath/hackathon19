package com.example.hackathon19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class homescreen extends AppCompatActivity {

    private TextView nameTxt;
    private ImageView avatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);
        this.nameTxt = (TextView)this.findViewById(R.id.nameTV);
        this.avatar = (ImageView)this.findViewById(R.id.homePfp);
        //TODO: this.nameTxt = firebase name
        //TODO: this.avatar = firebase picture
    }

    public void onProfileBtnPressed(View v)
    {
        Intent i = new Intent(this, Profile.class);
        this.startActivity(i);
    }
}
