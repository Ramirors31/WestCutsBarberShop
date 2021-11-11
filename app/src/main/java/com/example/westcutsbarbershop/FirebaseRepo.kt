package com.example.westcutsbarbershop

import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import com.google.firebase.firestore.QuerySnapshot


class FirebaseRepo {
    private val firebaseFirestore: FirebaseFirestore = FirebaseFirestore.getInstance()


    //OBTENER DATOS DE CITAS DE USUARIO
    fun getAppointments(): Task<QuerySnapshot> {
        return firebaseFirestore.collection("citas").get()

    }
}