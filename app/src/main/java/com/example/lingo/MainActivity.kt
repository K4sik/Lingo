package com.example.lingo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.lingo.fragments.FavouritesFragment
import com.example.lingo.fragments.HomeFragment
import com.example.lingo.fragments.SettingsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val favouritesFragment = FavouritesFragment()
        val settingsFragment = SettingsFragment()

        makeCurrentFragment(homeFragment)

        val bottom_navigation: BottomNavigationView = findViewById(R.id.bottom_navigation)
        
        bottom_navigation.setOnNavigationItemSelectedListener{
            when (it.itemId){
                R.id.ic_home -> makeCurrentFragment(homeFragment)
                R.id.ic_favorite -> makeCurrentFragment(favouritesFragment)
                R.id.ic_settings -> makeCurrentFragment(settingsFragment)
            }
            true
        }

    }

    private fun makeCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }
    }
}