package com.example.activitat41

import android.content.Intent
import android.icu.text.SimpleDateFormat
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var botoinici : Button
    lateinit var dataActualTextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        botoinici = findViewById(R.id.botoinici)
        dataActualTextView = findViewById<TextView>(R.id.data)

        botoinici.setOnClickListener{
            val intent = Intent(this, StartActivity::class.java)
            intent.putExtra("nom", findViewById<EditText>(R.id.EditTextNom).text.toString())
            startActivity(intent)
        }

        val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
        val dataActual = sdf.format(Date())

        dataActualTextView.text = dataActual
    }
}