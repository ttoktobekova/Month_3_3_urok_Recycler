package com.example.month_3_3_urok_recycler;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class foodViewHolder extends RecyclerView.ViewHolder {
    private TextView tvFood;
    public foodViewHolder(@NonNull View itemView) {
        super(itemView);
        tvFood = itemView.findViewById(R.id.tv_food);
    }
    @SuppressLint("ResourceAsColor")
    public void onBind(String food){
        if (food == "Лагман"){
            tvFood.setTextColor(R.color.pink);
        }
        tvFood.setText(food);

    }
}
