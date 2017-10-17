package com.example.erik.anagramapp;

import android.content.Intent;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class challenge extends AppCompatActivity {

    public String input = "";
    public String[] anagrams = {"art", "bat", "march", "alert"};
    public static String[] answers = {"tar", "rat", "tab", "charm", "alter", "later"};
    public static String[] submitted = new String[answers.length];
    public int puzzle = 0;
    public static int score = 0;
    public boolean used = false;
    public int submitTrack = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge);

        final EditText editField = (EditText)findViewById(R.id.answerField);
        final TextView anagram = (TextView)findViewById(R.id.anagramWord);
        final TextView scoreText = (TextView)findViewById(R.id.scoreField);
        anagram.setText(anagrams[puzzle]);

        final Button button2 = (Button)findViewById(R.id.skipButton);
        button2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                puzzle++;
                if(puzzle == 3)
                {
                    button2.setText("Finish");
                }
                if(puzzle<4)
                {
                    anagram.setText(anagrams[puzzle]);
                }
                else if(puzzle >= 4)
                {
                    startActivity(new Intent(challenge.this, ResultsActivity.class));
                }

            }
        });

        final Button button3 = (Button)findViewById(R.id.Back);
        button3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(puzzle != 0)
                {
                    puzzle--;
                    button2.setText("Next");
                    anagram.setText(anagrams[puzzle]);
                }

            }
        });

        final Button button4 = (Button)findViewById(R.id.quitButton);
        button4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                score = 0;
                for(int i=0; i<submitted.length; i++)
                {
                    submitted[i] = null;
                }
                startActivity(new Intent(challenge.this, MainActivity.class));

            }
        });

        final Button button1 = (Button) findViewById(R.id.submitButton);
        button1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                used = false;
                input = editField.getText().toString().toLowerCase();
                if(puzzle == 0)
                {
                    if(input.equals(answers[0]) || input.equals(answers[1]))
                    {
                        for(int i=0; i<submitted.length; i++)
                        {
                            if (input.equals(submitted[i]))
                            {
                                used=true;
                            }
                        }
                        if(!used)
                        {
                            score++;
                            scoreText.setText("Score: " + score);
                            submitted[submitTrack] = input;
                            submitTrack++;
                        }

                    }
                }
                else if(puzzle == 1)
                {
                    if(input.equals(answers[2]))
                    {
                        for(int i=0; i<submitted.length; i++)
                        {
                            if (input.equals(submitted[i]))
                            {
                                used=true;
                            }
                        }
                        if(!used)
                        {
                            score++;
                            scoreText.setText("Score: " + score);
                            submitted[submitTrack] = input;
                            submitTrack++;
                        }

                    }
                }
                else if(puzzle == 2)
                {
                    if(input.equals(answers[3]))
                    {
                        for(int i=0; i<submitted.length; i++)
                        {
                            if (input.equals(submitted[i]))
                            {
                                used=true;
                            }
                        }
                        if(!used)
                        {
                            score++;
                            scoreText.setText("Score: " + score);
                            submitted[submitTrack] = input;
                            submitTrack++;
                        }

                    }
                }
                else if(puzzle == 3)
                {
                    if(input.equals(answers[4]) || input.equals(answers[5]))
                    {
                        for(int i=0; i<submitted.length; i++)
                        {
                            if (input.equals(submitted[i]))
                            {
                                used=true;
                            }
                        }
                        if(!used)
                        {
                            score++;
                            scoreText.setText("Score: " + score);
                            submitted[submitTrack] = input;
                            submitTrack++;
                        }

                    }
                }

            }
        });


    }

}
