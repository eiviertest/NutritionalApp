package com.eivier.nutritionalapp.options

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.eivier.nutritionalapp.MainActivity
import com.eivier.nutritionalapp.R
import kotlinx.android.synthetic.main.activity_noticias.*
import kotlinx.android.synthetic.main.layout_btn_back.*

class Noticias : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_noticias)
        val webViewNoticias: WebView = findViewById(R.id.webViewNoticias)
        webViewNoticias.loadUrl("https://www.informador.mx/alimentacion-t1771")

        btnBack.setOnClickListener {
            finish()
        }
    }
}
