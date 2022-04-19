package com.lcd.adtfitnessapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Message;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

public class WorkoutActivity extends AppCompatActivity {

    private RecyclerView rcvexercise;
    private ExerciseAdapter exerciseAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        rcvexercise = findViewById(R.id.rcv_excercise);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvexercise.setLayoutManager(linearLayoutManager);

        Bundle bundle = getIntent().getExtras();
        if(bundle == null){
            return;
        }

        Workout workout = (Workout) bundle.get("object_workout");
        TextView textWorkout = findViewById(R.id.textViewWorkout);
        textWorkout.setText(workout.getName());
        switch (workout.getName()) {
            case "ABS Beginner":
                exerciseAdapter = new ExerciseAdapter(this, getListABSBeExercise());
                rcvexercise.setAdapter(exerciseAdapter);
                break;
            case "Chest Beginner":
                exerciseAdapter = new ExerciseAdapter(this, getListChestBeExercise());
                rcvexercise.setAdapter(exerciseAdapter);
                break;
            case "Arm Beginner":
                exerciseAdapter = new ExerciseAdapter(this, getListArmBeExercise());
                rcvexercise.setAdapter(exerciseAdapter);
                break;
            case "Leg Beginner":
                exerciseAdapter = new ExerciseAdapter(this, getListLegBeExercise());
                rcvexercise.setAdapter(exerciseAdapter);
                break;
            case "Shoulder&Back Beginner":
                exerciseAdapter = new ExerciseAdapter(this, getListShoulderNBackBeExercise());
                rcvexercise.setAdapter(exerciseAdapter);
                break;
            case "ABS Intermediate":
                exerciseAdapter = new ExerciseAdapter(this, getListABSInterExercise());
                rcvexercise.setAdapter(exerciseAdapter);
                break;
            case "Chest Intermediate":
                exerciseAdapter = new ExerciseAdapter(this, getListChestInterExercise());
                rcvexercise.setAdapter(exerciseAdapter);
                break;
            case "Arm Intermediate":
                exerciseAdapter = new ExerciseAdapter(this, getListArmInterExercise());
                rcvexercise.setAdapter(exerciseAdapter);
                break;
            case "Leg Intermediate":
                exerciseAdapter = new ExerciseAdapter(this, getListLegInterExercise());
                rcvexercise.setAdapter(exerciseAdapter);
                break;
            case "Shoulder&Back Intermediate":
                exerciseAdapter = new ExerciseAdapter(this, getListShoulderNBackInterExercise());
                rcvexercise.setAdapter(exerciseAdapter);
                break;
        }


    }

    private List<Exercise> getListABSBeExercise() {
        List<Exercise> list = new ArrayList<>();
            list.add(new Exercise(R.drawable.jumpingjack, "Jumping Jacks", "00:20"));
            list.add(new Exercise(R.drawable.adominal, "Abdominal Crunches x2", "00:30"));
            list.add(new Exercise(R.drawable.russiantwist, "Russian Twist x2", "00:30"));
            list.add(new Exercise(R.drawable.mountainclimber, "Mountain Climber x2", "00:30"));
            list.add(new Exercise(R.drawable.heeltouch, "Heel Touch x2", "00:30"));
            list.add(new Exercise(R.drawable.legraises, "Leg Raises x2", "00:30"));
            list.add(new Exercise(R.drawable.plank, "Plank x2", "00:30"));
            list.add(new Exercise(R.drawable.cobra, "Cobra Stretch", "00:30"));
            list.add(new Exercise(R.drawable.upperleft, "Gluteal And Lumbar Rotation Left", "00:30"));
            list.add(new Exercise(R.drawable.upperright, "Gluteal And Lumbar Rotation Right", "00:30"));

        return list;
    }

    private List<Exercise> getListChestBeExercise() {
        List<Exercise> list = new ArrayList<>();
        list.add(new Exercise(R.drawable.jumpingjack, "Jumping Jacks", "00:30"));
        list.add(new Exercise(R.drawable.inclinepu, "Incline Push-ups", "x16"));
        list.add(new Exercise(R.drawable.kneepu, "Knee Push-ups x2", "x12"));
        list.add(new Exercise(R.drawable.pushups, "Push-ups", "x10"));
        list.add(new Exercise(R.drawable.widearmspu, "Wide arm push-ups", "x10"));
        list.add(new Exercise(R.drawable.inclinepu, "Incline Push-ups ", "x12"));
        list.add(new Exercise(R.drawable.box_pu, "Box Push-ups", "x12"));
        list.add(new Exercise(R.drawable.widearmspu, "Wide arm push-ups", "x10"));
        list.add(new Exercise(R.drawable.hindupu, "Hindu Push-ups", "x10"));
        list.add(new Exercise(R.drawable.cobra, "Cobra Stretch", "00:20"));
        list.add(new Exercise(R.drawable.cheststretch, "Chest Stretch", "00:20"));

        return list;
    }

    private List<Exercise> getListArmBeExercise() {
        List<Exercise> list = new ArrayList<>();
        list.add(new Exercise(R.drawable.armraisearmsbeginner, "Arm Raises", "00:30"));
        list.add(new Exercise(R.drawable.sidearmraise, "Side Arm Raise", "00:30"));
        list.add(new Exercise(R.drawable.tricepsdips, "Triceps Dips", "x10"));
        list.add(new Exercise(R.drawable.armcircleclockwise, "Arm Circles Clockwise", "00:30"));
        list.add(new Exercise(R.drawable.armcircleanticlo, "Arm Circles CounterClockwise", "00:30"));
        list.add(new Exercise(R.drawable.diamondpushups, "Diamond Push-ups", "x6"));
        list.add(new Exercise(R.drawable.jumpingjack, "Jumping Jacks", "00:30"));
        list.add(new Exercise(R.drawable.chestpresspulse, "Chest Press Pulse", "00:16"));
        list.add(new Exercise(R.drawable.legbarellcurlleft, "Leg Barbell Curl Left", "x8"));
        list.add(new Exercise(R.drawable.legbarbellcurlright, "Leg Barbell Curl Right", "x8"));
        list.add(new Exercise(R.drawable.diagonalplank, "Diagonal Plank", "x10"));
        list.add(new Exercise(R.drawable.punches, "Punches", "00:30"));
        list.add(new Exercise(R.drawable.pushups1, "Push-ups", "x10"));
        list.add(new Exercise(R.drawable.inchworms, "Inchworms", "x8"));
        list.add(new Exercise(R.drawable.wallpushup, "Wall Push-úp", "x12"));
        list.add(new Exercise(R.drawable.tricepsstretchleft, "Triceps Stretch Left", "00:30"));
        list.add(new Exercise(R.drawable.tricepsstretchright, "Triceps Stretch Right", "00:30"));
        list.add(new Exercise(R.drawable.bicepsstretchleft, "Standing Biceps Stretch Left", "00:30"));
        list.add(new Exercise(R.drawable.bicepsstretch, "Standing Biceps Stretch Right", "00:30"));

        return list;
    }

    private List<Exercise> getListLegBeExercise() {
        List<Exercise> list = new ArrayList<>();
        list.add(new Exercise(R.drawable.sidehops, "Side Hop", "00:30"));
        list.add(new Exercise(R.drawable.squats, "Squats", "x12"));
        list.add(new Exercise(R.drawable.squats, "Squats", "x12"));
        list.add(new Exercise(R.drawable.sidelyinglegliftleft, "Side-Lying Leg Lift Left", "x12"));
        list.add(new Exercise(R.drawable.sidelyinglegliftleft, "Side-Lying Leg Lift Right", "x12"));
        list.add(new Exercise(R.drawable.sidelyinglegliftleft, "Side-Lying Leg Lift Left", "x12"));
        list.add(new Exercise(R.drawable.sidelyinglegliftleft, "Side-Lying Leg Lift Right", "x12"));
        list.add(new Exercise(R.drawable.backwardlunge, "Backward Lunge", "x14"));
        list.add(new Exercise(R.drawable.backwardlunge, "Backward Lunge", "x14"));
        list.add(new Exercise(R.drawable.donkeykicks, "Donkey Kicks Left", "x16"));
        list.add(new Exercise(R.drawable.donkeykicks, "Donkey Kicks Right", "x16"));
        list.add(new Exercise(R.drawable.donkeykicks, "Donkey Kicks Left", "x16"));
        list.add(new Exercise(R.drawable.donkeykicks, "Donkey Kicks Right", "x16"));
        list.add(new Exercise(R.drawable.quadstretch, "Left Quad Stretch", "00:30"));
        list.add(new Exercise(R.drawable.quadstretch, "Right Quad Stretch", "00:30"));
        list.add(new Exercise(R.drawable.kneetochest, "Knee To Chest Stretch Left", "00:30"));
        list.add(new Exercise(R.drawable.kneetochest, "Knee To Chest Stretch Right", "00:30"));
        list.add(new Exercise(R.drawable.calfstretch, "Calf Stretch Left", "00:30"));
        list.add(new Exercise(R.drawable.calfstretch, "Calf Stretch Right", "00:30"));
        list.add(new Exercise(R.drawable.sumosquat, "Sumo Squat Calf Raises", "x12"));
        list.add(new Exercise(R.drawable.sumosquat, "Sumo Squat Calf Raises", "x12"));

        return list;
    }

    private List<Exercise> getListShoulderNBackBeExercise() {
        List<Exercise> list = new ArrayList<>();
        list.add(new Exercise(R.drawable.jumpingjack, "Jumping Jacks", "00:30"));
        list.add(new Exercise(R.drawable.armraisearmsbeginner, "Arm Raises", "00:16"));
        list.add(new Exercise(R.drawable.rhomboidpulls, "Rhomboid Pulls", "x14"));
        list.add(new Exercise(R.drawable.sidearmraise, "Side Arm Raise", "00:16"));
        list.add(new Exercise(R.drawable.kneepushuos, "Knee Push-Ups", "x14"));
        list.add(new Exercise(R.drawable.sidelyingfloorstretch, "Side-Lying Floor Stretch Left", "00:30"));
        list.add(new Exercise(R.drawable.sidelyingfloorstretchright, "Side-Lying Floor Stretch Right", "00:30"));
        list.add(new Exercise(R.drawable.armscissor, "Arm Scissors", "00:30"));
        list.add(new Exercise(R.drawable.rhomboidpulls, "Rhomboid Pulls", "x12"));
        list.add(new Exercise(R.drawable.kneepushuos, "Knee Push-Ups", "x12"));
        list.add(new Exercise(R.drawable.catcoepose, "Cat Cow Pose", "00:30"));
        list.add(new Exercise(R.drawable.pronetricepspushupe, "Prone Triceps Push Ups", "x14"));
        list.add(new Exercise(R.drawable.reclinedromboidsqueeze, "Reclined Rhomboid Squeezes", "x12"));
        list.add(new Exercise(R.drawable.pronetricepspushupe, "Prone Triceps Push Ups", "x14"));
        list.add(new Exercise(R.drawable.reclinedromboidsqueeze, "Reclined Rhomboid Squeezes", "x12"));
        list.add(new Exercise(R.drawable.childpose, "Child's Pose", "00:30"));

        return list;
    }

    private List<Exercise> getListABSInterExercise() {
        List<Exercise> list = new ArrayList<>();
        list.add(new Exercise(R.drawable.jumpingjack, "Jumping Jacks", "00:30"));
        list.add(new Exercise(R.drawable.heeltouch, "Heel Touch", "x26"));
        list.add(new Exercise(R.drawable.bycyclecrunch, "Bicycle Crunch", "x20"));
        list.add(new Exercise(R.drawable.mountainclimber, "Mountain Climber", "x20"));
        list.add(new Exercise(R.drawable.sidebridges, "Side Bridges Left", "x12"));
        list.add(new Exercise(R.drawable.sidebridges, "Side Bridges Right", "x12"));
        list.add(new Exercise(R.drawable.buttbridge, "Butt Bridge", "x20"));
        list.add(new Exercise(R.drawable.bycyclecrunch, "Bicycle Crunch", "x20"));
        list.add(new Exercise(R.drawable.vup, "V-Up", "x20"));
        list.add(new Exercise(R.drawable.heeltouch, "Heel Touch", "x26"));
        list.add(new Exercise(R.drawable.adominal, "Abdominal Crunches", "x20"));
        list.add(new Exercise(R.drawable.plank, "Plank", "00:30"));
        list.add(new Exercise(R.drawable.bycyclecrunch, "Bicycle Crunch", "x20"));
        list.add(new Exercise(R.drawable.pushuprotation, "Push-up & Rotation", "x20"));
        list.add(new Exercise(R.drawable.sideplank, "Side Plank Right", "00:20"));
        list.add(new Exercise(R.drawable.sideplank, "Side Plank Left", "00:20"));
        list.add(new Exercise(R.drawable.cobra, "Cobra Stretch", "00:30"));
        list.add(new Exercise(R.drawable.spinelumbartwistleft, "Spine lumbar twist stretch left", "00:30"));
        list.add(new Exercise(R.drawable.spinelumbartwistright, "Spine lumbar twist stretch right", "00:30"));

        return list;
    }

    private List<Exercise> getListChestInterExercise() {
        List<Exercise> list = new ArrayList<>();
        list.add(new Exercise(R.drawable.jumpingjack, "Jumping Jacks", "00:30"));
        list.add(new Exercise(R.drawable.kneepushuos, "Knee Push-ups", "x12"));
        list.add(new Exercise(R.drawable.pushups1, "Push-Ups", "x12"));
        list.add(new Exercise(R.drawable.widearmspu, "Wide Arm Push-Ups", "x16"));
        list.add(new Exercise(R.drawable.hindupu, "Hindu Push-Ups", "x10"));
        list.add(new Exercise(R.drawable.staggeredarmpushup, "Staggered Push-Ups", "x12"));
        list.add(new Exercise(R.drawable.pushuprotation, "Push-Up & Rotation", "x10"));
        list.add(new Exercise(R.drawable.kneepushuos, "Knee Push-Ups", "x10"));
        list.add(new Exercise(R.drawable.hindupu, "Hindu Push-Ups", "x10"));
        list.add(new Exercise(R.drawable.declinepu, "Decline Push-Ups", "x12"));
        list.add(new Exercise(R.drawable.staggeredarmpushup, "Staggered Push-Ups", "x10"));
        list.add(new Exercise(R.drawable.shoulderstretch, "Shoulder Stretch", "00:30"));
        list.add(new Exercise(R.drawable.cobra, "Cobra Stretch", "00:30"));
        list.add(new Exercise(R.drawable.cheststretch, "Chest Stretch", "00:30"));

        return list;
    }

    private List<Exercise> getListArmInterExercise() {
        List<Exercise> list = new ArrayList<>();
        list.add(new Exercise(R.drawable.armcircleclockwise, "Arm Circles Clockwise", "00:30"));
        list.add(new Exercise(R.drawable.armcircleanticlo, "Arm Circles CounterClockwise", "00:30"));
        list.add(new Exercise(R.drawable.floortricepdips, "Floor Tricep Dips", "x14"));
        list.add(new Exercise(R.drawable.militarypu, "Military Push Ups", "x12"));
        list.add(new Exercise(R.drawable.alterhook, "Alternating Hooks", "00:30"));
        list.add(new Exercise(R.drawable.pushuprotation, "Push-Up & Rotation", "x12"));
        list.add(new Exercise(R.drawable.legbarellcurlleft, "Leg Barbell Curl Left", "x12"));
        list.add(new Exercise(R.drawable.legbarbellcurlright, "Leg Barbell Curl Right", "x12"));
        list.add(new Exercise(R.drawable.floortricepdips, "Floor Tricep Dips", "x14"));
        list.add(new Exercise(R.drawable.militarypu, "Military Push Ups", "x10"));
        list.add(new Exercise(R.drawable.alterhook, "Alternating Hooks", "00:30"));
        list.add(new Exercise(R.drawable.pushuprotation, "Push-Up & Rotation", "x10"));
        list.add(new Exercise(R.drawable.legbarellcurlleft, "Leg Barbell Curl Left", "x10"));
        list.add(new Exercise(R.drawable.legbarbellcurlright, "Leg Barbell Curl Right", "x10"));
        list.add(new Exercise(R.drawable.skippingwithourope, "Skipping Without Rope", "00:30"));
        list.add(new Exercise(R.drawable.pushups1, "Push-ups", "x14"));
        list.add(new Exercise(R.drawable.burpees, "Burpees", "x10"));
        list.add(new Exercise(R.drawable.armscissor, "Arm Scissors", "00:30"));
        list.add(new Exercise(R.drawable.skippingwithourope, "Skipping Without Rope", "00:30"));
        list.add(new Exercise(R.drawable.pushups1, "Push-ups", "x12"));
        list.add(new Exercise(R.drawable.burpees, "Burpees", "x8"));
        list.add(new Exercise(R.drawable.tricepsstretchleft, "Triceps Stretch Left", "00:30"));
        list.add(new Exercise(R.drawable.tricepsstretchright, "Triceps Stretch Right", "00:30"));
        list.add(new Exercise(R.drawable.bicepsstretchleft, "Standing Biceps Stretch Left", "00:30"));
        list.add(new Exercise(R.drawable.bicepsstretch, "Standing Biceps Stretch Right", "00:30"));

        return list;
    }

    private List<Exercise> getListLegInterExercise() {
        List<Exercise> list = new ArrayList<>();
        list.add(new Exercise(R.drawable.sidehops, "Side Hop", "00:30"));
        list.add(new Exercise(R.drawable.squats, "Squats", "x12"));
        list.add(new Exercise(R.drawable.squats, "Squats", "x12"));
        list.add(new Exercise(R.drawable.sidelyinglegliftleft, "Side-Lying Leg Lift Left", "x12"));
        list.add(new Exercise(R.drawable.sidelyinglegliftleft, "Side-Lying Leg Lift Right", "x12"));
        list.add(new Exercise(R.drawable.sidelyinglegliftleft, "Side-Lying Leg Lift Left", "x12"));
        list.add(new Exercise(R.drawable.sidelyinglegliftleft, "Side-Lying Leg Lift Right", "x12"));
        list.add(new Exercise(R.drawable.backwardlunge, "Backward Lunge", "x14"));
        list.add(new Exercise(R.drawable.backwardlunge, "Backward Lunge", "x14"));
        list.add(new Exercise(R.drawable.donkeykicks, "Donkey Kicks Left", "x16"));
        list.add(new Exercise(R.drawable.donkeykicks, "Donkey Kicks Right", "x16"));
        list.add(new Exercise(R.drawable.donkeykicks, "Donkey Kicks Left", "x16"));
        list.add(new Exercise(R.drawable.donkeykicks, "Donkey Kicks Right", "x16"));
        list.add(new Exercise(R.drawable.quadstretch, "Left Quad Stretch", "00:30"));
        list.add(new Exercise(R.drawable.quadstretch, "Right Quad Stretch", "00:30"));
        list.add(new Exercise(R.drawable.kneetochest, "Knee To Chest Stretch Left", "00:30"));
        list.add(new Exercise(R.drawable.kneetochest, "Knee To Chest Stretch Right", "00:30"));
        list.add(new Exercise(R.drawable.calfstretch, "Calf Stretch Left", "00:30"));
        list.add(new Exercise(R.drawable.calfstretch, "Calf Stretch Right", "00:30"));
        list.add(new Exercise(R.drawable.sumosquat, "Sumo Squat Calf Raises", "x12"));
        list.add(new Exercise(R.drawable.sumosquat, "Sumo Squat Calf Raises", "x12"));

        return list;
    }

    private List<Exercise> getListShoulderNBackInterExercise() {
        List<Exercise> list = new ArrayList<>();
        list.add(new Exercise(R.drawable.jumpingjack, "Jumping Jacks", "00:30"));
        list.add(new Exercise(R.drawable.armraisearmsbeginner, "Arm Raises", "00:16"));
        list.add(new Exercise(R.drawable.rhomboidpulls, "Rhomboid Pulls", "x14"));
        list.add(new Exercise(R.drawable.sidearmraise, "Side Arm Raise", "00:16"));
        list.add(new Exercise(R.drawable.kneepushuos, "Knee Push-Ups", "x14"));
        list.add(new Exercise(R.drawable.sidelyingfloorstretch, "Side-Lying Floor Stretch Left", "00:30"));
        list.add(new Exercise(R.drawable.sidelyingfloorstretchright, "Side-Lying Floor Stretch Right", "00:30"));
        list.add(new Exercise(R.drawable.armscissor, "Arm Scissors", "00:30"));
        list.add(new Exercise(R.drawable.rhomboidpulls, "Rhomboid Pulls", "x12"));
        list.add(new Exercise(R.drawable.kneepushuos, "Knee Push-Ups", "x12"));
        list.add(new Exercise(R.drawable.catcoepose, "Cat Cow Pose", "00:30"));
        list.add(new Exercise(R.drawable.pronetricepspushupe, "Prone Triceps Push Ups", "x14"));
        list.add(new Exercise(R.drawable.reclinedromboidsqueeze, "Reclined Rhomboid Squeezes", "x12"));
        list.add(new Exercise(R.drawable.pronetricepspushupe, "Prone Triceps Push Ups", "x14"));
        list.add(new Exercise(R.drawable.reclinedromboidsqueeze, "Reclined Rhomboid Squeezes", "x12"));
        list.add(new Exercise(R.drawable.childpose, "Child's Pose", "00:30"));

        return list;
    }
}