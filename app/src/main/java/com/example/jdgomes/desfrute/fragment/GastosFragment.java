package com.example.jdgomes.desfrute.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.jdgomes.desfrute.MainActivity;
import com.example.jdgomes.desfrute.R;
import com.example.jdgomes.desfrute.db.DespesaDB;
import com.example.jdgomes.desfrute.domain.Despesa;
import com.example.jdgomes.desfrute.formulario.GastosFormulario;

public class GastosFragment extends BaseFragment {

    GastosFormulario gastosFormulario = new GastosFormulario();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gastos, container, false);

        this.loadComponents(view);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

    }

    /**
     * Load components os view.
     * @return
     */
    private void loadComponents(View view) {
        this.gastosFormulario.setTipoGasto((Spinner) view.findViewById(R.id.spTipo));
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_dropdown_item, this.gastosFormulario.getTiposDeGastos());
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.gastosFormulario.getTipoGasto().setAdapter(adapter);

        this.gastosFormulario.setTipoPagamentoSpinner((Spinner)  view.findViewById(R.id.spTipoPagamento));
        ArrayAdapter<String> adapterTipoPagamento = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_dropdown_item, this.gastosFormulario.getTiposPagamentos());
        adapterTipoPagamento.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.gastosFormulario.getTipoPagamentoSpinner().setAdapter(adapterTipoPagamento);

        this.gastosFormulario.setTipoPrioridde((Spinner) view.findViewById(R.id.spPrioridade));
        ArrayAdapter<String> adapterTipoPrioridade = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_dropdown_item, this.gastosFormulario.getTiposPrioridades());
        adapterTipoPrioridade.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.gastosFormulario.getTipoPrioridde().setAdapter(adapterTipoPrioridade);

        this.gastosFormulario.setTxtNome((EditText) view.findViewById(R.id.txtNome));
        this.gastosFormulario.setTxtMotivo((EditText) view.findViewById(R.id.txtMotivo));
        this.gastosFormulario.setTxtValor((EditText) view.findViewById(R.id.txtValor));

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.saveGastos:
                DespesaDB db = new DespesaDB(getContext());
                Despesa despesa = new Despesa();
                despesa.setNome(this.gastosFormulario.getTxtNome().getText().toString());
                despesa.setValor(Double.parseDouble(this.gastosFormulario.getTxtValor().getText().toString()));
                despesa.setMotivo(this.gastosFormulario.getTxtMotivo().getText().toString());
                despesa.setPrioridade(this.gastosFormulario.getTipoPrioridde().getSelectedItem().toString());
                despesa.setTipo(this.gastosFormulario.getTipoGasto().getSelectedItem().toString());
                despesa.setTipoPagamento(this.gastosFormulario.getTipoPagamentoSpinner().getSelectedItem().toString());
                long idSaved = db.save(despesa);
                Toast.makeText(getContext(), "Despesa salva com sucesso", Toast.LENGTH_SHORT).show();
                Log.i("Id Saved => ", String.valueOf(idSaved));
                Intent intent = new Intent(getContext(), MainActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
