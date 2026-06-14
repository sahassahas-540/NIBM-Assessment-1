package com.nibm.assessment1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class Lesson2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson2);

        // Setting the UI Eliments
        EditText etName = findViewById(R.id.etName);
        EditText etEmail = findViewById(R.id.etEmail);
        EditText etMobile = findViewById(R.id.etMobile);
        Button btnSubmit = findViewById(R.id.btnSubmit);
        Button btnClear = findViewById(R.id.btnClear);

        // Submit buttton
        btnSubmit.setOnClickListener(v -> {
            String name = etName.getText().toString();
            String email = etEmail.getText().toString();
            String mobile = etMobile.getText().toString();

            Intent intent = new Intent(Lesson2Activity.this, Lesson2Res.class);
            intent.putExtra("USER_NAME", name);
            intent.putExtra("USER_EMAIL", email);
            intent.putExtra("USER_MOBILE", mobile);
            startActivity(intent);
        });

        // Clear button
        btnClear.setOnClickListener(v -> {
            etName.setText("");
            etEmail.setText("");
            etMobile.setText("");
        });
    }
}