package com.example.diklat3_in_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainDokumentasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dokumentasi)
        imageAdapter()

    }

    private fun imageAdapter() {
        val images = listOf<Int>(
            R.drawable.pembukaanupper,
            R.drawable.penyematanupper,
            R.drawable.softskillupper,
            R.drawable.praktek1upper,
            R.drawable.praktek2upper,
            R.drawable.ujikomupper,

            )
        val imageAdapter = DokumentasiAdapter(images)
        findViewById<RecyclerView>(R.id.recycleView2).adapter = imageAdapter
    }

    }





