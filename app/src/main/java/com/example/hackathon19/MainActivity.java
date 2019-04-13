package com.example.hackathon19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.FirebaseApp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        FirebaseApp.initializeApp(this);

        FirebaseApp firebaseApp = FirebaseApp.initializeApp(MainActivity.this);

        if (firebaseApp != null) {
            System.out.println(firebaseApp.getOptions());
        }

    }
    public void onExitButtonClicked(View v)
    {
        Button b = (Button)v;
        Intent myIntent = new Intent(MainActivity.this, LoginActivity.class);
//        myIntent.putExtra("key", value); //Optional parameters
        MainActivity.this.startActivity(myIntent);
    }


}
