package com.eivier.nutritionalapp.options

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.eivier.nutritionalapp.MainActivity
import com.eivier.nutritionalapp.R
import com.eivier.nutritionalapp.dieta.Cena
import com.eivier.nutritionalapp.dieta.Comida
import com.eivier.nutritionalapp.dieta.Desayuno

import kotlinx.android.synthetic.main.activity_recetas.*
import kotlinx.android.synthetic.main.content_recetas.*
import kotlinx.android.synthetic.main.layout_btn_back.*

class Recetas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recetas)
        setSupportActionBar(toolbar)

        btnDesayuno.setOnClickListener {
            val intentDesayuno = Intent(this, Desayuno::class.java)
            startActivity(intentDesayuno)
        }
        btnComida.setOnClickListener {
            val intentComida = Intent(this, Comida::class.java)
            startActivity(intentComida)
        }
        btnCena.setOnClickListener {
            val intentCena = Intent(this, Cena::class.java)
            startActivity(intentCena)
        }
        btnBack.setOnClickListener {
            finish()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_desayuno ->  {
                val anyone = Intent(this,Desayuno::class.java)
                startActivity(anyone)
            }
            R.id.action_comida ->  {
                val anyone = Intent(this,Comida::class.java)
                startActivity(anyone)
            }
            R.id.action_cena ->  {
                val anyone = Intent(this,Cena::class.java)
                startActivity(anyone)
            }
            R.id.action_principal ->  {
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }

}
