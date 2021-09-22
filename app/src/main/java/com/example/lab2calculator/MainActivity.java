package com.example.lab2calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunctionAdd(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        String str = myTextField1.getText().toString();
        String str2 = myTextField2.getText().toString();

        int num = Integer.parseInt(str) + Integer.parseInt(str2);

        goToActivity2(Integer.toString(num));
    }
    public void clickFunctionMinus(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        String str = myTextField1.getText().toString();
        String str2 = myTextField2.getText().toString();

        int num = Integer.parseInt(str) - Integer.parseInt(str2);


        goToActivity2(Integer.toString(num));
    }

    public void clickFunctionDiv(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        String str = myTextField1.getText().toString();
        String str2 = myTextField2.getText().toString();

        int num = Integer.parseInt(str) /  Integer.parseInt(str2);


        goToActivity2(Integer.toString(num));
    }

    public void clickFunctionMulti(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        String str = myTextField1.getText().toString();
        String str2 = myTextField2.getText().toString();

        int num = Integer.parseInt(str) * Integer.parseInt(str2);



        goToActivity2(Integer.toString(num));
    }

    public void goToActivity2(String s) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }
}