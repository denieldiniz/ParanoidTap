package com.example.deniel.paranoidtap;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Chronometer;

public class SplashActivity extends AppCompatActivity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler handler = new Handler();
        handler.postDelayed(this, 3000);
        Chronometer cont = new Chronometer(this);
        cont.
    }

    @Override
    public void run() {
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }
}