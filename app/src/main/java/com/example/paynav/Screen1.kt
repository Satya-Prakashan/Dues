package com.example.paynav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.paynav.adapter.tableLayoutAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_screen1.*

class Screen1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen1)

        back.setOnClickListener()
        {
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        recent.setOnClickListener()
        {
            intent = Intent(this,Screen2::class.java)
            startActivity(intent)
        }


        val adapter= tableLayoutAdapter(supportFragmentManager,lifecycle)
        pager2.adapter=adapter

        TabLayoutMediator(tablayout,pager2){tab,position->
            when(position){
                0->{
                    tab.text="return"
                }
                1->{
                    tab.text="receive"
                }
            }
        }.attach()
    }
}