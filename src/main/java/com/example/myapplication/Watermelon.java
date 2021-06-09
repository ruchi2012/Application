package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Watermelon extends AppCompatActivity {
    ImageView img;
    ImageView left;
    MediaPlayer media;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watermelon);
        img=findViewById(R.id.re);
        left=findViewById(R.id.le);
        media=MediaPlayer.create(getApplicationContext(),R.raw.watermelon);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Pineapple.class);
                startActivity(i);
            }
        });
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(l);
            }
        });

    }

    public void playIt(View view) {            media.start();

    }
}