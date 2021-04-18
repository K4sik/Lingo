package com.example.lingo.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.lingo.MainActivity
import com.example.lingo.R

class WelcomeActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT = 4000;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val iv_lingo = findViewById<ImageView>(R.id.iv_lingo)

        iv_lingo.alpha = 0f
        iv_lingo.animate().setDuration(1500).alpha(1f).withEndAction {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}