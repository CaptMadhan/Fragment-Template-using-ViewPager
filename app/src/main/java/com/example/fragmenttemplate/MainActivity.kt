package com.example.fragmenttemplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    var adapter: ViewPagerAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val viewpager = findViewById<ViewPager2>(R.id.viewpager)
        val tablayout = findViewById<TabLayout>(R.id.sliding_tabs)
        adapter = ViewPagerAdapter(this)
        adapter?.add(Fragment_1.newInstance(), "Fragment 1")
        adapter?.add(Fragment_2.newInstance(), "Fragment 2")

        viewpager.adapter = adapter
        TabLayoutMediator(tablayout, viewpager) { tab, position ->
            tab.text = adapter?.fragmentTitle?.get(position)
        }.attach()

    }
}