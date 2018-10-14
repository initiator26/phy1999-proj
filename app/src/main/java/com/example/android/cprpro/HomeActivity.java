package com.example.android.cprpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// Vulfpeck was here! ooowwwwwww

public class HomeActivity extends AppCompatActivity {
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn = (Button)findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this,LoginActivity.class);
                startActivity(i);
            }
        });

//    INTENT BELOW IS FOR MAP ACTIVITY, REMOVE // and edit name of activity

//        btn = (Button)findViewById(R.id.button2);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(HomeActivity.this,MapActivity.class);
//                startActivity(i);
//            }
//        });
    }


   
}
