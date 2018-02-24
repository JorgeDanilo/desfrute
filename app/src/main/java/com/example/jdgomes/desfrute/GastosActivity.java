package com.example.jdgomes.desfrute;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.jdgomes.desfrute.domain.Despesa;
import com.example.jdgomes.desfrute.db.DespesaDB;

public class GastosActivity extends AppCompatActivity {

    String[] tiposDeGastos;
    private String[] tiposPagamentos;
    private String[] tiposPrioridades;

    private Spinner tipoGasto;
    private Spinner tipoPagamentoSpinner;
    private Spinner tipoPrioridde;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gastos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        this.loadData();
        this.loadComponents();

    }

    /**
     * Load components os view.
     * @return
     */
    private void loadComponents() {
        this.tipoGasto = (Spinner) findViewById(R.id.spTipo);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, tiposDeGastos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.tipoGasto.setAdapter(adapter);

        this.tipoPagamentoSpinner = (Spinner) findViewById(R.id.spTipoPagamento);
        ArrayAdapter<String> adapterTipoPagamento = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, tiposPagamentos);
        adapterTipoPagamento.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.tipoPagamentoSpinner.setAdapter(adapterTipoPagamento);

        this.tipoPrioridde = (Spinner) findViewById(R.id.spPrioridade);
        ArrayAdapter<String> adapterTipoPrioridade = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, tiposPrioridades);
        adapterTipoPrioridade.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.tipoPrioridde.setAdapter(adapterTipoPrioridade);

    }

    private void loadData() {
        tiposDeGastos = new String[] {
                "Trabalho",
                "Casa",
                "Diversão",
                "Outros"
        };

        tiposPagamentos = new String[] {
                "Dinheiro",
                "Cartão de Crédito",
                "Cartão de Débito"
        };

        tiposPrioridades = new String[] {
                "Alta",
                "Baixa"
        };
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.saveGastos:
                Toast.makeText(GastosActivity.this, "Salvar dados", Toast.LENGTH_LONG).show();
                DespesaDB db = new DespesaDB(GastosActivity.this);
                Despesa despesa = new Despesa();
                db.save(despesa);
                return true;

                default:
                    return super.onOptionsItemSelected(item);
        }
    }
}
