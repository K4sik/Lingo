package com.example.lingo.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.lingo.R

class LevelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level)

        val bt_button_theory: Button = findViewById(R.id.bt_button_theory)
        val bt_button_practice: Button = findViewById(R.id.bt_button_practice)
        val bt_button_podcasts: Button = findViewById(R.id.bt_button_podcasts)

        bt_button_theory.setOnClickListener{
            val i = Intent(this, TheoryActivity::class.java)
            startActivity(i)
        }

        bt_button_practice.setOnClickListener{
            val i = Intent(this, PracticeActivity::class.java)
            startActivity(i)
        }

        bt_button_podcasts.setOnClickListener{
            val i = Intent(this, PodcastActivity::class.java)
            startActivity(i)
        }


    }
}