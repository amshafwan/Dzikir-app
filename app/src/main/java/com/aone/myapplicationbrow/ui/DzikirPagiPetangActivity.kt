package com.aone.myapplicationbrow.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager
import com.aone.myapplicationbrow.R
import com.aone.myapplicationbrow.adapter.pagipetangAdapter
import com.aone.myapplicationbrow.databinding.ActivityDzikirPagiPetangBinding
import com.aone.myapplicationbrow.ui.detail.DzikirPagi
import com.aone.myapplicationbrow.ui.detail.DzikirPetang
import com.google.android.material.tabs.TabLayout

class DzikirPagiPetangActivity : AppCompatActivity() {
    lateinit var binding: ActivityDzikirPagiPetangBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirPagiPetangBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        val tablayout = findViewById<TabLayout>(R.id.tablayout)

        val fragmentAdapter = pagipetangAdapter(supportFragmentManager)
        fragmentAdapter.addFragment(DzikirPagi(),"Pagi")
        fragmentAdapter.addFragment(DzikirPetang(),"Sore")

        viewPager.adapter = fragmentAdapter
        tablayout.setupWithViewPager(viewPager)
    }
}