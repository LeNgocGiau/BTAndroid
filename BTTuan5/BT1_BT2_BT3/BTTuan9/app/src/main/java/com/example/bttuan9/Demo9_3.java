package com.example.bttuan9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
public class Demo9_3 extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Demo9_3GraphicsView(this));
    }
}
