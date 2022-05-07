package com.example.itproger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Regict extends AppCompatActivity {
    private EditText email,pass;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regict);
        Main_login();
    }
    public void Main_login(){
        email = (EditText) findViewById(R.id.login);
        pass = (EditText) findViewById(R.id.password);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                }
        );




    }

}