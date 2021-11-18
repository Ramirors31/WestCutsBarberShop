package com.example.westcutsbarbershop.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.westcutsbarbershop.R
import com.example.westcutsbarbershop.data.Appointments
import com.example.westcutsbarbershop.data.AppointmentsAdapter
import com.example.westcutsbarbershop.data.BarbersAdapter
import com.example.westcutsbarbershop.data.BarbersDatasource
import com.google.firebase.firestore.*


/**
 * A simple [Fragment] subclass.
 * Use the [BarbersFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AppointmentsFragment : Fragment() {
    private val dataset = arrayListOf<Appointments>()
    private val db = FirebaseFirestore.getInstance()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val rootView= inflater.inflate(R.layout.fragment_appointments, container, false)
        val recyclerView: RecyclerView = rootView.findViewById<RecyclerView>(R.id.recyclerViewAppointments)
        recyclerView.adapter = AppointmentsAdapter(recyclerView.context, dataset)
        recyclerView.setHasFixedSize(true)

        eventChangeListener()
        return rootView
    }

    private fun eventChangeListener() {
        db.collection("citas").
                addSnapshotListener(object : EventListener<QuerySnapshot>{
                    override fun onEvent(
                        value: QuerySnapshot?,
                        error: FirebaseFirestoreException?
                    ) {
                        if (error != null){
                            Log.e("Firestore Error", error.message.toString())
                        }

                        else {
                            for (dc : DocumentChange in value?.documentChanges!!){
                                if (dc.type == DocumentChange.Type.ADDED){
                                    dataset.add(dc.document.toObject(Appointments::class.java))
                                }
                            }
                        }
                    }

                })
    }


}