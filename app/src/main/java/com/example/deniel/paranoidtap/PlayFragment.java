package com.example.deniel.paranoidtap;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayFragment extends android.support.v4.app.Fragment implements View.OnClickListener, Runnable {

    ImageView pBack;
    TextView pTaps;
    TextView pTime;
    Integer taps = 0;
    Integer time = 10;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_play, container, false);

        //Contagem regressiva para chamar o resultado
        Handler handler = new Handler();
        handler.postDelayed(this, 10000);

        //interação com interface do jogo.
        pBack = (ImageView) view.findViewById(R.id.back);
        pTaps = (TextView)  view.findViewById(R.id.taps);
        pTime = (TextView)  view.findViewById(R.id.time);

        pBack.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        taps = taps + 1;
        pTaps.setText(taps.toString());
    }

    @Override
    public void run() {
        //Chama o fragment de resultado após os 10 segundos.
        getActivity().getSupportFragmentManager().beginTransaction() //usa o FragmentManager do MainActivity
                .replace(R.id.container, new ResultFragment())
                .addToBackStack("ResultFragment").commit();
    }

}
