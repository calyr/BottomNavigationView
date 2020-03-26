package com.calyrsoft.bnproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_bottom_navigation_view.setOnNavigationItemSelectedListener {
            when( it.itemId) {
                R.id.home_menu_id -> {
                    supportFragmentManager.beginTransaction().replace(R.id.main_frame_layout, HomeFragment()).commit()
                    Toast.makeText(applicationContext, "HOME", Toast.LENGTH_LONG).show()
                    true
                }
                R.id.profile_menu_id -> {
                    supportFragmentManager.beginTransaction().replace(R.id.main_frame_layout, ProfileFragment()).commit()
                    Toast.makeText(applicationContext, "PROFILE", Toast.LENGTH_LONG).show()
                    true
                }

                else -> false
            }
        }
    }
}
