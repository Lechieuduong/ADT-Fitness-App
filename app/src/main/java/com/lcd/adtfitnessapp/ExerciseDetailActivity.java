package com.lcd.adtfitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class ExerciseDetailActivity extends AppCompatActivity {

    /*Button startBtn;
    private CountDownTimer countDownTimer;
    private boolean MTimeRunning;
    private long MTimeLeft;
    TextView mTextView;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_detail);
        Bundle bundle = getIntent().getExtras();
        if (bundle == null){
            return;
        }

        Exercise exercise = (Exercise) bundle.get("object_exercise");

        GifImageView gifImageDetail = findViewById(R.id.detail_exercise_gif);
        TextView tv_exname = findViewById(R.id.tv_detail_exercise_name);
        TextView tv_descrip = findViewById(R.id.tv_detail_exercise_descrip);
//        startBtn = findViewById(R.id.start_Button);
//        mTextView = findViewById(R.id.time);

        gifImageDetail.setImageResource(exercise.getResourceID());
        tv_exname.setText(exercise.getName());
        if (exercise.getName().equals("Jumping Jacks")){
            tv_descrip.setText("Steps:\n" +
                    "\n" +
                    "1. In this workout, you have to stand on the floor and extend your arm straight forward at your shoulder height.\n" +
                    "\n" +
                    "2. Then raise your arm above your head. Then return to the start position and repeat the full workout.");
//            mTextView.setText(exercise.getTime());
        }

        /*startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MTimeRunning){
                    stopTimer();
                }else {
                    startTimer();
                }
            }
        });*/
    }

    /*private void stopTimer(){
        countDownTimer.cancel();
        MTimeRunning = false;
        startBtn.setText("START");
    }

    private void startTimer(){
       final  CharSequence value1 = mTextView.getText();
       String num1 = value1.toString();
       String num2 = num1.substring(0,2);
       String num3 = num1.substring(3,5);

       final int number = Integer.valueOf(num2) * 60 + Integer.valueOf(num3);
       MTimeLeft = number*1000;

       countDownTimer = new CountDownTimer(MTimeLeft, 1000) {
           @Override
           public void onTick(long l) {
               MTimeLeft = l;
               updateTimer();
           }

           @Override
           public void onFinish() {
               Intent intent = new Intent(ExerciseDetailActivity.this, CongratulationActivity.class);
               intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
               startActivity(intent);
           }
       }.start();
       startBtn.setText("Pause");
       MTimeRunning = true;
    }

    private void updateTimer() {
        int minutes = (int) (MTimeLeft/60000);
        int seconds = (int) MTimeLeft%60000/1000;

        String timeLeftText="";
        if(minutes < 100)
            timeLeftText = "0";
        timeLeftText = timeLeftText+minutes+":";
        if (seconds < 100){
            timeLeftText+="0";
            timeLeftText+=seconds;
            mTextView.setText(timeLeftText);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }*/
}