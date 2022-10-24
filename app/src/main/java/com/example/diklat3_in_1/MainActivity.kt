package com.example.diklat3_in_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent : Button

   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textAdapter()

        btnIntent = findViewById(R.id.btn_intent)
        btnIntent.setOnClickListener(this)

    }

    private fun textAdapter(){
    val names = listOf<String>(
        "1. DIKLAT 3-IN-1 JAHIT UPPER ALAS KAKI",
        "2. DIKLAT 3-IN-1 JAHIT GARMEN",
        "3. DIKLAT 3-IN-1 JAHIT ASSEMBLING ALAS KAKI",
        "4. DIKLAT 3-IN-1 JAHIT PENGOPERASIAN MESIN JAHIT KARUNG JUMBO",
        "5. DIKLAT 3-IN-1 JAHIT PENGOPERASIAN MESIN LOOMING",
    )

    val mainAdapter = MainAdapter (names)
    findViewById<RecyclerView>(R.id.recycleView).adapter = mainAdapter
    }


    override fun onClick(v: View){
        when (v.id){
            R.id.btn_intent -> run {
                val intentBiasa = Intent (this@MainActivity, MainDokumentasi::class.java)
                startActivity(intentBiasa)
            }

        }
    }
}

