package com.example.westcutsbarbershop.data

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.westcutsbarbershop.R

class BarbersAdapter (
    private val context: Context,
    private val dataset: List<Barbers>
): RecyclerView.Adapter<BarbersAdapter.ItemViewHolder>(){
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val barberName: TextView = view.findViewById(R.id.barberName)
        val barberDays: TextView = view.findViewById(R.id.barberDays)
        val barberHours : TextView = view.findViewById(R.id.barberHours)
        val barberPhoto : ImageView = view.findViewById(R.id.profile_image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.barber_item,parent,false)
        return BarbersAdapter.ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.barberName.text = context.resources.getString(item.barberNameResourceId)
        holder.barberDays.text = context.resources.getString(item.barberDaysResourceId)
        holder.barberHours.text = context.resources.getString(item.barberHoursResourceId)
        holder.barberPhoto.setImageResource(item.barberPhotoResourceId)

    }

    override fun getItemCount() = dataset.size

}