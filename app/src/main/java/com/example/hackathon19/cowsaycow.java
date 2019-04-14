package com.example.hackathon19;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class cowsaycow extends AppCompatActivity {

    private TextView currCow;
    private TextView sayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cowsaycow);
        this.currCow = (TextView)this.findViewById(R.id.cowtext);
        currCow.setText(cowgen.generate());
        this.sayText = (TextView)this.findViewById((R.id.saytext));
        sayText.setText(getIntent().getStringExtra("INPUT"));

    }
}
