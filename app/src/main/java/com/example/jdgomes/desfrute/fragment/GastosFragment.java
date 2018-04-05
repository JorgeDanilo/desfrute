package com.example.jdgomes.desfrute.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.jdgomes.desfrute.activity.MainActivity;
import com.example.jdgomes.desfrute.R;
import com.example.jdgomes.desfrute.db.DespesaDB;
import com.example.jdgomes.desfrute.domain.Despesa;
import com.example.jdgomes.desfrute.formulario.GastosFormulario;

public class GastosFragment extends BaseFragment {

    GastosFormulario gastosFormulario = new GastosFormulario();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gastos, container, false);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.saveGastos:
                if ( this.validateForm(this.gastosFormulario) ) {
                    //TODO: refatorar para o itens da despesa.
                    DespesaDB db = new DespesaDB(getContext());
                    Despesa despesa = new Despesa();
//                    despesa.setNome(this.gastosFormulario.getTxtNome().getText().toString());
//                    despesa.setValor(Double.parseDouble(this.gastosFormulario.getTxtValor().getText().toString()));
//                    despesa.setMotivo(this.gastosFormulario.getTxtMotivo().getText().toString());
//                    despesa.setPrioridade(this.gastosFormulario.getTipoPrioridde().getSelectedItem().toString());
//                    despesa.setTipo(this.gastosFormulario.getTipoGasto().getSelectedItem().toString());
//                    despesa.setTipoPagamento(this.gastosFormulario.getTipoPagamentoSpinner().getSelectedItem().toString());
                    long idSaved = db.save(despesa);
                    Toast.makeText(getContext(), "Despesa salva com sucesso", Toast.LENGTH_SHORT).show();
                    Log.i("Id Saved => ", String.valueOf(idSaved));
                    Intent intent = new Intent(getContext(), MainActivity.class);
                    startActivity(intent);
                    return true;
                }
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    /**
     * Checa se há campos vazios no formulario.
     * @param formulario
     * @return
     */
    private boolean validateForm(GastosFormulario formulario) {

        //TODO: REFATORAR PARA O ITEN DA DESPESA.

//        if ( formulario.getTxtNome().getText().toString().equals("") ) {
//            showToast(this.getActivity(), "Campo Nome é obrigatório");
//            return false;
//        }
//
//        if ( formulario.getTxtValor().getText().toString().equals("") ) {
//            showToast(this.getActivity(), "Campo Valor é obrigatório");
//            return false;
//        }
//
//        if ( formulario.getTxtMotivo().getText().toString().equals("") ) {
//            showToast(this.getActivity(), "Campo Motivo é obrigatório");
//            return false;
//        }

        return true;
    }
}
