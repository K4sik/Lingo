package com.example.lingo.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lingo.R
import com.example.lingo.adapters.HomeLevelsAdapter
import com.example.lingo.adapters.TheoryAdapter
import com.example.lingo.models.Settings
import com.example.lingo.models.Theory

class TheoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_theory)

        val recyclerView: RecyclerView = findViewById(R.id.rv_recyclerView)
        recyclerView.setLayoutManager(LinearLayoutManager(this))
        val dataholder = arrayListOf<Theory>()

        dataholder.add(Theory(R.drawable.ic_near_me, "Present Simple", R.drawable.ic_arrow_forward))
        dataholder.add(Theory(R.drawable.ic_star, "Present Continuous", R.drawable.ic_arrow_forward))
        dataholder.add(Theory(R.drawable.ic_people, "Present Perfect", R.drawable.ic_arrow_forward))
        dataholder.add(Theory(R.drawable.ic_people, "Present PerfectContinu...", R.drawable.ic_arrow_forward))
        dataholder.add(Theory(R.drawable.ic_near_me, "Past Simple", R.drawable.ic_arrow_forward))
        dataholder.add(Theory(R.drawable.ic_star, "Past Continuous", R.drawable.ic_arrow_forward))
        dataholder.add(Theory(R.drawable.ic_people, "Past Perfect", R.drawable.ic_arrow_forward))
        dataholder.add(Theory(R.drawable.ic_people, "Past PerfectContinuous", R.drawable.ic_arrow_forward))
        dataholder.add(Theory(R.drawable.ic_near_me, "Future Simple", R.drawable.ic_arrow_forward))
        dataholder.add(Theory(R.drawable.ic_star, "Future Continuous", R.drawable.ic_arrow_forward))
        dataholder.add(Theory(R.drawable.ic_people, "Future Perfect", R.drawable.ic_arrow_forward))
        dataholder.add(Theory(R.drawable.ic_people, "Future PerfectContinuous", R.drawable.ic_arrow_forward))

        recyclerView.adapter = TheoryAdapter(dataholder)
    }
}