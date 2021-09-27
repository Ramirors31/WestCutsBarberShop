package com.example.westcutsbarbershop.data

import com.example.westcutsbarbershop.R

class StoreDatasource {
    fun loadItems(): List<Store>{
        return listOf<Store>(
            Store(R.string.shop_product1,R.string.description_product1,R.string.price_product1, R.drawable.minoxidil, R.string.disponibilidad_product1),
            Store(R.string.shop_product2,R.string.description_product2,R.string.price_product3,R.drawable.shampoo, R.string.disponibilidad_product2),
            Store(R.string.shop_product3,R.string.description_product3,R.string.price_product3,R.drawable.tinte, R.string.disponibilidad_product3),
            Store(R.string.shop_product4,R.string.description_product4,R.string.price_product4,R.drawable.cera, R.string.disponibilidad_product4)



        )
    }
}