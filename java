package com.example.android.scorekeeper;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

int gryffindorScore = 0;
int ravenclawScore =0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public void tenPointsGryffindor (View view){
        gryffindorScore = gryffindorScore + 10;
        displayGryiffindor(gryffindorScore);
   }

   public void goldenSnitchGryiffindor (View view){
       gryffindorScore = gryffindorScore + 150;
       displayGryiffindor(gryffindorScore);
   }

    public void tenPointsRavenclaw (View view){
        ravenclawScore = ravenclawScore + 10;
        displayRavewclaw(ravenclawScore);
    }

    public void goldenSnitchRavenclaw (View view){
        ravenclawScore = ravenclawScore + 150;
        displayRavewclaw(ravenclawScore);
    }

    public void resetScore (View view) {
        gryffindorScore = 0;
        ravenclawScore = 0;
        displayRavewclaw(ravenclawScore);
        displayGryiffindor(gryffindorScore);
    }


    public void displayGryiffindor(int score) {
        TextView scoreView = (TextView) findViewById(R.id.gryffindor_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayRavewclaw(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ravenclaw_score);
        scoreView.setText(String.valueOf(score));
    }

}







