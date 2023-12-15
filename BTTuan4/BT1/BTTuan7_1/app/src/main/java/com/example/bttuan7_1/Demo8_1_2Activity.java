package com.example.bttuan7_1;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;
public class Demo8_1_2Activity extends AppCompatActivity implements View.OnClickListener{
    static String EXTRA_NAME = "name",
            EXTRA_EMAIL = "email",
            EXTRA_PROJECT = "project";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8demo1_2);
        Intent intent = getIntent();
        this.<TextView>findViewById(R.id.etName)
                .setText(intent.getStringExtra(EXTRA_NAME));
        this.<TextView>findViewById(R.id.etEmail)
                .setText(intent.getStringExtra(EXTRA_EMAIL));
        this.<TextView>findViewById(R.id.etProject)
                .setText(intent.getStringExtra(EXTRA_PROJECT));
        findViewById(R.id.btnView)
                .setOnClickListener(this);
    }
    public void onClick(View v) {
        finish();
    }
}
