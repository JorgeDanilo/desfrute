package com.example.jdgomes.desfrute.adapter;


import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jdgomes.desfrute.R;
import com.example.jdgomes.desfrute.activity.GastosActivity;
import com.example.jdgomes.desfrute.db.DespesaDB;
import com.example.jdgomes.desfrute.domain.Despesa;


import java.util.List;

public class AdapterGastos extends BaseAdapter {

    private final List<Despesa> despesas;
    private final Activity act;

    public AdapterGastos(List<Despesa> despesas, Activity act) {
        this.despesas = despesas;
        this.act = act;
    }

    @Override
    public int getCount() {
        return despesas.size();
    }

    @Override
    public Object getItem(int position) {
        return despesas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = act.getLayoutInflater().inflate(R.layout.lista_despesas, parent, false);
        final DespesaDB db = new DespesaDB(act);
        final Despesa despesa = despesas.get(position);
        TextView nomeDespesa = view.findViewById(R.id.coluna_nome);
        TextView motivoDespesa = view.findViewById(R.id.coluna_motivo);
        TextView valorDespesa = view.findViewById(R.id.coluna_valor);
        TextView prioridadeDespesa = view.findViewById(R.id.coluna_prioridade);
        Button btnDeleteDespesa = view.findViewById(R.id.btnDeletaDespesa);
        Button btnDetalharDespesa = view.findViewById(R.id.btnDetalharDespesa);

        nomeDespesa.setText(despesa.getNome());
        motivoDespesa.setText(despesa.getMotivo());
        valorDespesa.setText(String.valueOf(despesa.getValor()));
        prioridadeDespesa.setText(despesa.getPrioridade());

        // Deleta Despesa
        btnDeleteDespesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                act.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        db.delete(despesa);
                        despesas.remove(position);
                        Toast.makeText(act, "Despesa " + despesa.getNome() +" Excluída com Sucesso", Toast.LENGTH_SHORT).show();
                        notifyDataSetChanged();
                    }
                });

            }
        });


        //TODO: criar uma view conforme documentação.
        // detalhar despesa
        btnDetalharDespesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Despesa despesaSaved = db.findById(despesa.getId());
                Intent intent = new Intent(act, GastosActivity.class);
                act.startActivity(intent);
            }
        });

        return view;
    }
}
