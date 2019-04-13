package com.example.hackathon19;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    public FirebaseAuth mAuth;

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
//        Button b = (Button)v;
        Intent myIntent = new Intent(MainActivity.this, LoginActivity.class);
//        myIntent.putExtra("key", value); //Optional parameters
        MainActivity.this.startActivityForResult(myIntent, 1);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
                if (resultCode == Activity.RESULT_OK) {
                    FirebaseUser user = (FirebaseUser) data.getExtras().get("firebaseuser");
                    if (user != null) {
                        System.out.println(user.getEmail());
                    }
                    Toast.makeText(this, user.getEmail(),Toast.LENGTH_LONG).show();
                    Intent i = new Intent(MainActivity.this, HomeScreen.class);
                    MainActivity.this.startActivity(i);
                }
    }


}
