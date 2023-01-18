package com.example.appforrzd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
    }

    public void backThreeActivity(View v) {
        Intent intent = new Intent(this, ThreeActivity.class);
        startActivity(intent);
    }

    public void forwardFiveActivity(View v) {
        Intent intent = new Intent(this, FiveActivity.class);
        startActivity(intent);
    }
}