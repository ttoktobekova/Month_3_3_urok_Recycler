package com.example.month_3_3_urok_recycler;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<foodViewHolder> {
    private ArrayList<String> foodList;

    public FoodAdapter(ArrayList<String> foodList) {
        this.foodList = foodList;
    }

    @NonNull
    @Override
    public foodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new foodViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull foodViewHolder holder, int position) {
        holder.onBind(foodList.get(position));
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }
}
