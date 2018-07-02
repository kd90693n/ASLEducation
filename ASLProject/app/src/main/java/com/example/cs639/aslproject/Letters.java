package com.example.cs639.aslproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Letters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letters);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public int currentLoc = 0;
    String[] alphabet = {
            "a",
            "b",
            "c",
            "d",
            "e",
            "f",
            "g",
            "h",
            "i",
            "j",
            /*"k",
            "l",
            "m",
            "n",
            "o",
            "p",
            "q",
            "r",
            "s",
            "t",
            "u",
            "v",
            "w",
            "x",
            "y",
            "z"
          */

    };
    Integer[] alphabet_images = {
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
        if(currentLoc == alphabet.length-1){
            String nextL = alphabet[0];
            textView.setText(nextL);
            img.setImageResource(alphabet_images[0]);
            currentLoc = 0;

        }else {

            String nextL = alphabet[currentLoc + 1];
            textView.setText(nextL);
            img.setImageResource(alphabet_images[currentLoc + 1]);
            currentLoc = currentLoc + 1;
        }


    }


    public void viewPrevLetter(View view) {
        TextView textView = findViewById(R.id.textView);
        ImageView img = (ImageView) findViewById(R.id.imageView);
        //String prevL = getPrevLetter();
        if (currentLoc == 0) {
            String prevL = alphabet[alphabet.length - 1];
            textView.setText(prevL);
            img.setImageResource(alphabet_images[alphabet.length-1]);
            currentLoc = alphabet.length - 1;
        } else {
            String prevL = alphabet[currentLoc - 1];
            textView.setText(prevL);
            img.setImageResource(alphabet_images[currentLoc - 1]);
            currentLoc = currentLoc - 1;
        }


    }



/*
    public String getNextLetter(){
        TextView textView = findViewById(R.id.textView);
        String currentLetter = (String) textView.getText().toString();

        //Log.i("MyActivity", "currentLetter value is " + currentLetter);

        if(currentLetter.equalsIgnoreCase("a")){
            currentLetter = "b";
        }else if(currentLetter.equalsIgnoreCase("b")){
            currentLetter = "c";
        }else if(currentLetter.equalsIgnoreCase("c")){
            currentLetter = "d";
        }else if(currentLetter.equalsIgnoreCase("d")){
            currentLetter = "e";
        }else if(currentLetter.equalsIgnoreCase("e")){
            currentLetter = "f";
        }else if(currentLetter.equalsIgnoreCase("f")){
            currentLetter = "g";
        }else if(currentLetter.equalsIgnoreCase("g")){
            currentLetter = "h";
        }else if(currentLetter.equalsIgnoreCase("h")){
            currentLetter = "i";
        }else if(currentLetter.equalsIgnoreCase("i")){
            currentLetter = "j";
        }else if(currentLetter.equalsIgnoreCase("j")){
            currentLetter = "k";
        }else if(currentLetter.equalsIgnoreCase("k")){
            currentLetter = "l";
        }else if(currentLetter.equalsIgnoreCase("l")){
            currentLetter = "m";
        }else if(currentLetter.equalsIgnoreCase("m")){
            currentLetter = "n";
        }else if(currentLetter.equalsIgnoreCase("n")){
            currentLetter = "o";
        }else if(currentLetter.equalsIgnoreCase("o")){
            currentLetter = "p";
        }else if(currentLetter.equalsIgnoreCase("p")){
            currentLetter = "q";
        }else if(currentLetter.equalsIgnoreCase("q")){
            currentLetter = "r";
        }else if(currentLetter.equalsIgnoreCase("r")){
            currentLetter = "s";
        }else if(currentLetter.equalsIgnoreCase("s")){
            currentLetter = "t";
        }else if(currentLetter.equalsIgnoreCase("t")){
            currentLetter = "u";
        }else if(currentLetter.equalsIgnoreCase("u")){
            currentLetter = "v";
        }else if(currentLetter.equalsIgnoreCase("v")){
            currentLetter = "w";
        }else if(currentLetter.equalsIgnoreCase("w")){
            currentLetter = "x";
        }else if(currentLetter.equalsIgnoreCase("x")){
            currentLetter = "y";
        }else if(currentLetter.equalsIgnoreCase("y")){
            currentLetter = "z";
        }else if(currentLetter.equalsIgnoreCase("z")){
            currentLetter = "a";
        }

        return currentLetter;



    }

    public String getPrevLetter(){
        TextView textView = findViewById(R.id.textView);
        String currentLetter = (String) textView.getText().toString();

        if(currentLetter.equalsIgnoreCase("a")){
            currentLetter = "z";
        }else if(currentLetter.equalsIgnoreCase("b")){
            currentLetter = "a";
        }else if(currentLetter.equalsIgnoreCase("c")){
            currentLetter = "b";
        }else if(currentLetter.equalsIgnoreCase("d")){
            currentLetter = "c";
        }else if(currentLetter.equalsIgnoreCase("e")){
            currentLetter = "d";
        }else if(currentLetter.equalsIgnoreCase("f")){
            currentLetter = "e";
        }else if(currentLetter.equalsIgnoreCase("g")){
            currentLetter = "f";
        }else if(currentLetter.equalsIgnoreCase("h")){
            currentLetter = "g";
        }else if(currentLetter.equalsIgnoreCase("i")){
            currentLetter = "h";
        }else if(currentLetter.equalsIgnoreCase("j")){
            currentLetter = "i";
        }else if(currentLetter.equalsIgnoreCase("k")){
            currentLetter = "j";
        }else if(currentLetter.equalsIgnoreCase("l")){
            currentLetter = "k";
        }else if(currentLetter.equalsIgnoreCase("m")){
            currentLetter = "l";
        }else if(currentLetter.equalsIgnoreCase("n")){
            currentLetter = "m";
        }else if(currentLetter.equalsIgnoreCase("o")){
            currentLetter = "n";
        }else if(currentLetter.equalsIgnoreCase("p")){
            currentLetter = "o";
        }else if(currentLetter.equalsIgnoreCase("q")){
            currentLetter = "p";
        }else if(currentLetter.equalsIgnoreCase("r")){
            currentLetter = "q";
        }else if(currentLetter.equalsIgnoreCase("s")){
            currentLetter = "r";
        }else if(currentLetter.equalsIgnoreCase("t")){
            currentLetter = "s";
        }else if(currentLetter.equalsIgnoreCase("u")){
            currentLetter = "t";
        }else if(currentLetter.equalsIgnoreCase("v")){
            currentLetter = "u";
        }else if(currentLetter.equalsIgnoreCase("w")){
            currentLetter = "v";
        }else if(currentLetter.equalsIgnoreCase("x")){
            currentLetter = "w";
        }else if(currentLetter.equalsIgnoreCase("y")){
            currentLetter = "x";
        }else if(currentLetter.equalsIgnoreCase("z")){
            currentLetter = "y";
        }


        return currentLetter;



    }

    */

}
