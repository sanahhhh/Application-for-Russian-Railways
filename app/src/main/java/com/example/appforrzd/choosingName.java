package com.example.appforrzd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class choosingName extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosing_name);
    }

    public void startThreeActivity(View v) {
        Intent intent = new Intent(this, ThreeActivity.class);
        startActivity(intent);
    }
}