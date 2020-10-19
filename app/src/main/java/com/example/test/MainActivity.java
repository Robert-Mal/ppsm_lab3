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
        String[] tab = {"What an electrician is doing on stage... builds tension",
                "What is the name of the line produced in the USA... trampoline",
                "Why the blonde throws the clock through the window... because he watches time go by",
                "What is the soldier's favorite fruit... pomegranate",
                "Why is it hot in the corner... because it's 90 degrees"};
        Random rand = new Random();
        int rand_number = rand.nextInt(5);
        joke.setText(tab[rand_number]);
    }
}