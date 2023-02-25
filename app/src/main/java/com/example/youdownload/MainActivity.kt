package com.example.youdownload

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDescarga = findViewById<Button>(R.id.botonDescargar)
        val inputUrl = findViewById<EditText>(R.id.editURL)
        val log = findViewById<TextView>(R.id.log)

        val url = inputUrl.text.toString() // TODO: Arreglar el get de la url
        val logs = mutableListOf("Descargando $url")

        btnDescarga.setOnClickListener{
            log.text = logs.joinToString("\n")
        }
    }
}
