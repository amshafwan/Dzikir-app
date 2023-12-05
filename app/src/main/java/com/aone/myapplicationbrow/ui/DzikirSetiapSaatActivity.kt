package com.aone.myapplicationbrow.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.aone.myapplicationbrow.R
import com.aone.myapplicationbrow.adapter.DzikirDoaAdapter
import com.aone.myapplicationbrow.databinding.ActivityDzikirSetiapSaatBinding
import com.aone.myapplicationbrow.model.DataDzikirDoa

class DzikirSetiapSaatActivity : AppCompatActivity() {

    lateinit var binding: ActivityDzikirSetiapSaatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirSetiapSaatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Dzikir Setiap Saat"

        binding.apply {
            rvDzikirSetiapSaat.layoutManager = LinearLayoutManager(this@DzikirSetiapSaatActivity)
            rvDzikirSetiapSaat.adapter = DzikirDoaAdapter(DataDzikirDoa.listDzikir)
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}