package com.example.cs639.aslproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public int currentLoc = 0;
    String[] numbers = {
            "0",
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9"


    };
    Integer[] numbers_images = {
            R.drawable.number_0,
            R.drawable.number_1,
            R.drawable.number_2,
            R.drawable.number_3,
            R.drawable.number_4,
            R.drawable.number_5,
            R.drawable.number_6,
            R.drawable.number_7,
            R.drawable.number_8,
            R.drawable.number_9
    };


    public void viewNextLetter(View view) {
        TextView textView = findViewById(R.id.textView);
        //String nextL = getNextLetter();
        ImageView img = (ImageView) findViewById(R.id.imageView);
        if(currentLoc == numbers.length-1){
            String nextL = numbers[0];
            textView.setText(nextL);
            img.setImageResource(numbers_images[0]);
            currentLoc = 0;

        }else {

            String nextL = numbers[currentLoc + 1];
            textView.setText(nextL);
            img.setImageResource(numbers_images[currentLoc + 1]);
            currentLoc = currentLoc + 1;
        }


    }


    public void viewPrevLetter(View view) {
        TextView textView = findViewById(R.id.textView);
        ImageView img = (ImageView) findViewById(R.id.imageView);
        //String prevL = getPrevLetter();
        if (currentLoc == 0) {
            String prevL = numbers[numbers.length - 1];
            textView.setText(prevL);
            img.setImageResource(numbers_images[numbers.length-1]);
            currentLoc = numbers.length - 1;
        } else {
            String prevL = numbers[currentLoc - 1];
            textView.setText(prevL);
            img.setImageResource(numbers_images[currentLoc - 1]);
            currentLoc = currentLoc - 1;
        }


    }

}
