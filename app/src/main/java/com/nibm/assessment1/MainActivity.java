package com.nibm.assessment1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // for button identify
        Button btnLesson1 = findViewById(R.id.btnLesson1);
        Button btnLesson2 = findViewById(R.id.btnLesson2);
        Button btnLesson3 = findViewById(R.id.btnLesson3);

        // Intent foe lesson1
        btnLesson1.setOnClickListener(v ->
                 startActivity(new Intent(MainActivity.this,Lesson1Activity.class)));

        // Intent for lesson2
        btnLesson2.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this,Lesson2Activity.class)));



        // Intent for lesson3
        btnLesson3.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this,Lesson3Activity.class)));


    }
}