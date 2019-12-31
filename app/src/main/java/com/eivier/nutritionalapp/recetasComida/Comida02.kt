package com.eivier.nutritionalapp.recetasComida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eivier.nutritionalapp.R
import com.eivier.nutritionalapp.dataSource.dataCena
import com.eivier.nutritionalapp.dataSource.dataComida
import kotlinx.android.synthetic.main.layout_btn_back.*
import kotlinx.android.synthetic.main.layout_detalles_receta.*

class Comida02 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comida02)

        val recetas = dataComida.createDataSet()
        val receta02 = recetas.get(1)
        nombre_receta.text = receta02.nombre
        imageReceta.setImageResource(R.drawable.comida02)
        duracion_receta.text = receta02.tiempo
        porciones_receta.text = receta02.porciones.toString()
        dificultad_receta.text = receta02.dificultad
        ingredientes_receta.text = receta02.ingredientes
        procedimiento_receta.text = receta02.preparacion

        btnBack.setOnClickListener {
            finish()
        }
    }
}
