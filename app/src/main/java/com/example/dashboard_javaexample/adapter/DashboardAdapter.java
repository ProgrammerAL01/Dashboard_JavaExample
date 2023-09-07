package com.example.dashboard_javaexample.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dashboard_javaexample.R;
import com.example.dashboard_javaexample.listener.DashboardListener;
import com.example.dashboard_javaexample.model.DashboardModel;

import java.util.List;


public class DashboardAdapter extends RecyclerView.Adapter<DashboardViewHolder> {
    List<DashboardModel> models;
    DashboardListener listener;

    public DashboardAdapter(List<DashboardModel> models, DashboardListener listener) {
        this.models = models;
        this.listener = listener;
    }

    @NonNull
    @Override
    public DashboardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DashboardViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.game_items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DashboardViewHolder holder, int position) {
        holder.bindDataViews(models.get(position),listener);
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
