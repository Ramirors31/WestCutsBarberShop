package com.example.westcutsbarbershop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val invitado: Button = findViewById(R.id.invitadoButton)
        invitado.setOnClickListener{
            val intent:Intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }


    }
}