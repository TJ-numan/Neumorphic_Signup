package com.tjnuman.neumorphicsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TilesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiles);
        Utils.blackIconStatusBar(TilesActivity.this,R.color.baground);
    }
}