package com.example.deniel.paranoidtap;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Chama o fragment do jogo
        fragmentManager.beginTransaction()
                .replace(R.id.container, new PlayFragment())
                .addToBackStack("PlayFragment").commit();
    }

}