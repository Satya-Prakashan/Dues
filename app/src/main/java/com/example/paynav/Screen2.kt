package com.example.paynav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_screen1.*
import kotlinx.android.synthetic.main.activity_screen1.back
import kotlinx.android.synthetic.main.activity_screen2.*

class Screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        back.setOnClickListener()
        {
            intent = Intent(this, Screen1::class.java)
            startActivity(intent)
        }

        recnt.setOnClickListener()
        {
            intent = Intent(this, Screen1::class.java)
            startActivity(intent)
        }

        one.setOnClickListener()
        {
            intent = Intent(this,Screen4::class.java)
            startActivity(intent)
        }
        two.setOnClickListener()
        {
            intent = Intent(this,Screen4::class.java)
            startActivity(intent)
        }
        three.setOnClickListener()
        {
            intent = Intent(this,Screen4::class.java)
            startActivity(intent)
        }
        four.setOnClickListener()
        {
            intent = Intent(this,Screen4::class.java)
            startActivity(intent)
        }


        var list = ArrayList<User>()
        list.add(User("Suraj",R.drawable.circle_a))
        list.add(User("Suraj",R.drawable.circle_a))
        list.add(User("Suraj",R.drawable.circle_a))
        list.add(User("Suraj",R.drawable.circle_a))
        list.add(User("Suraj",R.drawable.circle_a))
        list.add(User("Suraj",R.drawable.circle_a))
        list.add(User("Suraj",R.drawable.circle_a))
        list.add(User("Suraj",R.drawable.circle_a))
        list.add(User("Suraj",R.drawable.circle_a))
        list.add(User("Suraj",R.drawable.circle_a))
        list.add(User("Suraj",R.drawable.circle_a))
        list.add(User("Suraj",R.drawable.circle_a))
        list.add(User("Suraj",R.drawable.circle_a))
        list.add(User("Suraj",R.drawable.circle_a))
        list.add(User("Suraj",R.drawable.circle_a))
        list.add(User("Suraj",R.drawable.circle_a))
        list.add(User("Suraj",R.drawable.circle_a))
        list.add(User("Suraj",R.drawable.circle_a))
        list.add(User("Suraj",R.drawable.circle_a))
        list.add(User("Suraj",R.drawable.circle_a))
        list.add(User("Suraj",R.drawable.circle_a))
        list.add(User("Suraj",R.drawable.circle_a))
        list.add(User("Suraj",R.drawable.circle_a))
        list.add(User("Suraj",R.drawable.circle_a))



        recycler_view.adapter = UserAdapter(list)
        recycler_view.layoutManager = GridLayoutManager(this,5)






    }
}