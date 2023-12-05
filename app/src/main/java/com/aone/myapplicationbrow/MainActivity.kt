package com.aone.myapplicationbrow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.aone.myapplicationbrow.databinding.ActivityMainBinding
import com.aone.myapplicationbrow.model.ArtikelModel
import com.aone.myapplicationbrow.ui.DzikirHarianActivity
import com.aone.myapplicationbrow.ui.DzikirPagiPetangActivity
import com.aone.myapplicationbrow.ui.DzikirSetiapSaatActivity
import com.aone.myapplicationbrow.ui.SunnahQouliyahActivity

class MainActivity : AppCompatActivity(), View.OnClickListener{

    private lateinit var binding: ActivityMainBinding
    private lateinit var slideIndicator : Array<ImageView?>
    private val listArtikel: ArrayList<ArtikelModel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setView()

    }

    private fun setView(){
        binding.apply {
            llDzikirDoaHarian.setOnClickListener(this@MainActivity)
            llDzikirDoaShalat.setOnClickListener(this@MainActivity)
            llDzikirSetiapSaat.setOnClickListener(this@MainActivity)
            llDzikirPagiPetang.setOnClickListener(this@MainActivity)
        }
    }


    override fun onClick(v: View?) {
        when (v?. id){
            R.id.ll_dzikir_doa_shalat -> {
                val intentDDS = Intent(this@MainActivity, SunnahQouliyahActivity::class.java)
                startActivity(intentDDS)
            }
            R.id.ll_dzikir_setiap_saat -> {
                val intentDSS = Intent(this@MainActivity, DzikirSetiapSaatActivity::class.java)
                startActivity(intentDSS)
            }
            R.id.ll_dzikir_doa_harian -> {
                val intentDDH = Intent(this@MainActivity, DzikirHarianActivity::class.java)
                startActivity(intentDDH)
            }
            R.id.ll_dzikir_pagi_petang -> {
                val intentDPP = Intent(this@MainActivity, DzikirPagiPetangActivity::class.java)
                startActivity(intentDPP)
            }

        }
    }
}

