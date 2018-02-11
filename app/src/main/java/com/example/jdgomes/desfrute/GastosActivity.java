package com.example.jdgomes.desfrute;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class GastosActivity extends AppCompatActivity {

    private String[] tiposDeGastos = new String[] {
            "Trabalho",
            "Casa",
            "Diversão",
            "Outros"
    };

    private String[] tiposPagamentos = new String[] {
            "Dinheiro",
            "Cartão de Crédito",
            "Cartão de Débito"
    };

    private String[] tiposPrioridades = new String[] {
            "Alta",
            "Baixa"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gastos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Spinner tipoGasto = (Spinner) findViewById(R.id.spTipo);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, tiposDeGastos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        tipoGasto.setAdapter(adapter);

        final Spinner tipoPagamentoSpinner = (Spinner) findViewById(R.id.spTipoPagamento);
        ArrayAdapter<String> adapterTipoPagamento = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, tiposPagamentos);
        adapterTipoPagamento.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        tipoPagamentoSpinner.setAdapter(adapterTipoPagamento);

        final Spinner tipoPrioridde = (Spinner) findViewById(R.id.spPrioridade);
        ArrayAdapter<String> adapterTipoPrioridade = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, tiposPrioridades);
        adapterTipoPrioridade.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        tipoPrioridde.setAdapter(adapterTipoPrioridade);

        Button btnSave = (Button) findViewById(R.id.save);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GastosActivity.this, "Salvar dados", Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if ( id == R.id.action_settings ) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
