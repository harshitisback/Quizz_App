package com.example.quizca2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class home extends AppCompatActivity {

    Button about1;
    EditText name;
    String names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        about1 = (Button) findViewById(R.id.logout2);
        name = (EditText)findViewById(R.id.editTextTextPersonName) ;

        about1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(home.this, about.class);

                startActivity(i);
            }
        });
    }

    public void startquiz(View view){
        names = name.getText().toString();
        Intent i = new Intent(this, quiz.class);
        //i.putExtra("Message_key",names);
        i.putExtra("key",names);
        startActivity(i);
    }

    public void onLogout(View view){
        startActivity(new Intent(this, MainActivity.class));
    }
}