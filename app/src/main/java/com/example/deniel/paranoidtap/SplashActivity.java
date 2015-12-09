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

// Primos até 100:
// 1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97