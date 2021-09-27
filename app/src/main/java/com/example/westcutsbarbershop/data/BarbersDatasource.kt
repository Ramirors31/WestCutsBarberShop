package com.example.westcutsbarbershop.data

import com.example.westcutsbarbershop.R

class BarbersDatasource {
    fun loadItems():List<Barbers>{
        return listOf<Barbers>(
            Barbers(R.string.name_barber1,R.string.days_barber1,R.string.hours_barber,R.drawable.juanignacio),
            Barbers(R.string.name_barber2,R.string.days_barber2,R.string.hours_barber,R.drawable.elvato),
            Barbers(R.string.name_barber3,R.string.days_barber3,R.string.hours_barber,R.drawable.rodney),
            Barbers(R.string.name_barber4,R.string.days_barber4,R.string.hours_barber,R.drawable.elbryan)

        )
    }
}