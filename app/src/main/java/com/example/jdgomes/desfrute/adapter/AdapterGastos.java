package com.example.jdgomes.desfrute.adapter;


import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jdgomes.desfrute.MainActivity;
import com.example.jdgomes.desfrute.R;
import com.example.jdgomes.desfrute.db.DespesaDB;
import com.example.jdgomes.desfrute.domain.Despesa;


import java.util.List;
import java.util.logging.Handler;

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

        nomeDespesa.setText(despesa.nome);
        motivoDespesa.setText(despesa.motivo);
        valorDespesa.setText(String.valueOf(despesa.valor));
        prioridadeDespesa.setText(despesa.prioridade);

        // Deleta Despesa
        btnDeleteDespesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                act.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        db.delete(despesa);
                        despesas.remove(position);
                        Toast.makeText(act, "Despesa " + despesa.nome +" Excluída com Sucesso", Toast.LENGTH_SHORT).show();
                        notifyDataSetChanged();
                    }
                });

            }
        });

        return view;
    }
}
