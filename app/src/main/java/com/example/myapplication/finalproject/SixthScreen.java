package com.example.myapplication.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SixthScreen extends AppCompatActivity {

    Button gogogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_screen);
        gogogo = (Button) findViewById(R.id.gogogo);


        gogogo.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(SixthScreen.this, FifthScreen.class);

                startActivity(intent);
            }
        });

    }
}
