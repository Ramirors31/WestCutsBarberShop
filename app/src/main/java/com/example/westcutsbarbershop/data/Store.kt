package com.example.westcutsbarbershop.data

import android.media.Image
import androidx.annotation.DrawableRes
import androidx.annotation.IdRes
import androidx.annotation.StringRes

data class Store(
    @StringRes val productResourceId: Int,
    @StringRes val descriptionResourceId: Int,
    @StringRes val priceResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val disponibilidadResourceId: Int
)
