package com.example.bttuan8_1;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.*;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.*;
public class MainActivity extends AppCompatActivity{
    private Button myButton;
    private EditText myText;
    private CheckBox checkColor;
    private CheckBox checkBold;
    private int count = 0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkColor = findViewById(R.id.ck_color);
        checkBold = findViewById(R.id.ck_bold);
        myButton = findViewById(R.id.myBtn);
        myText = findViewById(R.id.et1);
        myText.setSingleLine();
        myText.setInputType(InputType.TYPE_NULL);
        myButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (checkColor.isChecked())
                    myText.setTextColor(Color.BLUE);
                else myText.setTextColor(Color.BLACK);
                if (checkBold.isChecked())
                    myText.setTypeface(Typeface.DEFAULT_BOLD);
                else myText.setTypeface(Typeface.DEFAULT);
                myText.setText("You've Clicked " + ++count + " times");
            }
        });
    }
}
