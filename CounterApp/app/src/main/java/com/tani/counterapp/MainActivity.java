package com.tani.counterapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e = (EditText) findViewById(R.id.e1);
        b = (Button) findViewById(R.id.b1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = e.getText().toString();
                if(TextUtils.isEmpty(s)){
                    Toast.makeText(MainActivity.this, "Enter a number", Toast.LENGTH_LONG).show();
                }
                else{
                    int n = Integer.parseInt(s);
                    // int n = Integer.parseInt(e.getText().toString());
                    e.setText(n+1+"");
                }

            }
        });
    }
}
