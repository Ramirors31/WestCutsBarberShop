package com.example.westcutsbarbershop.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.westcutsbarbershop.R
import com.example.westcutsbarbershop.data.Store


/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    var product: List<Store> = listOf(
        Store("Minoxidil", 150, "Frasco con 200ml","Imagen"),
        Store("Shampoo", 50, "Frasco con 100ml", "Imagen"),
        Store("Tinte", 100, "Tinte color Rojo", "Imagen")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

}