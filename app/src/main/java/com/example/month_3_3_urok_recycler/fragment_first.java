package com.example.month_3_3_urok_recycler;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class fragment_first extends Fragment {
    private RecyclerView rvfood;
    private ArrayList<String> foodList = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        FoodAdapter adapter = new FoodAdapter(foodList);
        rvfood = requireActivity().findViewById(R.id.rv_food);
        rvfood.setAdapter(adapter);
    }

    private void loadData() {
        foodList.add("Пицца");
        foodList.add("Рамен");
        foodList.add("Пахлава");
        foodList.add("Лагман");
        foodList.add("Плов");
        foodList.add("Жаркоп");
        foodList.add("Люля кебаб");
        foodList.add("Суши");
        foodList.add("Макаронсы");
        foodList.add("Паста");
        foodList.add("Пельмени");
        foodList.add("Xot dog");
        foodList.add("Burger");
        foodList.add("Donner");
        foodList.add("Xinkal");
        foodList.add("Ашлян Фу");
        foodList.add("Пицца");
        foodList.add("Рамен");
        foodList.add("Пахлава");
        foodList.add("Лагман");
        foodList.add("Плов");
        foodList.add("Жаркоп");
        foodList.add("Люля кебаб");
        foodList.add("Суши");
        foodList.add("Макаронсы");
        foodList.add("Паста");
        foodList.add("Пельмени");
        foodList.add("Xot dog");
        foodList.add("Burger");
        foodList.add("Donner");
        foodList.add("Xinkal");
        foodList.add("Ашлян Фу");
    }
}