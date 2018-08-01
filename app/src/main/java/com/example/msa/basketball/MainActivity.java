package com.example.msa.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreTeamA=0;
    int scoreTeamB=0;
    int touches=0;
    public void increaseThreeForTeamA(View view) {
        touches+=1;
        if(touches<=20){
            scoreTeamA=scoreTeamA+3;
            displayScoreTeamA();
        }
        else {
            displayWinner();
        }
    }



    public void increaseTwoForTeamA(View view) {
        touches+=1;
        if(touches<=20){
            scoreTeamA=scoreTeamA+2;
            displayScoreTeamA();
        }
        else {
            displayWinner();
        }
    }

    public void increaseOneForTeamA(View view) {
        touches+=1;
        if(touches<=20){
            scoreTeamA=scoreTeamA+1;
            displayScoreTeamA();
        }
        else {
            displayWinner();
        }
    }
    private void displayScoreTeamA(){
        TextView scoreATextView = (TextView) findViewById(R.id.team_a_score);
        scoreATextView.setText("" + scoreTeamA);
    }

    private void displayScoreTeamB() {
        TextView scoreBTextView = (TextView) findViewById(R.id.team_b_score);
        scoreBTextView.setText("" + scoreTeamB);
    }

    public void increaseThreeForTeamB(View view) {
        touches+=1;
        if(touches<=20){
            scoreTeamB=scoreTeamB+3;
            displayScoreTeamB();
        }
        else {
            displayWinner();
        }
    }

    public void increaseTwoForTeamB(View view) {
        touches+=1;
        if(touches<=20){
            scoreTeamB=scoreTeamB+2;
            displayScoreTeamB();
        }
        else {
            displayWinner();
        }
    }

    public void increaseOneForTeamB(View view) {
        touches+=1;
        if(touches<=20){
            scoreTeamB=scoreTeamB+1;
            displayScoreTeamB();
        }
        else {
            displayWinner();
        }
    }

    public void resetScoreForTeam(View view) {
        TextView winnerTextView = (TextView) findViewById(R.id.winner);
        touches=0;
        scoreTeamA=0;
        scoreTeamB=0;
        displayScoreTeamA();
        displayScoreTeamB();
        winnerTextView.setText("");
    }
    private void displayWinner() {
        TextView winnerTextView = (TextView) findViewById(R.id.winner);
        if(scoreTeamA>scoreTeamB){
            winnerTextView.setText("Team A is a Winner!!");
        }
        else if(scoreTeamB>scoreTeamA){
            winnerTextView.setText("Team B is a Winner!!");
        }
        else{
            winnerTextView.setText("Draw");
        }


    }
}
