package com.example.manisha.candydispenser;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CandyDispenserMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candy_dispenser_main);
        MediaPlayer mMediaPlayer = new MediaPlayer();
        mMediaPlayer = MediaPlayer.create(this, R.raw.sound1);
        mMediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mMediaPlayer.setLooping(true);
        mMediaPlayer.start();
    }
}
