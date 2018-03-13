package com.example.jdgomes.desfrute.formulario;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class GastosFormulario {

    private String[] tiposDeGastos;
    private String[] tiposPagamentos;
    private String[] tiposPrioridades;
    private Spinner tipoGasto;
    private Spinner tipoPagamentoSpinner;
    private Spinner tipoPrioridde;
    private Button btnSave;
    private EditText txtNome;
    private EditText txtMotivo;
    private EditText txtValor;


    public GastosFormulario() {
        this.loadData();
    }


    private void loadData() {
        this.setTiposDeGastos(new String[] {
                "Trabalho",
                "Casa",
                "Diversão",
                "Outros"
        });

        this.setTiposPagamentos(new String[] {
                "Dinheiro",
                "Cartão de Crédito",
                "Cartão de Débito"
        });

        this.setTiposPrioridades(new String[] {
                "Alta",
                "Baixa"
        });
    }

    public String[] getTiposDeGastos() {
        return tiposDeGastos;
    }

    public void setTiposDeGastos(String[] tiposDeGastos) {
        this.tiposDeGastos = tiposDeGastos;
    }

    public String[] getTiposPagamentos() {
        return tiposPagamentos;
    }

    public void setTiposPagamentos(String[] tiposPagamentos) {
        this.tiposPagamentos = tiposPagamentos;
    }

    public String[] getTiposPrioridades() {
        return tiposPrioridades;
    }

    public void setTiposPrioridades(String[] tiposPrioridades) {
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
}
