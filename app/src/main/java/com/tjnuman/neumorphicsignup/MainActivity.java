package com.tjnuman.neumorphicsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.Pair;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView logo,bottom;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Utils.blackIconStatusBar(MainActivity.this,R.color.baground);

        textView = findViewById(R.id.textName);
        logo = findViewById(R.id.logo);
        bottom = findViewById(R.id.bottonImage);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,
                        Pair.create(logo,"logo"),
                        Pair.create(bottom,"imageTree"),
                        Pair.create(textView,"logoText"));
                startActivity(intent,options.toBundle());
            }
        },3000);



    }
}