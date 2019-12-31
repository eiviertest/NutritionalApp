package com.eivier.nutritionalapp.dieta

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.eivier.nutritionalapp.ClickListener
import com.eivier.nutritionalapp.R
import com.eivier.nutritionalapp.adapterRecyclerView.AdapterReceta
import com.eivier.nutritionalapp.dataSource.dataCena
import com.eivier.nutritionalapp.recetasCena.*

class Cena : AppCompatActivity() {

    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var listaRecetas: RecyclerView
    lateinit var adapter: AdapterReceta
    val recetas = dataCena.createDataSet()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cena)

        listaRecetas = findViewById(R.id.listaCena)
        layoutManager = LinearLayoutManager(this)
        adapter = AdapterReceta(recetas, object : ClickListener {
            override fun onClick(view: View, position: Int) {
                when (position) {
                    0 -> {
                        startActivity(Intent(this@Cena, Cena01::class.java))
                    }
                    1 -> {
                        startActivity(Intent(this@Cena, Cena02::class.java))
                    }
                    2 -> {
                        startActivity(Intent(this@Cena, Cena03::class.java))
                    }
                    3 -> {
                        startActivity(Intent(this@Cena, Cena04::class.java))
                    }
                    4 -> {
                        startActivity(Intent(this@Cena, Cena05::class.java))
                    }
                }
            }
        })
        listaRecetas.layoutManager = layoutManager
        listaRecetas.adapter = adapter
    }
}
