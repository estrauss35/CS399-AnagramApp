package com.example.erik.anagramapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PickChallenge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_challenge);

        final Button button1 = (Button) findViewById(R.id.backButton);
        button1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(PickChallenge.this, MainActivity.class));
            }
        });

        final Button button2 = (Button) findViewById(R.id.easyButton);
        button2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(PickChallenge.this, challenge.class));
            }
        });
    }
}
