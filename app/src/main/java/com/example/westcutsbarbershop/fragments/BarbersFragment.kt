package com.example.westcutsbarbershop.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.westcutsbarbershop.R
import com.example.westcutsbarbershop.data.BarbersAdapter
import com.example.westcutsbarbershop.data.BarbersDatasource


/**
 * A simple [Fragment] subclass.
 * Use the [BarbersFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BarbersFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val dataset = BarbersDatasource().loadItems()
        // Inflate the layout for this fragment
        val rootView= inflater.inflate(R.layout.fragment_barbers, container, false)
        val recyclerView: RecyclerView = rootView.findViewById<RecyclerView>(R.id.barbersRecyclerView)
        recyclerView.adapter = BarbersAdapter(recyclerView.context, dataset)
        recyclerView.setHasFixedSize(true)
        return rootView
    }


}