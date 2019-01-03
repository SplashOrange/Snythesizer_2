package com.example.hjoh2002.snythesizer_2;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class SynthesizerActivity extends AppCompatActivity {
    private static final String TAG =
            SynthesizerActivity.class.getName();
    private Button mEButton;
    private Button mFButton;
    private Button mXButton;
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpX;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);
        mEButton = (Button)findViewById(R.id.eButton);
        mFButton = (Button)findViewById(R.id.fButton);
        mXButton = (Button)findViewById(R.id.xButton);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpX = MediaPlayer.create(this, R.raw.scalex);
    }

    public void onButton1Click(View v) {
        mpE.seekTo(0);
        Log.e("SynthesizerActivity", "Button E clicked");
        mpE.start();
    }

    public void onButton2Click(View v) {
        mpF.seekTo(0);
        Log.e("SynthesizerActivity", "Button F clicked");
        mpF.start();
    }

    public void onButton3Click(View v) {
        mpX.seekTo(0);
        Log.e("SynthesizerActivity", "Button X clicked");
        mpX.start();
    }


}

