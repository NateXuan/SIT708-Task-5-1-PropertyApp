package com.example.sit708_task_5_1_property;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.MyViewHolder> {
    private int []array;

    public RvAdapter(int[] array) {
        this.array = array;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_view, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imageView.setImageResource(array[position]);
    }

    @Override
    public int getItemCount() {
        return array.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView address;
        TextView price;
        TextView houseType;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            address = itemView.findViewById(R.id.address);
            price = itemView.findViewById(R.id.price);
            houseType = itemView.findViewById(R.id.houseType);
        }
    }
}

