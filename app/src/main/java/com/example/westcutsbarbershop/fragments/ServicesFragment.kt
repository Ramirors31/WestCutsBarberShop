package com.example.westcutsbarbershop.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.westcutsbarbershop.R




/**
 * A simple [Fragment] subclass.
 * Use the [ServicesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ServicesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView =inflater.inflate(R.layout.fragment_services, container, false)

        val spinner:Spinner =rootView.findViewById<Spinner>(R.id.spinner_barberos)
        val lista = resources.getStringArray(R.array.opciones)
        val adaptador = ArrayAdapter<String>(spinner.context, android.R.layout.simple_spinner_item,lista)
        spinner.adapter = adaptador


        val sendButton:Button = rootView.findViewById<Button>(R.id.btn_agendar)
        sendButton.setOnClickListener {
            val message = "Se ha agendado tu servicio"
            Toast.makeText(sendButton.context, message, Toast.LENGTH_SHORT).show()
        }
        return rootView


    }




}