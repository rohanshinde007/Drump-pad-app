package com.mul.drumppad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int b1;
    int b2;
    int b3;
    int b4;
    int b5;
    int b6;
    int b7;
    int b8;
    int b9;
SoundPool sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = new SoundPool(2, AudioManager.STREAM_MUSIC,0);
        b1 = sp.load(getApplicationContext(),R.raw.app_src_main_res_raw_sound00,1);
        b2 = sp.load(getApplicationContext(),R.raw.app_src_main_res_raw_sound1,1);
        b3 = sp.load(getApplicationContext(),R.raw.app_src_main_res_raw_sound2,1);
        b4 = sp.load(getApplicationContext(),R.raw.app_src_main_res_raw_sound3,1);
        b5 = sp.load(getApplicationContext(),R.raw.app_src_main_res_raw_sound4,1);
        b6 = sp.load(getApplicationContext(),R.raw.app_src_main_res_raw_sound5,1);
        b7 = sp.load(getApplicationContext(),R.raw.app_src_main_res_raw_sound6,1);
        b8 = sp.load(getApplicationContext(),R.raw.app_src_main_res_raw_sound7,1);
        b9 =sp.load(getApplicationContext(),R.raw.app_src_main_res_raw_sound9,1);


    }

    public void p1(View view) {
        sp.play(b1,1.0f,1.0f,0,0,10f);
    }

    public void p2(View view) {
        sp.play(b2,1.0f,1.0f,0,0,10f);
    }

    public void p3(View view) {
        sp.play(b3,1.0f,1.0f,0,0,10f);
    }

    public void p4(View view) {
        sp.play(b4,1.0f,1.0f,0,0,10f);
    }

    public void p5(View view) {
        sp.play(b5,1.0f,1.0f,0,0,9f);
    }

    public void p6(View view) {

        sp.play(b6,1.0f,1.0f,0,0,10f);
    }

    public void p7(View view) {
        Vibrator v = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        v.vibrate(110);
        sp.play(b7,1.0f,1.0f,0,0,10f);
    }

    public void p8(View view) {
        sp.play(b8,1.0f,1.0f,0,0,10f);
    }

    public void p9(View view) {
        sp.play(b9,1.0f,1.0f,0,0,10f);
    }
}