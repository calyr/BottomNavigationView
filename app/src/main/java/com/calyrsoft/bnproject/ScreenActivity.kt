package com.calyrsoft.bnproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_screen.*

class ScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen)
        val list = arrayListOf<Fragment>(HomeFragment(), ProfileFragment())
        main_view_pager.adapter = MainPageAdapter(list, supportFragmentManager)

        main2_bottom_navigation_view.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.home_menu_id -> {
                    main_view_pager.currentItem = 0
                    true
                }
                R.id.profile_menu_id -> {
                    main_view_pager.currentItem = 1
                    true
                }

                else -> false
            }
        }

        main_view_pager.addOnPageChangeListener( object: ViewPager.SimpleOnPageChangeListener() {
            override fun onPageSelected(position: Int) {
                if ( position == 0) {
                    main2_bottom_navigation_view.selectedItemId = R.id.home_menu_id
                } else {
                    main2_bottom_navigation_view.selectedItemId = R.id.profile_menu_id
                }
            }
        })
    }
}
