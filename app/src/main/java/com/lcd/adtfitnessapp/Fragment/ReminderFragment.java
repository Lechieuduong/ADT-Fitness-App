package com.lcd.adtfitnessapp.Fragment;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import com.lcd.adtfitnessapp.AlarmReceiver;
import com.lcd.adtfitnessapp.R;

import java.util.Calendar;

public class ReminderFragment extends Fragment {

    private int notificationId = 1;
    Button btnSet, btnCancel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_reminder, container, false);

        EditText editText = view.findViewById(R.id.et_reminder);
        TimePicker timePicker = view.findViewById(R.id.tp_reminder);

        Intent intent = new Intent(getActivity(), AlarmReceiver.class);
        intent.putExtra("notificationId", notificationId);
        intent.putExtra("message", editText.getText().toString());

        //PendingIntent
        PendingIntent alarmIntent = PendingIntent.getBroadcast(
                getActivity(), 0, intent, PendingIntent.FLAG_CANCEL_CURRENT
        );

        AlarmManager alarmManager = (AlarmManager) getActivity().getSystemService(Context.ALARM_SERVICE);


        //set onclick listener
        btnSet = view.findViewById(R.id.setBtn);
        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int hour = timePicker.getHour();
                int minute = timePicker.getMinute();

                //Create time
                Calendar startTime = Calendar.getInstance();
                startTime.set(Calendar.HOUR_OF_DAY, hour);
                startTime.set(Calendar.MINUTE, minute);
                startTime.set(Calendar.SECOND, 0);
                long alarmStartTime = startTime.getTimeInMillis();

                // Set Alarm
                alarmManager.set(AlarmManager.RTC_WAKEUP, alarmStartTime, alarmIntent);

                Toast.makeText(getActivity(), "Done!", Toast.LENGTH_SHORT).show();

            }
        });

        btnCancel = view.findViewById(R.id.cancelBtn);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Cancel Alarm
                alarmManager.cancel(alarmIntent);
                Toast.makeText(getActivity(), "Canceled", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}