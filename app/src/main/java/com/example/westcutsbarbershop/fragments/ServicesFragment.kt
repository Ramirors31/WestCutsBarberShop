package com.example.westcutsbarbershop.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
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
        val spinner = findViewById<Spinner>(R.id.spinner_barberos)
        val lista = resources.getStringArray(R.array.opciones)
        val adaptador = ArrayAdapter(this,android.R.layout.simple_spinner_item, lista)
        spinner.adapter = adaptador
        return inflater.inflate(R.layout.fragment_services, container, false)

    }


}