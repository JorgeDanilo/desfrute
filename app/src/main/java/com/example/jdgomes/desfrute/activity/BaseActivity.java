package com.example.jdgomes.desfrute.activity;


import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import com.example.jdgomes.desfrute.R;
import com.example.jdgomes.desfrute.adapter.AdapterGastos;
import com.example.jdgomes.desfrute.db.DespesaDB;
import com.example.jdgomes.desfrute.domain.Despesa;

import java.util.List;



public class BaseActivity extends AppCompatActivity {

    ListView listaGastos;

    protected void carregaListaGastos() {
        DespesaDB db = new DespesaDB(this);
        List<Despesa> despesas = db.findAll();
        this.listaGastos = findViewById(R.id.list);
        AdapterGastos adapterGastos = new AdapterGastos(despesas, this);
        this.listaGastos.setAdapter(adapterGastos);
    }
}
