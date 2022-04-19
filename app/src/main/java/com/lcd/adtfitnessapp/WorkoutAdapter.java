package com.lcd.adtfitnessapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.lcd.adtfitnessapp.my_Interface.iClickItemWorkoutListener;

import java.util.List;

public class WorkoutAdapter extends  RecyclerView.Adapter<WorkoutAdapter.BeginnerWorkoutViewHolder> {
    private iClickItemWorkoutListener iClickItemWorkoutListener;
    private List<Workout> mListWorkout;

    public void setData(List<Workout> list, iClickItemWorkoutListener listener){
        this.mListWorkout = list;
        this.iClickItemWorkoutListener = listener;
    }

    @NonNull
    @Override
    public BeginnerWorkoutViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_beginner_workout, parent, false);
            return new BeginnerWorkoutViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BeginnerWorkoutViewHolder holder, int position) {
        Workout workout = mListWorkout.get(position);
        if(workout == null){
            return;
        }
        holder.imgBeginnerWorkout.setImageResource(workout.getResourceID());
        holder.tvBeginnerWorkout.setText(workout.getName());
        holder.cv_layout_beginner_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iClickItemWorkoutListener.onCLickItemWorkout(workout);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (mListWorkout != null){
            return mListWorkout.size();
        }
        return 0;
    }


    public class BeginnerWorkoutViewHolder extends RecyclerView.ViewHolder{
        private CardView cv_layout_beginner_item;
        private ImageView imgBeginnerWorkout;
        private TextView tvBeginnerWorkout;

        public BeginnerWorkoutViewHolder(@NonNull View itemView) {
            super(itemView);
            cv_layout_beginner_item = itemView.findViewById(R.id.layout_beginner_item);
            imgBeginnerWorkout = itemView.findViewById(R.id.img_beginner_workout);
            tvBeginnerWorkout = itemView.findViewById(R.id.tv_beginner_workout);
        }
    }



}
