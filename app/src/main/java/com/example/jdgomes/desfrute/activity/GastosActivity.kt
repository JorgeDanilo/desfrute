package com.example.jdgomes.desfrute.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu

import com.example.jdgomes.desfrute.R
import com.example.jdgomes.desfrute.fragment.GastosFragment

class GastosActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gastos)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        val fm = supportFragmentManager
        if (savedInstanceState == null) {
            val ft = fm.beginTransaction()
            val gastosFragment = GastosFragment()
            val b = Bundle()
            ft.add(R.id.layoutFrag, gastosFragment, "gastos")
            ft.commit()
        }

    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
}
