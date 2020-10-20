package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Generuj(View view) {
        TextView joke = findViewById(R.id.joke);
        String[] tab = getResources().getStringArray(R.array.jokes);
        Random rand = new Random();
        int rand_number = rand.nextInt(5);
        joke.setText(tab[rand_number]);
    }
}