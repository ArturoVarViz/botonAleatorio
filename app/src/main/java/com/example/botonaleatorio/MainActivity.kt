package com.example.botonaleatorio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random



class MainActivity : AppCompatActivity() {

    private lateinit var listaAleatoria: MutableList<Int>
    private lateinit var botonAgregar: Button
    private lateinit var textoLista: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listaAleatoria = mutableListOf()
        botonAgregar = findViewById(R.id.boton_agregar)
        textoLista = findViewById(R.id.texto_lista)

        botonAgregar.setOnClickListener {
            val numeroAleatorio = (1..4).random() // Random.nextInt(1, 5)
            listaAleatoria.add(numeroAleatorio)
            textoLista.text = listaAleatoria.toString()
        }
    }
}

