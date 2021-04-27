package com.example.lingo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lingo.R
import com.example.lingo.adapters.PracticeAdapter
import com.example.lingo.models.Practice

class PracticeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice)

        val recyclerView: RecyclerView = findViewById(R.id.rv_recyclerView)
        recyclerView.setLayoutManager(LinearLayoutManager(this))
        val dataholder = arrayListOf<Practice>()

        dataholder.add(Practice(R.drawable.ic_near_me, "Present Simple", R.drawable.ic_arrow_forward))
        dataholder.add(Practice(R.drawable.ic_star, "Present Continuous", R.drawable.ic_arrow_forward))
        dataholder.add(Practice(R.drawable.ic_people, "Present Perfect", R.drawable.ic_arrow_forward))
        dataholder.add(Practice(R.drawable.ic_people, "Present PerfectContinu...", R.drawable.ic_arrow_forward))
        dataholder.add(Practice(R.drawable.ic_near_me, "Past Simple", R.drawable.ic_arrow_forward))
        dataholder.add(Practice(R.drawable.ic_star, "Past Continuous", R.drawable.ic_arrow_forward))
        dataholder.add(Practice(R.drawable.ic_people, "Past Perfect", R.drawable.ic_arrow_forward))
        dataholder.add(Practice(R.drawable.ic_people, "Past PerfectContinuous", R.drawable.ic_arrow_forward))
        dataholder.add(Practice(R.drawable.ic_near_me, "Future Simple", R.drawable.ic_arrow_forward))
        dataholder.add(Practice(R.drawable.ic_star, "Future Continuous", R.drawable.ic_arrow_forward))
        dataholder.add(Practice(R.drawable.ic_people, "Future Perfect", R.drawable.ic_arrow_forward))
        dataholder.add(Practice(R.drawable.ic_people, "Future PerfectContinuous", R.drawable.ic_arrow_forward))

        recyclerView.adapter = PracticeAdapter(dataholder)

    }
}