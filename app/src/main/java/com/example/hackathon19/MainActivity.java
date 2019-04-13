package com.example.hackathon19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseApp.initializeApp(this);

        mAuth = FirebaseAuth.getInstance();

        FirebaseUser currentUser = mAuth.getCurrentUser();

        if (currentUser != null) {
            System.out.println(currentUser.getUid());
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
