package com.lcd.adtfitnessapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.lcd.adtfitnessapp.Fragment.BMIFragment;
import com.lcd.adtfitnessapp.Fragment.ReminderFragment;
import com.lcd.adtfitnessapp.Fragment.WorkoutFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new WorkoutFragment();
            case 1:
                return new ReminderFragment();
            case 2:
                return new BMIFragment();
            default:
                return  new WorkoutFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
