package com.example.itproger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Password extends AppCompatActivity {
    private EditText password;
    private Button btn, btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        addListenerOnButton();
    }
    public void addListenerOnButton(){
        password = (EditText) findViewById(R.id.pass);
        btn = (Button) findViewById(R.id.button);
        btn1 = (Button) findViewById(R.id.button_1);
        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        btn.setText("Done");
                        btn.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        Toast.makeText(
                                Password.this, password.getText(),
                                Toast.LENGTH_LONG
                        ).show();


                    }
                }
        );

        btn1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        btn.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        Toast.makeText(
                                Password.this, "all is changed",
                                Toast.LENGTH_LONG
                        ).show();

                    }
                }
        );
    }
}