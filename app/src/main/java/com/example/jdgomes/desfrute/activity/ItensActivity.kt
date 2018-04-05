package com.example.jdgomes.desfrute.activity

import android.os.Bundle
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar

import com.example.jdgomes.desfrute.R
import com.example.jdgomes.desfrute.fragment.ItensFragment

class ItensActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_itens)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val fm = supportFragmentManager
        if (savedInstanceState == null) {
            val ft = fm.beginTransaction()
            val fragment = ItensFragment()
            ft.add(R.id.layoutItens, fragment, "Itens Fragment")
            ft.commit()
        }
    }

}
