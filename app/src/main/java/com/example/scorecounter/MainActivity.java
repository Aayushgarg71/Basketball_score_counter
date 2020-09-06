package com.example.scorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    static int scoreA=0;
       public void  threepoints(View view) {
        scoreA = scoreA + 3;
        TextView obj = (TextView) findViewById(R.id.score);
        obj.setText(String.valueOf(scoreA));
    }
    public void twopoints(View view) {
        scoreA = scoreA + 2;
        TextView obj = (TextView) findViewById(R.id.score);
        obj.setText(String.valueOf(scoreA));
    }
    public void freethrow(View view) {
        scoreA = scoreA + 1;
        TextView obj = (TextView) findViewById(R.id.score);
        obj.setText(String.valueOf(scoreA));
    }
    static int scoreB=0;
    public void  threeBpoints(View view) {
        scoreB = scoreB + 3;
        TextView obj = (TextView) findViewById(R.id.scoreB);
        obj.setText(String.valueOf(scoreB));
    }
    public void twoBpoints(View view) {
        scoreB = scoreB + 2;
        TextView obj = (TextView) findViewById(R.id.scoreB);
        obj.setText(String.valueOf(scoreB));
    }
    public void freethrowB(View view) {
        scoreB = scoreB + 1;
        TextView obj = (TextView) findViewById(R.id.scoreB);
        obj.setText(String.valueOf(scoreB));
    }
    public void reset(View view){
        scoreA=0;
        scoreB=0;
        TextView obj = (TextView) findViewById(R.id.scoreB);
        obj.setText(String.valueOf(scoreB));
        TextView obj1 = (TextView) findViewById(R.id.score);
        obj1.setText(String.valueOf(scoreA));
    }
}