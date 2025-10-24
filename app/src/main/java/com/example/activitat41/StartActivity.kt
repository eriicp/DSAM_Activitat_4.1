package com.example.activitat41

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

class StartActivity : AppCompatActivity() {
    lateinit var botoE : Button
    lateinit var backButton: ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        botoE = findViewById<Button>(R.id.botoEndevina)
        backButton = findViewById<ImageButton>(R.id.backBtnStart)

        val intent = this.intent
        val nom = intent.getStringExtra("nom")
        val nomTextView = findViewById<TextView>(R.id.nomTextView)
        nomTextView.text = nom;
        title = nom

        backButton.setOnClickListener {
            val intent1 = Intent(this, MainActivity::class.java)
            startActivity(intent1)
        }

        botoE.setOnClickListener {
            val intent2 = Intent(this, SuccesActivity::class.java)
            val intent3 = Intent(this, ErrorActivity::class.java)
            val res = findViewById<EditText>(R.id.EditTextNumero).text.toString()
            if (res == "1"){
                intent2.putExtra("numeroE",res)
                intent2.putExtra("nom", nom)
                startActivity(intent2)
            }
            else {
                intent3.putExtra("numeroE", res)
                intent3.putExtra("nom", nom)
                startActivity(intent3)
            }
        }
    }
}