package com.example.myapplication.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourthScreen extends AppCompatActivity {

    Button nextUp;
    Button goBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_screen);
        nextUp = (Button) findViewById(R.id.nextUp);
        goBack = (Button) findViewById(R.id.goBack);

        nextUp.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(FourthScreen.this, FifthScreen.class);

                startActivity(intent);
            }
        });

        goBack.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(FourthScreen.this, ThirdScreen.class);

                startActivity(intent);
            }
        });

    }
}
