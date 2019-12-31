package com.eivier.nutritionalapp.recetasCena

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eivier.nutritionalapp.R
import com.eivier.nutritionalapp.dataSource.dataCena
import kotlinx.android.synthetic.main.layout_btn_back.*
import kotlinx.android.synthetic.main.layout_detalles_receta.*

class Cena03 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cena03)

        val recetas = dataCena.createDataSet()
        val receta03 = recetas.get(2)
        nombre_receta.text = receta03.nombre
        imageReceta.setImageResource(R.drawable.cena03)
        duracion_receta.text = receta03.tiempo
        porciones_receta.text = receta03.porciones.toString()
        dificultad_receta.text = receta03.dificultad
        ingredientes_receta.text = receta03.ingredientes
        procedimiento_receta.text = receta03.preparacion

        btnBack.setOnClickListener {
            finish()
        }
    }
}
