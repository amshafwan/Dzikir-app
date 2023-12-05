package com.aone.myapplicationbrow.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.aone.myapplicationbrow.R
import com.aone.myapplicationbrow.adapter.DzikirDoaAdapter
import com.aone.myapplicationbrow.databinding.ActivitySunnahQouliyahBinding
import com.aone.myapplicationbrow.model.DataDzikirDoa

class SunnahQouliyahActivity : AppCompatActivity() {

    lateinit var binding: ActivitySunnahQouliyahBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySunnahQouliyahBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Sunnah - Sunnah Qouliyah"

        binding.apply {
            rvQauliyahShalat.layoutManager = LinearLayoutManager(this@SunnahQouliyahActivity)
            rvQauliyahShalat.adapter = DzikirDoaAdapter(DataDzikirDoa.listQauliyah)
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}