package com.example.westcutsbarbershop.data

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.westcutsbarbershop.R
import org.w3c.dom.Text

class AppointmentsAdapter (
    private val context: Context,
    private val dataset: ArrayList<Appointments>
): RecyclerView.Adapter<AppointmentsAdapter.ItemViewHolder>(){
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val hora: TextView = view.findViewById(R.id.appointmentHour)
        val fecha : TextView = view.findViewById(R.id.appointmentDay)
        val servicio : TextView = view.findViewById(R.id.appointmentService)
        val barbero : TextView = view.findViewById(R.id.appointmentBarber)
        val codigo: TextView = view.findViewById(R.id.appointmentId)
        val modificar: Button = view.findViewById(R.id.btnModificar)
        val cancelar: Button = view.findViewById(R.id.btnCancelar)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.appointment_item,parent,false)
        return AppointmentsAdapter.ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        val codigo = item.id.toString()
        holder.hora.text = item.hora.toString()
        holder.fecha.text = item.fecha.toString()
        holder.barbero.text = item.barbero.toString()
        holder.servicio.text = item.servicio.toString()
        holder.codigo.text =  "Numero de cita:$codigo"

        holder.cancelar.setOnClickListener(){

        }





    }

    override fun getItemCount() = dataset.size

}