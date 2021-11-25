package com.example.paynav.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.paynav.fragments.Receive
import com.example.paynav.fragments.Return

class tableLayoutAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle):FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position){
        0->{
            Return()
        }
        1->{
            Receive()
        }
        else->{
            Fragment()
        }
    }
    }
}