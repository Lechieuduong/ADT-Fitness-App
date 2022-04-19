package com.lcd.adtfitnessapp.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lcd.adtfitnessapp.R;
import com.lcd.adtfitnessapp.Workout;
import com.lcd.adtfitnessapp.WorkoutActivity;
import com.lcd.adtfitnessapp.WorkoutAdapter;
import com.lcd.adtfitnessapp.my_Interface.iClickItemWorkoutListener;

import java.util.ArrayList;
import java.util.List;

public class WorkoutFragment extends Fragment {

    private RecyclerView rcvWorkout;
    private WorkoutAdapter workoutAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_workout, container, false);

        // RecyclerView
        rcvWorkout = view.findViewById(R.id.rcv_workout);
        workoutAdapter = new WorkoutAdapter();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());

        rcvWorkout.setLayoutManager(linearLayoutManager);

        workoutAdapter.setData(getListWorkout(), new iClickItemWorkoutListener() {
            @Override
            public void onCLickItemWorkout(Workout workout) {
                onClickGoToExcercise(workout);
            }
        });
        rcvWorkout.setAdapter(workoutAdapter);

        return view;
    }

    private List<Workout> getListWorkout(){
        List<Workout> workout = new ArrayList<>();
//        workout.add(new Workout(1,"Beginner"));
        workout.add(new Workout(R.drawable.absbeginner, "ABS Beginner"));
        workout.add(new Workout(R.drawable.chestbeginner, "Chest Beginner"));
        workout.add(new Workout(R.drawable.armbeginner, "Arm Beginner"));
        workout.add(new Workout(R.drawable.legbeginner, "Leg Beginner"));
        workout.add(new Workout(R.drawable.shoulderbackbeginner, "Shoulder&Back Beginner"));

//        workout.add(new Workout(2, "Intermediate"));
        workout.add(new Workout(R.drawable.absintermediate, "ABS Intermediate"));
        workout.add(new Workout(R.drawable.chestintermediate, "Chest Intermediate"));
        workout.add(new Workout(R.drawable.absintermediate, "Arm Intermediate"));
        workout.add(new Workout(R.drawable.legintermediate, "Leg Intermediate"));
        workout.add(new Workout(R.drawable.shoulderbackintermediate, "Shoulder&Back Intermediate"));

        return workout;
    }

    public void onDestroy(){
        super.onDestroy();
    }

    private void onClickGoToExcercise(Workout workout) {
        Intent intent = new Intent(getActivity(), WorkoutActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("object_workout", workout);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}