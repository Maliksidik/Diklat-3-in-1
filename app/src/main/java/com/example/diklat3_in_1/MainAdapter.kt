package com.example.diklat3_in_1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(
    private val listName: List<String>
        ) : RecyclerView.Adapter<MainAdapter.viewHolder> (){

    class  viewHolder (view: View) : RecyclerView.ViewHolder ( view ){
        val text = view.findViewById<TextView>(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        return  viewHolder(
            LayoutInflater.from ( parent.context ).inflate(R.layout.adapter_main, parent, false)
        )
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
       holder.text.text = listName[position]
    }

    override fun getItemCount() = listName.size


}