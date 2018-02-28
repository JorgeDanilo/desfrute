package com.example.jdgomes.desfrute.adapter;


import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.jdgomes.desfrute.R;
import com.example.jdgomes.desfrute.domain.Despesa;

import org.w3c.dom.Text;

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
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = act.getLayoutInflater().inflate(R.layout.lista_despesas, parent, false);
        Despesa despesa = despesas.get(position);
        TextView nomeDespesa = view.findViewById(R.id.coluna_nome);;
        TextView motivoDespesa = view.findViewById(R.id.coluna_motivo);
        TextView valorDespesa = view.findViewById(R.id.coluna_valor);
        TextView prioridadeDespesa = view.findViewById(R.id.coluna_prioridade);

        nomeDespesa.setText(despesa.nome);
        motivoDespesa.setText(despesa.motivo);
        valorDespesa.setText(String.valueOf(despesa.valor));
        prioridadeDespesa.setText(despesa.prioridade);

        return view;
    }
}
