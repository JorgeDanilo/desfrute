package com.example.jdgomes.desfrute.formulario;


import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.jdgomes.desfrute.domain.EnumTipoGasto;
import com.example.jdgomes.desfrute.domain.EnumTipoPagamento;
import com.example.jdgomes.desfrute.domain.EnumTipoPrioridade;

public class ItensFormulario {

    private EnumTipoGasto tiposDeGastos;
    private EnumTipoPagamento tiposPagamentos;
    private EnumTipoPrioridade tiposPrioridades;

    private Spinner tipoGasto;
    private Spinner tipoPagamentoSpinner;
    private Spinner tipoPrioridde;
    private Button btnSave;
    private EditText txtNome;
    private EditText txtMotivo;
    private EditText txtValor;
    private Spinner itensDespesa;


    public EnumTipoGasto getTiposDeGastos() {
        return tiposDeGastos;
    }

    public void setTiposDeGastos(EnumTipoGasto tiposDeGastos) {
        this.tiposDeGastos = tiposDeGastos;
    }

    public EnumTipoPagamento getTiposPagamentos() {
        return tiposPagamentos;
    }

    public void setTiposPagamentos(EnumTipoPagamento tiposPagamentos) {
        this.tiposPagamentos = tiposPagamentos;
    }

    public EnumTipoPrioridade getTiposPrioridades() {
        return tiposPrioridades;
    }

    public void setTiposPrioridades(EnumTipoPrioridade tiposPrioridades) {
        this.tiposPrioridades = tiposPrioridades;
    }

    public Spinner getTipoGasto() {
        return tipoGasto;
    }

    public void setTipoGasto(Spinner tipoGasto) {
        this.tipoGasto = tipoGasto;
    }

    public Spinner getTipoPagamentoSpinner() {
        return tipoPagamentoSpinner;
    }

    public void setTipoPagamentoSpinner(Spinner tipoPagamentoSpinner) {
        this.tipoPagamentoSpinner = tipoPagamentoSpinner;
    }

    public Spinner getTipoPrioridde() {
        return tipoPrioridde;
    }

    public void setTipoPrioridde(Spinner tipoPrioridde) {
        this.tipoPrioridde = tipoPrioridde;
    }

    public Button getBtnSave() {
        return btnSave;
    }

    public void setBtnSave(Button btnSave) {
        this.btnSave = btnSave;
    }

    public EditText getTxtNome() {
        return txtNome;
    }

    public void setTxtNome(EditText txtNome) {
        this.txtNome = txtNome;
    }

    public EditText getTxtMotivo() {
        return txtMotivo;
    }

    public void setTxtMotivo(EditText txtMotivo) {
        this.txtMotivo = txtMotivo;
    }

    public EditText getTxtValor() {
        return txtValor;
    }

    public void setTxtValor(EditText txtValor) {
        this.txtValor = txtValor;
    }

    public Spinner getItensDespesa() {
        return itensDespesa;
    }

    public void setItensDespesa(Spinner itensDespesa) {
        this.itensDespesa = itensDespesa;
    }

}
