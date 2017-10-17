package com.example.erik.anagramapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultsActivity extends AppCompatActivity {

    public String[] allCombos = challenge.answers;
    public String[] submitted = challenge.submitted;
    public int score = challenge.score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        final TextView allAnswers = (TextView)findViewById(R.id.possibleAnswers);
        final TextView submittedAnswers = (TextView)findViewById(R.id.submittedAnswers);
        final TextView finalScore = (TextView)findViewById(R.id.finalScore);

        final Button button1 = (Button)findViewById(R.id.menuButton);
        button1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(ResultsActivity.this, MainActivity.class));
            }
        });

        for(int i=0; i<allCombos.length; i++)
        {
            allAnswers.setText(allAnswers.getText() + allCombos[i]);
            if(i != allCombos.length-1)
            {
                allAnswers.setText(allAnswers.getText() + ", ");
            }

        }
        for(int i=0; i<submitted.length; i++)
        {
            if(submitted[i] != null)
            {
                submittedAnswers.setText(submittedAnswers.getText() + submitted[i]);
                if(submitted[i+1] != null)
                {
                    submittedAnswers.setText(submittedAnswers.getText() + ", ");
                }
            }
        }
        finalScore.setText("Final Score: " + score + " of " + allCombos.length);
    }
}
