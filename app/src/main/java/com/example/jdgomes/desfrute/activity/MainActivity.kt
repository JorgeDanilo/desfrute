package com.example.jdgomes.desfrute.activity

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.widget.Toolbar
import com.example.jdgomes.desfrute.R

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        carregaListaGastos()
        goToNewGastos()
    }

    fun goToNewGastos() {
        val fab = findViewById<FloatingActionButton>(R.id.btnAddGastos)
        fab.setOnClickListener {
            val intent = Intent(this, GastosActivity::class.java)
            startActivity(intent)
        }
    }
}
