package com.example.appforrzd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
    }

    public void forwardFourActivity(View v) {
        Intent intent = new Intent(this, fourActivity.class);
        startActivity(intent);
    }

    public void backChoosingActivity(View v) {
        Intent intent = new Intent(this, choosingName.class);
        startActivity(intent);
    }
}