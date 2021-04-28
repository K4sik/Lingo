package com.example.lingo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.lingo.fragments.*
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val accountFragment = AccountFragment()
        val certificateFragment = CertificateFragment()
        val settingsFragment = SettingsFragment()

        makeCurrentFragment(homeFragment)

        val bottom_navigation: BottomNavigationView = findViewById(R.id.bottom_navigation)
        
        bottom_navigation.setOnNavigationItemSelectedListener{
            when (it.itemId){
                R.id.ic_home -> makeCurrentFragment(homeFragment)
//                R.id.ic_person -> makeCurrentFragment(accountFragment)
                R.id.ic_whatshot -> makeCurrentFragment(certificateFragment)
                R.id.ic_settings -> makeCurrentFragment(settingsFragment)
            }
            true
        }


//        val bt_button: Button = findViewById(R.id.bt_button)
//
//        bt_button.setOnClickListener{
//            val i = Intent(this, LevelActivity::class.java)
//            startActivity(i)
//        }

    }

    private fun makeCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }
    }

}