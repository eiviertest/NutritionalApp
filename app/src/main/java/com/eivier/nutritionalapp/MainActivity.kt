package com.eivier.nutritionalapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.eivier.nutritionalapp.options.ImportanciaComerBien
import com.eivier.nutritionalapp.options.Noticias
import com.eivier.nutritionalapp.options.Recetas
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnComerBien.setOnClickListener {
            val comerBien = Intent(this, ImportanciaComerBien::class.java)
            startActivity(comerBien)
        }

        btnRecetas.setOnClickListener {
            val recetas = Intent(this, Recetas::class.java)
            startActivity(recetas)
        }

        btnNoticias.setOnClickListener {
            val noticias = Intent(this, Noticias::class.java)
            startActivity(noticias)
        }
    }

}