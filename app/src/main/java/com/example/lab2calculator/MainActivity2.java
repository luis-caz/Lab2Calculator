package com.example.lab2calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textview2 = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        String num = intent.getStringExtra("message");

        textview2.setText(num);
    }
}