package com.example.itproger;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class Pop_up extends AppCompatActivity {
private Button btn;
private RatingBar rating;
private TextView text_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up);
        addListenerOnButton();
    }
    public void addListenerOnButton(){
        rating = (RatingBar) findViewById(R.id.rating);
        text_show = (TextView) findViewById(R.id.text_show);
        rating.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener(){
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser){
                        text_show.setText("значение:  " + String.valueOf(rating));
                    }
                }
        );


        btn = (Button) findViewById(R.id.button_pop);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder a_builder = new AlertDialog.Builder(Pop_up.this);
                a_builder.setMessage("вы хотите закрыит приложение?")
                        .setCancelable(false)
                        .setPositiveButton("да", new DialogInterface.OnClickListener(){
                            @Override
                public void onClick(DialogInterface dialog, int which){
                                finish();
                            }
                })
                .setNegativeButton("нет", new DialogInterface.OnClickListener(){
                    @Override
                            public void onClick(DialogInterface dialog, int which){
                        dialog.cancel();
                    }
                });
                AlertDialog alert = a_builder.create();
                alert.setTitle("закрытие приложения");
                alert.show();
            }
        });
    }
}