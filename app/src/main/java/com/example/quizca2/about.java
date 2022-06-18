package com.example.quizca2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class about extends AppCompatActivity {

    Button btnback;
    TextView textView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        btnback = (Button) findViewById(R.id.btnback);
        textView6 = (TextView)findViewById(R.id.textView6);
        textView6.setTypeface(null, Typeface.BOLD_ITALIC);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                close();
            }
        });
    }

    private void close() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}