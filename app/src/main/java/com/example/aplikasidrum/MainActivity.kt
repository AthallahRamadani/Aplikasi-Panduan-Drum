package com.example.aplikasidrum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.aplikasidrum.fragments.lagu
import com.example.aplikasidrum.fragments.latihan
import com.example.aplikasidrum.fragments.tentang
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    private val latihanFragment = latihan()
    private val laguFragment = lagu()
    private val tentangFragment = tentang()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(latihanFragment)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_latihan -> replaceFragment(latihanFragment)
                R.id.ic_lagu -> replaceFragment(laguFragment)
                R.id.ic_tentang -> replaceFragment(tentangFragment)
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment){
        if (fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }
}