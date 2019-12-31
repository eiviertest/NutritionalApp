package com.eivier.nutritionalapp.recetasCena

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eivier.nutritionalapp.R
import com.eivier.nutritionalapp.dataSource.dataCena
import kotlinx.android.synthetic.main.layout_btn_back.*
import kotlinx.android.synthetic.main.layout_detalles_receta.*

class Cena02 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cena02)

        val recetas = dataCena.createDataSet()
        val receta02 = recetas.get(1)
        nombre_receta.text = receta02.nombre
        imageReceta.setImageResource(R.drawable.cena02)
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
