package com.example.bttuan9;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Demo9_2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Demo9_2GraphicsView(this));
    }
}
