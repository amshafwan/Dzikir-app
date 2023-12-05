package com.aone.myapplicationbrow.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.aone.myapplicationbrow.R
import com.aone.myapplicationbrow.adapter.DzikirDoaAdapter
import com.aone.myapplicationbrow.databinding.ActivityDzikirHarianBinding
import com.aone.myapplicationbrow.model.DataDzikirDoa
import com.aone.myapplicationbrow.model.DzikirDoaModel

class DzikirHarianActivity : AppCompatActivity() {
    lateinit var binding: ActivityDzikirHarianBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirHarianBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Dzikir & Doa Harian"

        binding.apply {
            rvDzikirSetiapHarian.layoutManager = LinearLayoutManager(this@DzikirHarianActivity)
            rvDzikirSetiapHarian.adapter = DzikirDoaAdapter(GetDzikirDoa())
        }
    }


    fun GetDzikirDoa() : ArrayList<DzikirDoaModel> {
        val desc = resources.getStringArray(R.array.arr_dzikir_doa_harian)
        val lafas = resources.getStringArray(R.array.arr_lafaz_dzikir_doa_harian)
        val terjemah = resources.getStringArray(R.array.arr_terjemah_dzikir_doa_harian)

        val kumpul = arrayListOf<DzikirDoaModel>()

        for (i in desc.indices) {
            val gabung = DzikirDoaModel(
                desc[i],
                lafas[i],
                terjemah[i]
            )
            kumpul.addAll(listOf(gabung))
        }
        return kumpul
    }
}