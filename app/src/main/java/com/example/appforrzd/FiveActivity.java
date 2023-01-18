package com.example.appforrzd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
    }

    public void backFourActivity(View v) {
        Intent intent = new Intent(this, fourActivity.class);
        startActivity(intent);
    }
}