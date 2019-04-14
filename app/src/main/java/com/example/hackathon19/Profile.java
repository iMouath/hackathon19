package com.example.hackathon19;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.IOException;


public class Profile extends AppCompatActivity {

    public static final int RESULT_LOAD_IMG = 1;
    private ImageView avatar;
    private Button saveButton;
    private TextView nametxt, emailtxt, pwtxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        this.avatar =(ImageView)this.findViewById(R.id.currAvatar);
        this.saveButton = (Button)this.findViewById(R.id.saveBtn);
        this.nametxt = (TextView)this.findViewById(R.id.nameText);
        this.emailtxt = (TextView)this.findViewById(R.id.emailText);
        this.pwtxt = (TextView)this.findViewById(R.id.pwText);
    }

    public void onGetImageClick(View v)
    {
        Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
        photoPickerIntent.setType("image/*");
        startActivityForResult(photoPickerIntent, RESULT_LOAD_IMG);
    }

    @Override
    protected void onActivityResult(int reqCode, int resultCode, Intent data) {
        super.onActivityResult(reqCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            try {
                Uri picture = data.getData();

                Bitmap bmp = null;
                bmp = MediaStore.Images.Media.getBitmap(this.getContentResolver(), picture);
                avatar.setImageBitmap(bmp);
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
                Toast.makeText(this, "Something went wrong", Toast.LENGTH_LONG).show();
            }
            catch (IOException e) {
                e.printStackTrace();
                Toast.makeText(this, "Something went wrong", Toast.LENGTH_LONG).show();
            }

        }
        else {
            Toast.makeText(this, "You haven't picked Image",Toast.LENGTH_LONG).show();
        }
    }

    public void onSaveBtnClick(View v){
        //TODO: firebase email set to this.emailtxt
        //TODO: firebase name set to this.nametxt
        //TODO: firebase P/W set to this.pwtxt
        //TODO: firebase picture set to this.avatar
        this.finish();
    }
}
