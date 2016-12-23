package com.shenshang.game2048;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    private static MainActivity mainActivity = null;
    private int score = 0;
    private TextView tvScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvScore = (TextView) findViewById(R.id.tvScore);
        //游戏还是有bug的就是当如果没有按下重新开始的时候游戏不会重新开始，结果就是整个游戏卡死了

    }


    public void setTvScore(TextView tvScore) {
        this.tvScore = tvScore;
    }

    public void setScoreClear() {
        tvScore.setText("0");
    }

    public MainActivity() {
        mainActivity = this;
    }

    public static MainActivity getMainActivity() {
        return mainActivity;
    }

    public void clearScore() {
        score = 0;
        showScore();
    }

    public void showScore() {
        tvScore.setText(score + "");
    }

    public void addScore(int s) {
        score += s;
        showScore();
    }
}
