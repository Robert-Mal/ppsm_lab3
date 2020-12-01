package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class WeatherActivity extends AppCompatActivity {

    TextView time, cityName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        cityName = findViewById(R.id.cityName);

        Intent intent = getIntent();
        String text = intent.getStringExtra("KEY_YOUR_TEXT");

        cityName.setText(text);

        time();
    }

    public void time() {
        time = findViewById(R.id.time);

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        String now = simpleDateFormat.format(calendar.getTime());

        time.setText(now);

        refresh(1000);
    }

    private void refresh (int miliseconds) {
        final Handler handler = new Handler();

        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                time();
            }
        };
        handler.postDelayed(runnable, miliseconds);
    }
}