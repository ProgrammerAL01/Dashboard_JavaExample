package com.example.dashboard_javaexample.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dashboard_javaexample.R;
import com.example.dashboard_javaexample.model.DashboardModel;
import com.squareup.picasso.Picasso;


public class DashboardViewHolder extends RecyclerView.ViewHolder {
    ImageView image;
    TextView name, genre, rate;

    public DashboardViewHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.image_card);
        name = itemView.findViewById(R.id.name);
        genre = itemView.findViewById(R.id.genre);
        rate = itemView.findViewById(R.id.star);
    }

    void bindDataViews(DashboardModel model) {
        Picasso.get().load(model.getImageURI()).into(image);
        name.setText(model.getName());
        genre.setText(model.getGenre());
        rate.setText(model.getRate());
    }
}
