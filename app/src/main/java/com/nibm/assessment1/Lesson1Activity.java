package com.nibm.assessment1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Lesson1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1);

        EditText editText = findViewById(R.id.editText);
        Button btnShowToast = findViewById(R.id.btnShowToast);


        btnShowToast.setOnClickListener(v -> {
            String text = editText.getText().toString();
            Toast.makeText(Lesson1Activity.this, "you entered: " + text, Toast.LENGTH_SHORT).show();
        });
    }
}