package com.example.cmltdstudent.inclassassignment09_emmal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MessageScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_screen);

        Toast.makeText(this, "Hello World!", Toast.LENGTH_SHORT).show();

    }
}
