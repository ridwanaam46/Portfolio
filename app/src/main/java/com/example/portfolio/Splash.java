package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class Splash extends AppCompatActivity {
    private int waktu_loading=1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home = new Intent(Splash.this, MainActivity.class);
                startActivity(home);
                Toast.makeText(getApplicationContext(), "Portfolio Muhammad Ridwan", Toast.LENGTH_SHORT).show();
                finish();
            }
        },waktu_loading);
    }
}
