package com.example.westcutsbarbershop.data

import android.content.Context
import android.service.autofill.Dataset
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.westcutsbarbershop.R

class StoreAdapter (
    private val context: Context,
    private val dataset: List<Store>
    ): RecyclerView.Adapter<StoreAdapter.itemViewHolder>(){

    class itemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val productName: TextView = view.findViewById(R.id.productName)
        val productDescp: TextView = view.findViewById(R.id.productDescription)
        val productPrice : TextView = view.findViewById(R.id.productPrice)
        val productImage : ImageView = view.findViewById(R.id.productImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.store_item,parent,false)
        return itemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: itemViewHolder, position: Int) {
        val item = dataset[position]
        holder.productName.text = context.resources.getString(item.productResourceId)
        holder.productDescp.text = context.resources.getString(item.descriptionResourceId)
        holder.productPrice.text = context.resources.getString(item.priceResourceId)
        holder.productImage.setImageResource(item.imageResourceId)
    }

    override fun getItemCount() = dataset.size


}