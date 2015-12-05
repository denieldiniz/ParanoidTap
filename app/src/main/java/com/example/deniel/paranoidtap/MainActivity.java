package com.example.deniel.paranoidtap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //int temp = 10;
    TextView refTaps;
    int taps = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int cont = 10;
        //TextView refTemp = (TextView) findViewById(R.id.temp);
        refTaps = (TextView) findViewById(R.id.taps);
        ImageView tela = (ImageView) findViewById(R.id.fundo);
        tela.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        taps = taps + 1;
        refTaps.setText(taps);

    }
}