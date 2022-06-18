package com.example.quizca2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class results extends AppCompatActivity {

    TextView tv, tv2, tv3;
    Button btnRestart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        tv = (TextView)findViewById(R.id.tvres);
        tv2 = (TextView)findViewById(R.id.tvres2);
        tv3 = (TextView)findViewById(R.id.tvres3);
        btnRestart = (Button) findViewById(R.id.btnRestart);

        StringBuffer sb = new StringBuffer();
        sb.append("Correct Answers: " + quiz.correct + "\n");
        StringBuffer sb2 = new StringBuffer();
        sb2.append("Incorrect Answers: " + quiz.wrong + "\n");
        StringBuffer sb3 = new StringBuffer();
        sb3.append("Final Score: " + quiz.correct + "\n");
        tv.setText(sb);
        tv2.setText(sb2);
        tv3.setText(sb3);

        quiz.correct=0;
        quiz.wrong=0;

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), home.class);
                startActivity(in);
            }
        });

    }
}