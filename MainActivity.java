package com.example.palak.mathgamesapp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    static int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView game1num1 = (TextView)findViewById(R.id.game1num1);
        TextView game2num1 = (TextView)findViewById(R.id.game2num1);
        TextView game1num2 = (TextView)findViewById(R.id.game1num2);
        TextView game2num2 = (TextView)findViewById(R.id.game2num2);
        TextView finalresult = (TextView) findViewById(R.id.result);
        TextView counter = (TextView) findViewById(R.id.counter);

        Button travelBtn = (Button) findViewById(R.id.travel);
        travelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,inforpgActivity.class);
                startActivity(i);
            }
        });


        Button resetBtn = (Button) findViewById(R.id.reset);
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView game1num1 = (TextView)findViewById(R.id.game1num1);
                TextView game2num1 = (TextView)findViewById(R.id.game2num1);
                TextView game1num2 = (TextView)findViewById(R.id.game1num2);
                TextView game2num2 = (TextView)findViewById(R.id.game2num2);
                final TextView finalresult = (TextView) findViewById(R.id.result);
                EditText game1a = (EditText) findViewById(R.id.game1ans);
                EditText game2a = (EditText) findViewById(R.id.game2ans);

                Random rand = new Random();
                 final int startg1num1 = rand.nextInt(10)+1;
                 final int startg1num2 = rand.nextInt(10)+1;
                 final  int startg2num1 = rand.nextInt(10)+1;
                 final int startg2num2 = rand.nextInt(10)+11;

                // last var if different becuase startg2num2 needs to be bigger then
                // startg2num1
                // concerned about the final addtion to these variables, constant?
                game1num1.setText(startg1num1 + "");
                game1num2.setText(startg1num2 + "");
                game2num1.setText(startg2num1 + "");
                game2num2.setText(startg2num2 + "");
                game1a.setText("");
                game2a.setText("");
                finalresult.setText("");
                // works so far all number are random
                // put these inside the reset button

                //declare check button
                Button checkBtn = (Button) findViewById(R.id.checkBtn);
                checkBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {

                        EditText game1ans = (EditText) findViewById(R.id.game1ans);
                        EditText game2ans = (EditText) findViewById(R.id.game2ans);
                        TextView counter = (TextView)  findViewById(R.id.counter);
                        int g1ans = Integer.parseInt(game1ans.getText().toString());
                        int g2ans = Integer.parseInt(game2ans.getText().toString());
                        int resultg1 = g1ans;
                        int resultg2 = g2ans;
                        if ((resultg1 == startg1num1 + startg1num2) && (resultg2 == startg2num2 - startg2num1))
                        {
                            finalresult.setText("Correct! hit reset");
                             count++;
                             counter.setText(count + "");
                             //displays the points earned
                        }
                        else
                        {
                            finalresult.setText("Incorrect, hit reset to play again");
                            count = 0;
                            counter.setText(count + "");
                            //displays 0 bc the user lost the game
                        }


                    }
                });
                //the int declarations go inside that
                // need to assign that rand stuff to
                // for text views you just have to assign you dont have to read
                // need to get both right

                


            }
        });





    }
}
