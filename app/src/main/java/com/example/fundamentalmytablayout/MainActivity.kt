package com.example.fundamentalmytablayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)

        view_pager.adapter = sectionsPagerAdapter
        tabs.setupWithViewPager(view_pager)

        supportActionBar?.elevation = 0f
    }
}