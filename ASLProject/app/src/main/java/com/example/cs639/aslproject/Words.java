package com.example.cs639.aslproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Words extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public int currentLoc = 0;
    String[] words = {
            "Hello",
            "Goodbye",
            "Nice to Meet You",
            "Yes",
            "No",
            "Please",
            "Thanks"
    };
    Integer[] word_images = {
            R.drawable.travel_words_hello,
            R.drawable.travel_words_goodbye,
            R.drawable.travel_words_nice_to_meet_you,
            R.drawable.travel_words_yes,
            R.drawable.travel_words_no,
            R.drawable.travel_words_please,
            R.drawable.travel_words_thanks
    };


    public void viewNextLetter(View view) {
        TextView textView = findViewById(R.id.textView);
        ImageView img = (ImageView) findViewById(R.id.imageView);
        if(currentLoc == words.length-1){
            String nextL = words[0];
            textView.setText(nextL);
            img.setImageResource(word_images[0]);
            currentLoc = 0;

        }else {

            String nextL = words[currentLoc + 1];
            textView.setText(nextL);
            img.setImageResource(word_images[currentLoc + 1]);
            currentLoc = currentLoc + 1;
        }


    }

    public void viewPrevLetter(View view) {
        TextView textView = findViewById(R.id.textView);
        ImageView img = (ImageView) findViewById(R.id.imageView);
        if (currentLoc == 0){
            String nextL = words[words.length-1];
            textView.setText(nextL);
            img.setImageResource(word_images[words.length-1]);
            currentLoc = words.length-1;
        }else{
            String nextL = words[currentLoc-1];
            textView.setText(nextL);
            img.setImageResource(word_images[currentLoc - 1]);
            currentLoc = currentLoc-1;
        }


    }



}
