package com.eivier.nutritionalapp.options

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.eivier.nutritionalapp.MainActivity
import com.eivier.nutritionalapp.R
import kotlinx.android.synthetic.main.activity_importancia_comer_bien.*
import kotlinx.android.synthetic.main.activity_noticias.*
import kotlinx.android.synthetic.main.layout_btn_back.*

class ImportanciaComerBien : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_importancia_comer_bien)
        val webViewComerBien: WebView = findViewById(R.id.webViewComerBien)
        webViewComerBien.loadUrl("https://www.centromedicociudadjardin.com/la-importancia-de-comer-sano-y-hacer-ejercicio.html")

        btnBack.setOnClickListener {
            finish()
        }
    }
}
