package com.example.westcutsbarbershop.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.westcutsbarbershop.R
import com.example.westcutsbarbershop.data.Store
import com.example.westcutsbarbershop.data.StoreAdapter
import com.example.westcutsbarbershop.data.StoreDatasource


/**
 * A simple [Fragment] subclass.
 * Use the [StoreFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class StoreFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val Dataset = StoreDatasource().loadItems()


        // Inflate the layout for this fragment
        val rootView= inflater.inflate(R.layout.fragment_store, container, false)
        val recyclerView:RecyclerView = rootView.findViewById<RecyclerView>(R.id.recyclerViewStore)
        recyclerView.adapter = StoreAdapter(recyclerView.context,Dataset)
        recyclerView.setHasFixedSize(true)
        return rootView
    }

}