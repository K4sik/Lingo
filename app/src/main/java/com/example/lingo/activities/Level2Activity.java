package com.example.lingo.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.lingo.R;
import com.example.lingo.adapters.LevelsAdapter;
import com.example.lingo.adapters.SettingsAdapter;
import com.example.lingo.models.Levels;
import com.example.lingo.models.Settings;

import java.util.ArrayList;

public class Level2Activity extends AppCompatActivity {


    RecyclerView recyclerView;
    ArrayList<Levels> dataholder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        recyclerView = findViewById(R.id.rv_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        dataholder = new ArrayList<>();

        dataholder.add(new Levels(R.drawable.ic_book, "Theory", R.drawable.ic_arrow_forward));
        dataholder.add(new Levels(R.drawable.ic_baseline_mic, "Practice", R.drawable.ic_arrow_forward));
        dataholder.add(new Levels(R.drawable.ic_library_music, "Podcasts", R.drawable.ic_arrow_forward));

        recyclerView.setAdapter(new LevelsAdapter(dataholder));

    }
}