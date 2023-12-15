package com.example.btandroid_tuan8;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;

public class Bai3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton red = (RadioButton) findViewById(R.id.redRadio);
        RadioButton green = (RadioButton) findViewById(R.id.greenRadio);
        RadioButton blue = (RadioButton) findViewById(R.id.blueRadio);
        RadioButton gray = (RadioButton) findViewById(R.id.grayRadio);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.frame);

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (red.isChecked()) frameLayout.setBackgroundColor(getResources().getColor(R.color.red));
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (green.isChecked()) frameLayout.setBackgroundColor(getResources().getColor(R.color.green));
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (red.isChecked()) frameLayout.setBackgroundColor(getResources().getColor(R.color.blue));
            }
        });

        gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gray.isChecked()) frameLayout.setBackgroundColor(getResources().getColor(R.color.gray));
            }
        });
    }
}