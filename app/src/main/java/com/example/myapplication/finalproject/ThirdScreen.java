package com.example.myapplication.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdScreen extends AppCompatActivity {

    Button moveForward;
    Button goto2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_screen);
        moveForward = (Button) findViewById(R.id.nextButton);
        goto2 = (Button) findViewById(R.id.goto2);

        goto2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(ThirdScreen.this, SecondScreen.class);

                startActivity(intent);
            }
        });

        moveForward.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(ThirdScreen.this, FourthScreen.class);

                startActivity(intent);
            }
        });

    }
}
