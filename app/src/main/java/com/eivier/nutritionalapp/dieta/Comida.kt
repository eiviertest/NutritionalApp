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
import com.eivier.nutritionalapp.dataSource.dataComida
import com.eivier.nutritionalapp.recetasComida.*

class Comida : AppCompatActivity() {

    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var listaRecetas: RecyclerView
    lateinit var adapter: AdapterReceta
    val recetas = dataComida.createDataSet()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comida)

        listaRecetas = findViewById(R.id.listaComida)
        layoutManager = LinearLayoutManager(this)
        adapter = AdapterReceta(recetas, object : ClickListener {
            override fun onClick(view: View, position: Int) {
                when (position) {
                    0 -> {
                        startActivity(Intent(this@Comida, Comida01::class.java))
                    }
                    1 -> {
                        startActivity(Intent(this@Comida, Comida02::class.java))
                    }
                    2 -> {
                        startActivity(Intent(this@Comida, Comida03::class.java))
                    }
                    3 -> {
                        startActivity(Intent(this@Comida, Comida04::class.java))
                    }
                    4 -> {
                        startActivity(Intent(this@Comida, Comida05::class.java))
                    }
                }
            }
        })
        listaRecetas.layoutManager = layoutManager
        listaRecetas.adapter = adapter
    }
}
