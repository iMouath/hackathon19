package com.example.hackathon19;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {

    private TextView name;
    private ImageView pFP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);
        this.name = (TextView)this.findViewById(R.id.nameTV);
        this.pFP = (ImageView)this.findViewById(R.id.homePfp);

        //TODO: this.name set to firebase name
        //TODO: this.pFP set to firebase picture
    }
}
