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

        NumbersClickListener clickListener = new NumbersClickListener();

        //FindView that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);
        // set a click listener on that view
        numbers.setOnClickListener(clickListener);
    }
    

}
