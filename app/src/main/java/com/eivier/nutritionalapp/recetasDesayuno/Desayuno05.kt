package com.eivier.nutritionalapp.recetasDesayuno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eivier.nutritionalapp.R
import com.eivier.nutritionalapp.dataSource.dataDesayuno
import kotlinx.android.synthetic.main.layout_btn_back.*
import kotlinx.android.synthetic.main.layout_detalles_receta.*

class Desayuno05 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desayuno05)

        val recetas = dataDesayuno.createDataSet()
        val receta05 = recetas.get(4)
        nombre_receta.text = receta05.nombre
        imageReceta.setImageResource(R.drawable.desayuno05)
        duracion_receta.text = receta05.tiempo
        porciones_receta.text = receta05.porciones.toString()
        dificultad_receta.text = receta05.dificultad
        ingredientes_receta.text = receta05.ingredientes
        procedimiento_receta.text = receta05.preparacion

        btnBack.setOnClickListener {
            finish()
        }
    }
}
