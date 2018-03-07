package com.example.jdgomes.desfrute;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.jdgomes.desfrute.adapter.AdapterGastos;
import com.example.jdgomes.desfrute.db.DespesaDB;
import com.example.jdgomes.desfrute.domain.Despesa;
import com.example.jdgomes.desfrute.fragment.GastosFragment;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listaGastos;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        carregaListaGastos();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.btnAddGastos);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GastosActivity.class);
                startActivity(intent);
            }
        });
    }

    /**
     * Responsável por carregar a lista de gastos
     */
    public void carregaListaGastos() {
        DespesaDB db = new DespesaDB(this);
        List<Despesa> despesas = db.findAll();
        Log.d("Despesas All ", despesas.toString());

        this.listaGastos = (ListView) findViewById(R.id.list);
        AdapterGastos adapterGastos = new AdapterGastos(despesas, this);
        this.listaGastos.setAdapter(adapterGastos);
    }

    /**
     * Responsável por detalhar
     */
    public void detalhar() {

    }
}
