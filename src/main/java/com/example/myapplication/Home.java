package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    EditText txt;
    TextView vw,fr;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        txt=findViewById(R.id.edit);
        vw=findViewById(R.id.txt);
        bt=findViewById(R.id.btn);
        fr=findViewById(R.id.textView4);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result=txt.getText().toString();
                vw.setText(result);
            }
        });
        fr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this,MainActivity.class);
                startActivity(i);
            }
        });

    }

}