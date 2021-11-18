package com.example.westcutsbarbershop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.westcutsbarbershop.fragments.BarbersCitasFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_WestCutsBarberShop)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login: Button = findViewById(R.id.loginButton)
        val invitado: Button = findViewById(R.id.invitadoButton)
        val usuario: TextView = findViewById(R.id.emailEditText)
        val contraseña: TextView = findViewById(R.id.passwordEditText)
        invitado.setOnClickListener{
            val intent:Intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        login.setOnClickListener{
            //val intent:Intent = Intent(this, )
        }




    }
}