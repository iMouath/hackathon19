package com.example.hackathon19;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EditCow extends AppCompatActivity {

    private Button submitBtn;
    private TextView myCow;
    private String cowstring;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editcow);
        this.submitBtn = (Button)this.findViewById(R.id.cowSubmitBtn);
        this.myCow = (TextView)this.findViewById(R.id.Cowtxt);
        cowstring = myCow.getText().toString();
    }

    public void onUploadPressed(View v){
        //TODO: firebase cow set as this.cowstring
    }
}
