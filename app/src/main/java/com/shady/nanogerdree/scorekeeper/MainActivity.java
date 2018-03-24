package com.shady.nanogerdree.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView team1Tv;
    TextView team2Tv;
    Button team1Bt;
    Button team2Bt;
    Button resetBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        team1Tv = findViewById(R.id.team1_tv);
        team2Tv = findViewById(R.id.team2_tv);
        team1Bt = findViewById(R.id.team1_bt);
        team2Bt = findViewById(R.id.team2_bt);
        resetBt = findViewById(R.id.reset_bt);

        team1Bt.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v)
            {
                addScoreToTeam(team1Tv);
            }
        });

        team2Bt.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v)
            {
                addScoreToTeam(team2Tv);
            }
        });

        resetBt.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v)
            {
                team1Tv.setText("0");
                team2Tv.setText("0");
            }
        });


    }

    public void addScoreToTeam(TextView v){
        Integer currentTeamScore = Integer.parseInt(v.getText().toString());
        currentTeamScore++;
        v.setText(String.valueOf(currentTeamScore));
    }
}
