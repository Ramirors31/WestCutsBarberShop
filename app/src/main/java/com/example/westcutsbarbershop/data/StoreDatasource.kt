package com.example.westcutsbarbershop.data

import com.example.westcutsbarbershop.R

class StoreDatasource {
    fun loadItems(): List<Store>{
        return listOf<Store>(
            Store(R.string.shop_product1,R.string.description_product1,R.string.price_product1, R.drawable.minoxidil),
            Store(R.string.shop_product2,R.string.description_product2,R.string.price_product3,R.drawable.shampoo),
            Store(R.string.shop_product3,R.string.description_product3,R.string.price_product3,R.drawable.tinte),
            Store(R.string.shop_product4,R.string.description_product4,R.string.price_product4,R.drawable.cera)



        )
    }
}