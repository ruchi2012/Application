package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Grapes extends AppCompatActivity {
    ImageView img,left;
    MediaPlayer media;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grapes);
        img=findViewById(R.id.re);
        left=findViewById(R.id.le);
        media=MediaPlayer.create(getApplicationContext(),R.raw.grapes);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Mango2.class);
                startActivity(i);
            }
        });
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l=new Intent(getApplicationContext(),Strawberry.class);
                startActivity(l);
            }
        });
    }

    public void playIt(View view) {
        media.start();


    }
}