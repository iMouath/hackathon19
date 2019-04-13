package com.example.hackathon19;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class cowsaycow extends AppCompatActivity {

    private TextView currCow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cowsaycow);
        this.currCow = (TextView)this.findViewById(R.id.cowtext);
        //TODO: this.currCow set to firebase Cow
    }
}
