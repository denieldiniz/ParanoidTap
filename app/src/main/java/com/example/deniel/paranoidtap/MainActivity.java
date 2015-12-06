package com.example.deniel.paranoidtap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView pBack;
    TextView pTaps;
    TextView pTime;
    Integer taps = 0;
    Integer time = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pBack = (ImageView) findViewById(R.id.back);
        pTaps = (TextView) findViewById(R.id.taps);
        pTime = (TextView) findViewById(R.id.time);

        pBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        taps = taps + 1;
        pTaps.setText(taps.toString());
    }
}