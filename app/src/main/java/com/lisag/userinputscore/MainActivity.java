package com.lisag.userinputscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int team1 = 1, team2 = 1;
    int geel1 = 1, geel2 = 1;
    int rood1 = 1, rood2 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void score1(View view) {
        puntenTeam1(team1++);
        if (team1 >= 100) { team1 = 99; }
    }

    public void geleKaart1(View view) {
        geelTeam1 (geel1++);
        if (geel1 > 2) { geel1 = 0; }
    }

    public void rodeKaart1(View view) {
        roodTeam1 (rood1++);
        if (rood1 >= 5) { rood1 = 5; }
    }


    public void score2(View view) {
        puntenTeam2 (team2++);
        if (team2 >= 100) { team2 = 99; }
    }

    public void geleKaart2(View view) {
        geelTeam2 (geel2++);
        if (geel2 >= 2) { geel2 = 0; }
    }

    public void rodeKaart2(View view) {
        roodTeam2 (rood2++);
        if (rood2 >= 5) { rood2 = 5; }
    }



    private void puntenTeam1(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.punten1);
        quantityTextView.setText("Punten: " + number);
    }

    private void geelTeam1(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.geel1);
        quantityTextView.setText("Gele kaarten: " + number);
    }

    private void roodTeam1(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.rood1);
        quantityTextView.setText("Rode kaarten: " + number);
    }


    private void puntenTeam2(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.punten2);
        quantityTextView.setText("Punten: " + number);
    }


    private void geelTeam2(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.geel2);
        quantityTextView.setText("Gele kaarten: " + number);
    }


    private void roodTeam2(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.rood2);
        quantityTextView.setText("Rode kaarten: " + number);
    }

}
