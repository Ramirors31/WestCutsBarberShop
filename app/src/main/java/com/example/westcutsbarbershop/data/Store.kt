package com.example.westcutsbarbershop.data

import android.media.Image
import androidx.annotation.DrawableRes

data class Store(
    val producto:String,
    val precio: Int,
    val descripcion: String,
    val imagenResourceId: String
)
