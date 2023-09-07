package com.example.dashboard_javaexample.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.dashboard_javaexample.R;
import com.example.dashboard_javaexample.adapter.DashboardAdapter;
import com.example.dashboard_javaexample.model.DashboardModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycler);

        List<DashboardModel> models = new ArrayList<>();
        models.add(new DashboardModel("God Of War 2018", "Action", "94", "https://vigiato.net/wp-content/uploads/2021/10/10-1024x538.jpg"));
        models.add(new DashboardModel(" Assassin’s Creed Valhalla", "Action", "87", "https://www.plaza.ir/wp-content/uploads/2020/05/assassins-creed-valhalla-update-9.jpg.webp"));
        models.add(new DashboardModel("  Uncharted 4: A Thief's End", "Action", "96", "https://cdn.zoomg.ir/2016/05/uncharted-4-shakhes-1.jpg?w=1920"));
        models.add(new DashboardModel("  Resident Evil 4", "Action,scary", "90", "https://cdn.sargarme.com/uploads/2021/06/resident-evil-4.jpg"));
        models.add(new DashboardModel("God Of War 2018", "Action", "94", "https://vigiato.net/wp-content/uploads/2021/10/10-1024x538.jpg"));
        models.add(new DashboardModel(" Assassin’s Creed Valhalla", "Action", "87", "https://www.plaza.ir/wp-content/uploads/2020/05/assassins-creed-valhalla-update-9.jpg.webp"));
        models.add(new DashboardModel("  Uncharted 4: A Thief's End", "Action", "96", "https://cdn.zoomg.ir/2016/05/uncharted-4-shakhes-1.jpg?w=1920"));
        models.add(new DashboardModel("  Resident Evil 4", "Action,scary", "90", "https://cdn.sargarme.com/uploads/2021/06/resident-evil-4.jpg"));
        models.add(new DashboardModel("God Of War 2018", "Action", "94", "https://vigiato.net/wp-content/uploads/2021/10/10-1024x538.jpg"));
        models.add(new DashboardModel(" Assassin’s Creed Valhalla", "Action", "87", "https://www.plaza.ir/wp-content/uploads/2020/05/assassins-creed-valhalla-update-9.jpg.webp"));
        models.add(new DashboardModel("  Uncharted 4: A Thief's End", "Action", "96", "https://cdn.zoomg.ir/2016/05/uncharted-4-shakhes-1.jpg?w=1920"));
        models.add(new DashboardModel("  Resident Evil 4", "Action,scary", "90", "https://cdn.sargarme.com/uploads/2021/06/resident-evil-4.jpg"));

        DashboardAdapter adapter = new DashboardAdapter(models);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1, RecyclerView.VERTICAL, false));


    }
}