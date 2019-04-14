package com.example.hackathon19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
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

    public void cowsayPressed(View v)
    {
        Intent i = new Intent(this, cowsay.class);
        this.startActivity(i);
    }

    public void editCowPressed(View v)
    {
        Intent i = new Intent(this, EditCow.class);
        this.startActivity(i);
    }

    public void ProfilePressed(View v)
    {
        Intent i = new Intent(this, Profile.class);
        this.startActivity(i);
    }
}
