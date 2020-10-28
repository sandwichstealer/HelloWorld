package com.nitrostocks.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);


    // Get the Intent that started this activity and extract the string

    Intent intent = getIntent();

        // EXTRA_MESSAGE was declared in the main activity as a public variable.

    String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // "message" is defined in resources, activity display page

    // Capture the layout's TextView and set the string as its text

    TextView textView = (TextView) findViewById(R.id.textView);

    textView.setText(message);

    }



}
