package com.example.jdgomes.desfrute.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jdgomes.desfrute.R;
import com.example.jdgomes.desfrute.formulario.ItensFormulario;


public class ItensFragment extends BaseFragment {

    ItensFormulario formulario = new ItensFormulario();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_itens, container, false);
        this.loadComponents(view);
        return view;
    }

    /**
     * Carrega os componentes do spinner.
     * @param view
     */
    private void loadComponents(View view) {


    }


}
