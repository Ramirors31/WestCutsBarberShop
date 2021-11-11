package com.example.westcutsbarbershop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.westcutsbarbershop.fragments.*
import com.google.android.material.bottomnavigation.BottomNavigationMenu
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.internal.NavigationMenu

class HomeActivity : AppCompatActivity() {

    private val homeFragment = HomeFragment()
    //private val storeFragment = StoreFragment()
    private val servicesFragment = ServicesFragment()
    private val barbersFragment = BarbersFragment()
    private val appointmentsFragment =  AppointmentsFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        replaceFragment(homeFragment)
        val bottomNavigationMenu = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationMenu.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.HomeButton->replaceFragment(homeFragment)
                R.id.BarbersButton->replaceFragment(barbersFragment)
                R.id.StoreButton->replaceFragment(appointmentsFragment)
                R.id.ServicesButton->replaceFragment(servicesFragment)

            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment){
        if(fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }
}