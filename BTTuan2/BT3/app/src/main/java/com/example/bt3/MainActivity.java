package com.example.bt3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import java.util.Date;
public class MainActivity extends AppCompatActivity {
    private Button button;
    private AlertDialog alertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btn);
        alertDialog = new AlertDialog.Builder(this).create();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Date date = new Date();
                String message = date.toLocaleString();
                alertDialog.setMessage(message);
                alertDialog.show();
            }
        });
    }
}