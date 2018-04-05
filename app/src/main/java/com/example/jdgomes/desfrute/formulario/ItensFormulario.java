package com.example.jdgomes.desfrute.formulario;


import android.widget.EditText;
import android.widget.Spinner;

public class ItensFormulario {

    private EditText nome;
    private EditText descricao;
    private EditText dataVecimento;
    private EditText motivo;

    private Spinner situacaoDespesa;
    private Spinner prioridade;
    private Spinner tipoGasto;
    private Spinner tipoPagamento;

    public EditText getNome() {
        return nome;
    }

    public void setNome(EditText nome) {
        this.nome = nome;
    }

    public EditText getDescricao() {
        return descricao;
    }

    public void setDescricao(EditText descricao) {
        this.descricao = descricao;
    }

    public EditText getDataVecimento() {
        return dataVecimento;
    }

    public void setDataVecimento(EditText dataVecimento) {
        this.dataVecimento = dataVecimento;
    }

    public EditText getMotivo() {
        return motivo;
    }

    public void setMotivo(EditText motivo) {
        this.motivo = motivo;
    }

    public Spinner getSituacaoDespesa() {
        return situacaoDespesa;
    }

    public void setSituacaoDespesa(Spinner situacaoDespesa) {
        this.situacaoDespesa = situacaoDespesa;
    }

    public Spinner getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Spinner prioridade) {
        this.prioridade = prioridade;
    }

    public Spinner getTipoGasto() {
        return tipoGasto;
    }

    public void setTipoGasto(Spinner tipoGasto) {
        this.tipoGasto = tipoGasto;
    }

    public Spinner getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(Spinner tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
