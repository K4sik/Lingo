package com.example.lingo.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.lingo.R

class PracticeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice)

        val btn_go_to: Button = findViewById(R.id.btn_go_to)

        btn_go_to.setOnClickListener {
            val i = Intent(this, QuizActivity::class.java)
            startActivity(i)
        }
    }
}