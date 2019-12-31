package com.eivier.nutritionalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.eivier.nutritionalapp.ui.login.LoginActivity
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            txtInfoDesarrollo.text = "Alejandro Vargas"
            Handler().postDelayed({
                txtInfoDesarrollo.text = "GDS0143"
                Handler().postDelayed({
                    //start main activity
                    startActivity(Intent(this, LoginActivity::class.java))
                    //finish this activity
                    finish()
                }, 2000)
            }, 2000)
        }, 2000)
    }

}
