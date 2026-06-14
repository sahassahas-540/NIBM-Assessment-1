package com.nibm.assessment1;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class Lesson3Activity extends AppCompatActivity {
    boolean isFragmentA = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson3);

        // for first show fragment A
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new FragmentA())
                .commit();



    }
}