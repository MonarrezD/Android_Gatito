package com.example.meow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import java.util.Timer;
import java.util.TimerTask;
import android.widget.ImageView;
public class Start extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        ImageView gifImageView = findViewById(R.id.gifImageView);
        gifImageView.setImageResource(R.drawable.melusine_fgo);


        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                Intent i = new Intent(Start.this, AddPlayers.class);
                startActivity(i);
                finish();
            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(tarea, 5000);
    }
}
