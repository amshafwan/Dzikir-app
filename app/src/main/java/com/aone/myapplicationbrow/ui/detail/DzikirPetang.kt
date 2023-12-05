package com.aone.myapplicationbrow.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.aone.myapplicationbrow.R
import com.aone.myapplicationbrow.adapter.DzikirDoaAdapter
import com.aone.myapplicationbrow.databinding.FragmentDzikirPetangBinding
import com.aone.myapplicationbrow.model.DataDzikirDoa

class DzikirPetang : Fragment() {
    lateinit var binding: FragmentDzikirPetangBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        binding = FragmentDzikirPetangBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvDzikirSore.layoutManager = LinearLayoutManager(context)
        binding.rvDzikirSore.adapter = DzikirDoaAdapter(DataDzikirDoa.listDzikirPetang)
    }
}