package com.aone.myapplicationbrow.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.aone.myapplicationbrow.adapter.DzikirDoaAdapter
import com.aone.myapplicationbrow.databinding.FragmentDzikirPagiBinding
import com.aone.myapplicationbrow.model.DataDzikirDoa

class DzikirPagi : Fragment() {
    lateinit var binding: FragmentDzikirPagiBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        binding = FragmentDzikirPagiBinding.inflate(layoutInflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvDzikirPagi.layoutManager = LinearLayoutManager(context)
        binding.rvDzikirPagi.adapter = DzikirDoaAdapter(DataDzikirDoa.listDzikirPagi)
    }
}