package com.example.rafael238.myreward.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.example.rafael238.myreward.fragment.CatalogueFragment
import com.example.rafael238.myreward.fragment.HistoryFragment

/**
 * Created by rafael238 on 8/31/17.
 */
class RewardPagerAdapter(fm: FragmentManager?) : FragmentStatePagerAdapter(fm) {
    private val PAGE_COUNT = 2
    private val title = arrayListOf("Catalogue", "Rewards History")

    override fun getItem(position: Int): Fragment? {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = CatalogueFragment.newInstant()
            1 -> fragment = HistoryFragment.newInstant()
        }
        return fragment
    }

    override fun getCount() = PAGE_COUNT

    override fun getPageTitle(position: Int) = title[position]
}