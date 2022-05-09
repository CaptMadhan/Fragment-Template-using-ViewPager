package com.example.fragmenttemplate

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fm: FragmentActivity) : FragmentStateAdapter(fm) {
    private val fragments: MutableList<Fragment> = ArrayList()
    val fragmentTitle: MutableList<String> = ArrayList()


    fun add(fragment: Fragment, title: String) {
        fragments.add(fragment)
        fragmentTitle.add(title)
    }
    fun replace(index: Int, fragment: Fragment){
        fragments[index] = fragment
    }
    fun clear(){
        fragments.clear()
        fragmentTitle.clear()
    }
    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }
}