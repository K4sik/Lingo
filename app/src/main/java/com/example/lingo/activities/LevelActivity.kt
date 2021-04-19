package com.example.lingo.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lingo.R
import com.example.lingo.adapters.LevelsAdapter
import com.example.lingo.models.Levels
import java.util.*


class LevelActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView = findViewById(R.id.rv_recyclerView)
    private var dataholder: ArrayList<Levels> = ArrayList<Levels>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level)

//        val bt_button_theory: Button = findViewById(R.id.bt_button_theory)
//        val bt_button_practice: Button = findViewById(R.id.bt_button_practice)
//        val bt_button_podcasts: Button = findViewById(R.id.bt_button_podcasts)
//
//        bt_button_theory.setOnClickListener{
//            val i = Intent(this, TheoryActivity::class.java)
//            startActivity(i)
//        }
//
//        bt_button_practice.setOnClickListener{
//            val i = Intent(this, PracticeActivity::class.java)
//            startActivity(i)
//        }
//
//        bt_button_podcasts.setOnClickListener{
//            val i = Intent(this, PodcastActivity::class.java)
//            startActivity(i)
//        }

        dataholder.add(Levels(R.drawable.ic_near_me, "Theory", R.drawable.ic_arrow_forward))
        dataholder.add(Levels(R.drawable.ic_star, "Practice", R.drawable.ic_arrow_forward))
        dataholder.add(Levels(R.drawable.ic_people, "Podcasts", R.drawable.ic_arrow_forward))


        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = LevelsAdapter(dataholder)


    }
}