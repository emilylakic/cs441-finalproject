package com.example.myapplication.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FifthScreen extends AppCompatActivity {

    Button nex;
    Button bac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_screen);
        nex = (Button) findViewById(R.id.nex);
        bac = (Button) findViewById(R.id.bac);

        nex.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(FifthScreen.this, SixthScreen.class);

                startActivity(intent);
            }
        });

        bac.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(FifthScreen.this, FourthScreen.class);

                startActivity(intent);
            }
        });

    }
}
