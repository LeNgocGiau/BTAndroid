package com.example.bt4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.*;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        EditText et = new EditText(this);
        et.setLines(1);
        et.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        layout.addView(et);
        setContentView(layout);

        et.setOnKeyListener(new View.OnKeyListener() {
            private final AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_VOLUME_UP)
                {
                    String message = et.getText().toString();
                    alertDialog.setMessage(message);
                    alertDialog.show();
                    return true;
                }
                return false;
            }
        });
    }
}