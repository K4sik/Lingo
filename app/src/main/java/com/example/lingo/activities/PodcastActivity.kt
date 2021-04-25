package com.example.lingo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lingo.R
import com.example.lingo.adapters.LevelsAdapter
import com.example.lingo.adapters.PodcastAdapter
import com.example.lingo.models.Podcast

class PodcastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_podcast)

        val recyclerView: RecyclerView = findViewById(R.id.rv_recyclerView)
        recyclerView.setLayoutManager(LinearLayoutManager(this))
        val dataholder = arrayListOf<Podcast>()

        dataholder.add(Podcast(R.drawable.crime_junkie, "NO EXCUSES", "Best Motivational Video", R.drawable.ic_arrow_forward))
        dataholder.add(Podcast(R.drawable.crime_junkie, "I WILL NEVER GIVE UP", "Very powerful Motivational Video", R.drawable.ic_arrow_forward))
        dataholder.add(Podcast(R.drawable.crime_junkie, "STOP WASTING TIME", "Best Motivational Video", R.drawable.ic_arrow_forward))
        dataholder.add(Podcast(R.drawable.crime_junkie, "START TODAY NOT TOMORROW", "Best Motivational Video", R.drawable.ic_arrow_forward))
        dataholder.add(Podcast(R.drawable.cold, "STOP SCROLLING START DOING", "New Motivational Video", R.drawable.ic_arrow_forward))
        dataholder.add(Podcast(R.drawable.cold, "STUDY HARD", "New Motivational Video", R.drawable.ic_arrow_forward))
        dataholder.add(Podcast(R.drawable.cold, "FOCUS ON YOURSELF NOT OTHERS", "", R.drawable.ic_arrow_forward))
        dataholder.add(Podcast(R.drawable.cold, "I CAN DO IT", "Powerful Motivational Video", R.drawable.ic_arrow_forward))

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = PodcastAdapter(dataholder)

    }
}