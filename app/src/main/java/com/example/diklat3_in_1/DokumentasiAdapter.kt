package com.example.diklat3_in_1

import android.icu.text.Transliterator.Position
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class DokumentasiAdapter (
    private val listImage : List<Int>
        ) : RecyclerView.Adapter<DokumentasiAdapter.viewHolder> (){

    class  viewHolder (view: View) : RecyclerView.ViewHolder ( view ){
        val image = view.findViewById<ImageView>(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= viewHolder (
            LayoutInflater.from ( parent.context ).inflate(R.layout.adapter_dokumentasi, parent, false)
        )


    override fun onBindViewHolder(holder: viewHolder, position: Int) {
       holder.image.setImageResource( listImage[position] )
    }

    override fun getItemCount() = listImage.size


}