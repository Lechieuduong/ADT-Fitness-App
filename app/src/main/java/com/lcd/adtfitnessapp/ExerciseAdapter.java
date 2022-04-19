package com.lcd.adtfitnessapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import pl.droidsonroids.gif.GifImageView;

public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.ExerciseViewHolder> {

    private List<Exercise> mListExercise;
    private Context mContext;

    public ExerciseAdapter(Context context,List<Exercise> mListExercise) {
        this.mContext = context;
        this.mListExercise = mListExercise;
    }

    @NonNull
    @Override
    public ExerciseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_exercise, parent, false);
        return new ExerciseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseViewHolder holder, int position) {
        final Exercise exercise = mListExercise.get(position);
        if (exercise == null){
            return;
        }

        holder.gifImageView.setImageResource(exercise.getResourceID());
        holder.tv_exerName.setText(exercise.getName());
        holder.tv_time.setText(exercise.getTime());

        holder.relativeLayoutItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickGoToDetail(exercise);
            }
        });
    }

    private void onClickGoToDetail(Exercise exercise){
        Intent intent = new Intent(mContext, ExerciseDetailActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("object_exercise", exercise);
        intent.putExtras(bundle);
        mContext.startActivity(intent);
    }

    @Override
    public int getItemCount() {
        if (mListExercise != null){
            return mListExercise.size();
        }
        return 0;
    }

    public class ExerciseViewHolder extends RecyclerView.ViewHolder{

        private RelativeLayout relativeLayoutItem;
        private GifImageView gifImageView;
        private TextView tv_exerName;
        private TextView tv_time;

        public ExerciseViewHolder(@NonNull View itemView) {
            super(itemView);

            gifImageView = itemView.findViewById(R.id.excercise_gif);
            tv_exerName = itemView.findViewById(R.id.tv_exercise_name);
            tv_time = itemView.findViewById(R.id.tv_exercise_time);
            relativeLayoutItem = itemView.findViewById(R.id.layout_item_exercise);
        }
    }
}
