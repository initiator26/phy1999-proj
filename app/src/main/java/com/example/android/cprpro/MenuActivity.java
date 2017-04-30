package com.example.android.cprpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    TextView textView;
    CardView infant, adult, pet;
    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        textView = (TextView) findViewById(R.id.welcomeUserTV);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            newString = extras.getString(Intent.EXTRA_TEXT);
            if (newString != null) {
                textView.setText("Welcome, " + newString);

            }

        }

        infant = (CardView) findViewById(R.id.infantCard);
        infant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, InfantActivity.class);
                startActivity(intent);
            }
        });

        adult = (CardView) findViewById(R.id.adultCard);
        adult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, AdultActivity.class);
                startActivity(intent);
            }
        });

        pet = (CardView) findViewById(R.id.petCard);
        pet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, PetActivity.class);
                startActivity(intent);
            }
        });
    }
}
