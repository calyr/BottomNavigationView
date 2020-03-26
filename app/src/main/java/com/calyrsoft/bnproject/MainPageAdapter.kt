package com.calyrsoft.bnproject

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class MainPageAdapter(val list: ArrayList<Fragment>, supportFragmentManager: FragmentManager) : FragmentStatePagerAdapter(supportFragmentManager) {
    override fun getItem(position: Int): Fragment {
        return list[position]
    }

    override fun getCount(): Int {
        return list.size
    }
}
