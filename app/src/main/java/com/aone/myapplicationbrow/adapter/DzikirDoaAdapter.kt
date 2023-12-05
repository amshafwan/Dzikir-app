package com.aone.myapplicationbrow.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aone.myapplicationbrow.databinding.RowItemDzikirDoaBinding
import com.aone.myapplicationbrow.model.DzikirDoaModel

class DzikirDoaAdapter(private val listDzikirDoa: ArrayList<DzikirDoaModel>) : RecyclerView.Adapter<DzikirDoaAdapter.MyViewHolder>(){

     class MyViewHolder(val binding: RowItemDzikirDoaBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val bindingDzikirDoa = RowItemDzikirDoaBinding.inflate(LayoutInflater.from(parent.context), parent,false )
                return MyViewHolder(bindingDzikirDoa)
    }

    override fun getItemCount(): Int = listDzikirDoa.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val dataDzikirDoa = listDzikirDoa[position]

        holder.binding.apply {
            tvDesc.text = dataDzikirDoa.desc
            tvLafaz.text = dataDzikirDoa.lafas
            tvTerjemah.text = dataDzikirDoa.terjemah
         }
    }
}
