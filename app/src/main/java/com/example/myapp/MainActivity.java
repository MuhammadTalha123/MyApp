package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //FindView that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);
        // set a click listener on that view
        numbers.setOnClickListener(new View.OnClickListener() {

            @Override
            public  void onClick(View view) {

                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);

                startActivity(numbersIntent);
            }


        });

        //FindView that shows the family category
        TextView family = (TextView) findViewById(R.id.family);
        // set a click listener on that view
        family.setOnClickListener(new View.OnClickListener() {

            @Override
            public  void onClick(View view) {

                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);

                startActivity(familyIntent);
            }


        });

        //FindView that shows the colors category
        TextView colors = (TextView) findViewById(R.id.colors);
        // set a click listener on that view
        colors.setOnClickListener(new View.OnClickListener() {

            @Override
            public  void onClick(View view) {

                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);

                startActivity(colorsIntent);
            }


        });

        //FindView that shows the phrases category
        TextView phrases = (TextView) findViewById(R.id.phrases);
        // set a click listener on that view
        phrases.setOnClickListener(new View.OnClickListener() {

            @Override
            public  void onClick(View view) {

                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);

                startActivity(phrasesIntent);
            }


        });
    }


}
