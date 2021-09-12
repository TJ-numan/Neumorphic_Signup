package com.tjnuman.neumorphicsignup;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import soup.neumorphism.NeumorphButton;

public class LoginActivity extends AppCompatActivity {
    LinearLayout mainLaout;
    Animation animation_fadeIn;
    NeumorphButton button;


    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        mainLaout = findViewById(R.id.mainLaout);
        animation_fadeIn = AnimationUtils.loadAnimation(LoginActivity.this,R.anim.fade_in);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mainLaout.setVisibility(View.VISIBLE);
                mainLaout.setAnimation(animation_fadeIn);
            }
        },600);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,TilesActivity.class);
                startActivity(intent);
            }
        });



    }
}