package com.example.activitat41

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class ErrorActivity : AppCompatActivity() {

    lateinit var backButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_error)
        backButton = findViewById<ImageButton>(R.id.backBtnError)

        val intent = this.intent
        val numero = intent.getStringExtra("numeroE")
        val numeroTextView = findViewById<TextView>(R.id.numeroErrorTextView)
        numeroTextView.text = "El numero escollit ha sigut: $numero. El numero correcte era el 1";

        val nom = intent.getStringExtra("nom")
        val nomTextView = findViewById<TextView>(R.id.NomError)
        nomTextView.text = nom;

        backButton.setOnClickListener {
            val intent2 = Intent(this, StartActivity::class.java)
            startActivity(intent2)
        }
    }
}