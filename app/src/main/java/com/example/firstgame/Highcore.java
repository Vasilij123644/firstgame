package com.example.firstgame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Highcore extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscore);
    }
    @Override
    protected void onStart(){
        super.onStart();
        TextView score1 = findViewById(R.id.t1);
        score1.setText( "Ваш лучший счет за сессию " +Scores.getscore());
    }

    @Override
    public void onClick(View view) {

    }
}