package com.shady.nanogerdree.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView team1Tv;
    TextView team2Tv;
    Button team1_1_Bt;
    Button team2_1_Bt;
    Button team1_2_Bt;
    Button team2_2_Bt;
    Button team1_3_Bt;
    Button team2_3_Bt;
    Button resetBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        team1Tv = findViewById(R.id.team1_tv);
        team2Tv = findViewById(R.id.team2_tv);
        team1_1_Bt = findViewById(R.id.team1_1_bt);
        team2_1_Bt = findViewById(R.id.team2_1_bt);
        team1_2_Bt = findViewById(R.id.team1_2_bt);
        team2_2_Bt = findViewById(R.id.team2_2_bt);
        team1_3_Bt = findViewById(R.id.team1_3_bt);
        team2_3_Bt = findViewById(R.id.team2_3_bt);
        resetBt = findViewById(R.id.reset_bt);

        team1_1_Bt.setText(getString(R.string.score,1));
        team2_1_Bt.setText(getString(R.string.score,1));
        team1_2_Bt.setText(getString(R.string.score,2));
        team2_2_Bt.setText(getString(R.string.score,2));
        team1_3_Bt.setText(getString(R.string.score,3));
        team2_3_Bt.setText(getString(R.string.score,3));

        team1_1_Bt.setOnClickListener(this);
        team2_1_Bt.setOnClickListener(this);
        team1_2_Bt.setOnClickListener(this);
        team2_2_Bt.setOnClickListener(this);
        team1_3_Bt.setOnClickListener(this);
        team2_3_Bt.setOnClickListener(this);
    }

    public void onClick(final View v) {
        switch(v.getId()){
            case R.id.team1_1_bt:
                addScoreToTeam(team1Tv , 1);
                break;
            case R.id.team2_1_bt:
                addScoreToTeam(team2Tv , 1);
                break;
            case R.id.team1_2_bt:
                addScoreToTeam(team1Tv , 2);
                break;
            case R.id.team2_2_bt:
                addScoreToTeam(team2Tv , 2);
                break;
            case R.id.team1_3_bt:
                addScoreToTeam(team1Tv , 3);
                break;
            case R.id.team2_3_bt:
                addScoreToTeam(team2Tv , 3);
                break;
            case R.id.reset_bt:
                team1Tv.setText("0");
                team2Tv.setText("0");
                break;
        }
    }

    public void addScoreToTeam(TextView v, Integer addToScore){
        Integer currentTeamScore = Integer.parseInt(v.getText().toString());
        currentTeamScore = currentTeamScore + addToScore;
        v.setText(String.valueOf(currentTeamScore));
    }
}
