package com.saiful.myapplication.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.saiful.myapplication.fragment.BbcFragment
import com.saiful.myapplication.fragment.UsaFragment
import com.saiful.myapplication.model.Tab

class TabAdapter(manager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(manager, lifecycle){
    companion object {
        val tabList = listOf(
            Tab(BbcFragment(), "BBC"),
            Tab(UsaFragment(), "USA")
        )
    }

    override fun getItemCount(): Int {
        return tabList.size
    }

    override fun createFragment(position: Int): Fragment {
        return tabList[position].fragment
    }
}