package com.example.paynav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_screen1.*

class Screen4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen4)


        back.setOnClickListener()
        {
            intent = Intent(this, Screen2::class.java)
            startActivity(intent)
        }

    }
}