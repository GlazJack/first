package com.example.itproger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private EditText n1;
    private EditText n2;
    private TextView rst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick1 (View v){
        n1 = (EditText)findViewById(R.id.num1);
        n2 = (EditText) findViewById(R.id.num2);
        rst = (TextView) findViewById(R.id.result);

        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        int sum = num1 + num2;
        rst.setText(Integer.toString(sum));

    }
    public void onButtonClick2 (View v){
        n1 = (EditText)findViewById(R.id.num1);
        n2 = (EditText) findViewById(R.id.num2);
        rst = (TextView) findViewById(R.id.result);

        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        int sum = num1 - num2;
        rst.setText(Integer.toString(sum));

    }

    public void onButtonClick3 (View v){
        EditText n1 = (EditText)findViewById(R.id.num1);
        EditText n2 = (EditText) findViewById(R.id.num2);
        TextView rst = (TextView) findViewById(R.id.result);

        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        int sum = num1 * num2;
        rst.setText(Integer.toString(sum));
    }

    public void onButtonClick4 (View v){
        EditText n1 = (EditText)findViewById(R.id.num1);
        EditText n2 = (EditText) findViewById(R.id.num2);
        TextView rst = (TextView) findViewById(R.id.result);

        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        int sum = num1 / num2;
        rst.setText(Integer.toString(sum));
    }
    public void onClick(View view){
        Intent intent = new Intent(this,Password.class);
        startActivity(intent);
        Intent intent1 = new Intent(this, Pop_up.class);
        startActivity(intent1);
        Intent intent2 = new Intent(this, Regict.class);
        startActivity(intent2);

    }



}