package com.example.bttuan9;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
public class Demo9_4 extends AppCompatActivity{

    private MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        player = MediaPlayer.create(this, R.raw.gangnam);
        player.start();
        setContentView(new Demo9_4GraphicsView(this));
    }

    protected void onDestroy() {
        super.onDestroy();
        player.release();
    }
}
