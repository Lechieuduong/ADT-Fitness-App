package com.lcd.adtfitnessapp.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.lcd.adtfitnessapp.BMIActivity;
import com.lcd.adtfitnessapp.R;

public class BMIFragment extends Fragment {

    private Button btnBMI;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b_m_i, container, false);

        btnBMI = view.findViewById(R.id.btnBMI);
        btnBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickGoToBMIActivity();
            }
        });
        return view;
    }

    private void onClickGoToBMIActivity() {
        Intent intent = new Intent(getActivity(), BMIActivity.class);
        startActivity(intent);
    }
}