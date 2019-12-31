package com.eivier.nutritionalapp.recetasDesayuno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eivier.nutritionalapp.R
import com.eivier.nutritionalapp.dataSource.dataDesayuno
import kotlinx.android.synthetic.main.layout_btn_back.*
import kotlinx.android.synthetic.main.layout_detalles_receta.*

class Desayuno04 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desayuno04)

        val recetas = dataDesayuno.createDataSet()
        val receta04 = recetas.get(3)
        nombre_receta.text = receta04.nombre
        imageReceta.setImageResource(R.drawable.desayuno04)
        duracion_receta.text = receta04.tiempo
        porciones_receta.text = receta04.porciones.toString()
        dificultad_receta.text = receta04.dificultad
        ingredientes_receta.text = receta04.ingredientes
        procedimiento_receta.text = receta04.preparacion

        btnBack.setOnClickListener {
            finish()
        }
    }
}
