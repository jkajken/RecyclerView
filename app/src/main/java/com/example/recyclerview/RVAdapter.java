package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<CarViewHolder> {

    private ArrayList<Integer> carList1;

    private ArrayList<String> carList;

    public RVAdapter(ArrayList<Integer> carList1, ArrayList<String> carList) {
        this.carList1 = carList1;
        this.carList = carList;
    }

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CarViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.car_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
        holder.bind(carList1.get(position), carList.get(position));


    }

    @Override
    public int getItemCount() {
        return carList1.size();
    }
}
