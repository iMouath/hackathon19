package com.example.hackathon19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class cowsay extends AppCompatActivity {

    private EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cowsay);
        this.input = (EditText)this.findViewById(R.id.sayInput);
    }

    public void sayPressed(View v)
    {
        Intent i = new Intent(this, cowsaycow.class);
        i.putExtra("INPUT", input.getText().toString());
        this.startActivity(i);
    }
}
