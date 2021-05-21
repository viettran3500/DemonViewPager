package com.viet.demonviewpager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFragmentStatePagerAdapter.setOnClickListener {
            startActivity(Intent(this, Main2Activity::class.java))
        }

        btnFragmentPagerAdapter.setOnClickListener {
            startActivity(Intent(this, Main3Activity::class.java))
        }
    }
}
