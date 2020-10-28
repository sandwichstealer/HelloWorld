package com.nitrostocks.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    // Declare the string EXTRA_MESSAGE.
    // It's public but the term final means it can't be used anywhere else by mistake.

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view){

        // Do something in response to button

        // Believe intent is created here to get information from display message activity

        Intent intent = new Intent(this, DisplayMessageActivity.class);

        // R.id means reasource id constant
        // editTextBox1 is the resource id name in the main activity
        EditText editTextBox1 = (EditText) findViewById(R.id.editTextBox1);

        String message = editTextBox1.getText().toString();

        // message = "or just print this!!";

        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }



}
