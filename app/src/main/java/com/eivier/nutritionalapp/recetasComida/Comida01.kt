package com.eivier.nutritionalapp.recetasComida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eivier.nutritionalapp.R
import com.eivier.nutritionalapp.dataSource.dataCena
import com.eivier.nutritionalapp.dataSource.dataComida
import kotlinx.android.synthetic.main.layout_btn_back.*
import kotlinx.android.synthetic.main.layout_detalles_receta.*

class Comida01 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comida01)

        val recetas = dataComida.createDataSet()
        val receta01 = recetas.get(0)
        nombre_receta.text = receta01.nombre
        imageReceta.setImageResource(R.drawable.comida01)
        duracion_receta.text = receta01.tiempo
        porciones_receta.text = receta01.porciones.toString()
        dificultad_receta.text = receta01.dificultad
        ingredientes_receta.text = receta01.ingredientes
        procedimiento_receta.text = receta01.preparacion

        btnBack.setOnClickListener {
            finish()
        }
    }
}
