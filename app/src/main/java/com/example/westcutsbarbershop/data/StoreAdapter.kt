package com.example.westcutsbarbershop.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.westcutsbarbershop.R





class StoreAdapter (val store:List<Store>):RecyclerView.Adapter<StoreAdapter.StoreFolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoreFolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return StoreFolder(layoutInflater.inflate(R.layout.store_item,parent, false))
    }
    override fun getItemCount(): Int =store.size

    override fun onBindViewHolder(holder: StoreFolder, position: Int) {
        holder.render(store[position])
    }

    class StoreFolder(val view: View):RecyclerView.ViewHolder(view){
        fun render(store: Store){


        }

    }

}