package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class CarViewHolder extends RecyclerView.ViewHolder {
    private TextView tvCar;
    private ImageView imageViewCar;

    public CarViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCar = itemView.findViewById(R.id.tv_car);
        imageViewCar = itemView.findViewById(R.id.imageView);
    }

    public void bind(Integer integer, String name) {
        imageViewCar.setImageResource(integer);
        tvCar.setText(name);
    }
}
