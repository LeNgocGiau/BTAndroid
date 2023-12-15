package com.example.demo7_4activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.Arrays;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static final int
            BTNID_PLUS = 10,
            BTNID_SUB = 11,
            BTNID_MUL = 12,
            BTNID_DIV = 13,
            BTNID_RESULT = 14,
            BTNID_RESET = 15;
    EditText tvResult;
    Button[] bts;
    int lastVal = 0;
    String operation;
    boolean newInput = false; // Sửa ở đây

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.text);
        bts = new Button[]{
                findViewById(R.id.button0),
                findViewById(R.id.button1),
                findViewById(R.id.button2),
                findViewById(R.id.button3),
                findViewById(R.id.button4),
                findViewById(R.id.button5),
                findViewById(R.id.button6),
                findViewById(R.id.button7),
                findViewById(R.id.button8),
                findViewById(R.id.button9),
                findViewById(R.id.btnplus),
                findViewById(R.id.btnsub),
                findViewById(R.id.btmulti),
                findViewById(R.id.btdivi),
                findViewById(R.id.btresult),
                findViewById(R.id.btreset)
        };
        for (Button bt : bts) {
            bt.setOnClickListener(this);
        }
    }

    public void setvalue(EditText a, String b) {
        if (newInput) {
            a.setText(b);
            newInput = false;
        } else {
            String last = a.getText().toString();
            last += b;
            a.setText(last);
        }
    }

    public void resetvalue() {
        tvResult.setText("0");
    }

    public int process(int a, int b) {
        int presult = 0;
        if (operation.equals("plus")) {
            presult = a + b;
        } else if (operation.equals("sub")) {
            presult = a - b;
        } else if (operation.equals("mult")) {
            presult = a * b;
        } else if (operation.equals("divi")) {
            presult = a / b;
        }
        return presult;
    }


    public void onClick(View v) {
        Button bt = (Button) v;
        switch (bt.getText().toString()) {
            case "0":
                setvalue(tvResult, "0");
                break;
            case "1":
                setvalue(tvResult, "1");
                break;
            case "2":
                setvalue(tvResult, "2");
                break;
            case "3":
                setvalue(tvResult, "3");
                break;
            case "4":
                setvalue(tvResult, "4");
                break;
            case "5":
                setvalue(tvResult, "5");
                break;
            case "6":
                setvalue(tvResult, "6");
                break;
            case "7":
                setvalue(tvResult, "7");
                break;
            case "8":
                setvalue(tvResult, "8");
                break;
            case "9":
                setvalue(tvResult, "9");
                break;
            case "+":
                operation = "plus";
                lastVal = Integer.parseInt(tvResult.getText().toString());
                newInput = true;
                break;
            case "-":
                operation = "sub";
                lastVal = Integer.parseInt(tvResult.getText().toString());
                newInput = true;
                break;
            case "*":
                operation = "mult";
                lastVal = Integer.parseInt(tvResult.getText().toString());
                newInput = true;
                break;
            case "/":
                operation = "divi";
                lastVal = Integer.parseInt(tvResult.getText().toString());
                newInput = true;
                break;
            case "result":
                if (operation != null) {
                    int currentValue = Integer.parseInt(tvResult.getText().toString());
                    int result = process(lastVal, currentValue);
                    tvResult.setText(Integer.toString(result));
                    operation = null;
                    newInput = true;
                }
                break;
            case "reset":
                lastVal = 0;
                resetvalue();
                newInput = false;
                break;
        }
    }
}

