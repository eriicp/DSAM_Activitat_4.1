package com.example.activitat41

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SuccesActivity : AppCompatActivity() {

    lateinit var backButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_succes)
        backButton = findViewById<ImageButton>(R.id.backBtnSucces)

        val intent = this.intent
        val numero = intent.getStringExtra("numeroE")
        val numeroTextView = findViewById<TextView>(R.id.numeroSuccesTextView)
        numeroTextView.text = "El numero escollit ha sigut: $numero";

        val nom = intent.getStringExtra("nom")
        val nomTextView = findViewById<TextView>(R.id.NomSucces)
        nomTextView.text = nom;

        backButton.setOnClickListener {
            val intent2 = Intent(this, StartActivity::class.java)
            startActivity(intent2)
        }
    }
}