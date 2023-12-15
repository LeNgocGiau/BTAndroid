package com.example.bttuan7_1;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;

public class Demo8_1_1Activity extends AppCompatActivity implements View.OnClickListener{

    static String EXTRA_NAME = Demo8_1_2Activity.EXTRA_NAME,
            EXTRA_EMAIL = Demo8_1_2Activity.EXTRA_EMAIL,
            EXTRA_PROJECT = Demo8_1_2Activity.EXTRA_PROJECT;

    private EditText etName;
    private EditText etEmail;
    private EditText etProject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8demo1_1);
        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etProject = findViewById(R.id.etProject);
        findViewById(R.id.btnView).setOnClickListener(this);
    }
    public void onClick(View v) {
        Intent intent = new Intent(this, Demo8_1_2Activity.class);
        intent.putExtra(EXTRA_NAME, etName.getText().toString());
        intent.putExtra(EXTRA_EMAIL, etEmail.getText().toString());
        intent.putExtra(EXTRA_PROJECT, etProject.getText().toString());
        startActivity(intent);
    }
}