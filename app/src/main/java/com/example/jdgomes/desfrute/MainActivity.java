package com.example.jdgomes.desfrute;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.jdgomes.desfrute.adapter.AdapterGastos;
import com.example.jdgomes.desfrute.db.DespesaDB;
import com.example.jdgomes.desfrute.domain.Despesa;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DespesaDB db = new DespesaDB(this);
        List<Despesa> despesas = db.findAll();
        Log.d("Despesas All ", despesas.toString());

        ListView listaGastos = (ListView) findViewById(R.id.list);
        AdapterGastos adapterGastos = new AdapterGastos(despesas, this);
        listaGastos.setAdapter(adapterGastos);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.btnAddGastos);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GastosActivity.class);
                startActivity(intent);
            }
        });
    }
}
