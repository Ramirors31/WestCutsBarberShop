package com.example.westcutsbarbershop.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Barbers(
    @StringRes val barberNameResourceId:Int,
    @StringRes val barberDaysResourceId:Int,
    @StringRes val barberHoursResourceId:Int,
    @DrawableRes val barberPhotoResourceId:Int
)
