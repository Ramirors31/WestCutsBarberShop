package com.example.westcutsbarbershop.fragments

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.westcutsbarbershop.R
import com.google.firebase.firestore.FirebaseFirestore
import java.text.SimpleDateFormat
import java.util.*


/**
 * A simple [Fragment] subclass.
 * Use the [ServicesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ServicesFragment : Fragment() {
    private val db = FirebaseFirestore.getInstance()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //  VISTA PADRE DEL FRAGMENTO
        val rootView = inflater.inflate(R.layout.fragment_services, container, false)


        //******INICIA CODIFICACION DE SPINNER PARA SELECCIONAR BARBERO*********
        val spinner: Spinner = rootView.findViewById<Spinner>(R.id.spinner_barberos)
        val lista = resources.getStringArray(R.array.opciones)
        val adaptador =
            ArrayAdapter<String>(spinner.context, android.R.layout.simple_spinner_item, lista)
        spinner.adapter = adaptador
        //******TERMINA CODIFICACION DE SPINNER***********

        //DATE PICKER PARA FECHA DE CITA
        val editFecha: EditText = rootView.findViewById<EditText>(R.id.edit_fecha)
        val myCalendar = Calendar.getInstance()
        val datePicker = DatePickerDialog.OnDateSetListener{view, year, month, dayOfMonth ->
            myCalendar.set(Calendar.YEAR,year)
            myCalendar.set(Calendar.MONTH, month)
            myCalendar.set(Calendar.DAY_OF_MONTH,dayOfMonth)
            updateLabel(myCalendar,editFecha)
        }

        editFecha.setOnClickListener{
            DatePickerDialog(editFecha.context,datePicker,
            myCalendar.get(Calendar.YEAR),
            myCalendar.get(Calendar.MONTH),
            myCalendar.get(Calendar.DAY_OF_MONTH)).show()
        }

        //TIME PICKER PARA HORA DE CITA
        val editHora: EditText = rootView.findViewById<EditText>(R.id.edit_hora)
        val timePicker = TimePickerDialog.OnTimeSetListener{view,hour,minute ->
            myCalendar.set(Calendar.HOUR_OF_DAY,hour)
            myCalendar.set(Calendar.MINUTE, minute)
            updateTimeLabel(myCalendar, editHora)
        }

        editHora.setOnClickListener{
            TimePickerDialog(editHora.context,timePicker,
            myCalendar.get(Calendar.HOUR_OF_DAY),
            myCalendar.get(Calendar.MINUTE),
                false).show()
        }
        //BOTON PARA AGENDAR LA CITA Y GUARDARLA EN LA BASE DE DATOS
        val agendarBtn:Button = rootView.findViewById<Button>(R.id.btn_agendar)
        val userName:EditText = rootView.findViewById<EditText>(R.id.edit_nombre)
        val phone:EditText = rootView.findViewById<EditText>(R.id.edit_telefono)
        val hora:EditText = rootView.findViewById<EditText>(R.id.edit_fecha)
        val barbero:Spinner = rootView.findViewById<Spinner>(R.id.spinner_barberos)
        val fecha:EditText = rootView.findViewById<EditText>(R.id.edit_fecha)
        //val datosCita = hashMapOf()


        //BOTON PARA REGISTRAR UNA CITA EN LA BASE DE DATOS
        val sendButton:Button = rootView.findViewById<Button>(R.id.btn_agendar)
        sendButton.setOnClickListener {
            db.collection("citas").add(hashMapOf(
                "nombre" to userName.text.toString(),
                "telefono" to phone.text.toString(),
                "fecha" to fecha.text.toString(),
                "hora" to hora.text.toString(),
                "barbero" to barbero.selectedItem.toString(),
                "servicio" to "Corte de pelo clasico"
            ))
            val message = "Se ha agendado tu servicio"
            Toast.makeText(sendButton.context, message, Toast.LENGTH_SHORT).show()
        }

        return rootView

    }

    private fun updateTimeLabel(myCalendar: Calendar, editHora: EditText) {
        val format = "HH:mm"
        val sdf = SimpleDateFormat(format,Locale.ENGLISH)
        editHora.setText(sdf.format(myCalendar.time))

    }

    private fun updateLabel(myCalendar: Calendar,editFecha:EditText) {
        val format = "dd-MM-yyyy"
        val sdf = SimpleDateFormat(format,Locale.ENGLISH)
        editFecha.setText(sdf.format(myCalendar.time))

    }


}