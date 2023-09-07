package com.example.dashboard_javaexample.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dashboard_javaexample.R;
import com.example.dashboard_javaexample.listener.DashboardListener;
import com.example.dashboard_javaexample.model.DashboardModel;
import com.google.android.material.card.MaterialCardView;
import com.squareup.picasso.Picasso;


public class DashboardViewHolder extends RecyclerView.ViewHolder {
    ImageView image;
    TextView name, genre, rate;
    MaterialCardView cardView;
    public DashboardViewHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.image_card);
        name = itemView.findViewById(R.id.name);
        genre = itemView.findViewById(R.id.genre);
        rate = itemView.findViewById(R.id.star);
        cardView=itemView.findViewById(R.id.btn_download);
    }

    void bindDataViews(DashboardModel model, DashboardListener listener) {
        Picasso.get().load(model.getImageURI()).into(image);
        name.setText(model.getName());
        genre.setText(model.getGenre());
        rate.setText(model.getRate());
        cardView.setOnClickListener(view -> listener.setOnClickListener(model));
    }
}
