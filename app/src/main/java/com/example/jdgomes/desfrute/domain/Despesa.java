package com.example.jdgomes.desfrute.domain;


import android.os.Parcelable;

import org.parceler.Parcel;

import java.util.Date;
import java.util.List;

@Parcel(Parcel.Serialization.BEAN)
public class Despesa {

    private static final long serialVersionUID = 1L;

    private long id;
    private Date dataCadastro;
    private String nome;
    private Double valor;
    private String motivo;
    private String prioridade;
    private String tipo;
    private String tipoPagamento;
    private List<ItensDespesa> itensDespesas;
    private Parcelable selected;

    @Override
    public String toString() {
        return
              "Nome Despesa: " + nome + "\n" +
              "Valor Despesa: " + valor + "\n" +
              "Motivo Despesa: " + motivo + "\n" +
              "Prioridade Despesa: " + prioridade + "\n" +
              "Tipo Despesa: " + tipo + "\n" +
              "Tipo Pagamento Despesa: " + tipoPagamento;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public List<ItensDespesa> getItensDespesas() {
        return itensDespesas;
    }

    public void setItensDespesas(List<ItensDespesa> itensDespesas) {
        this.itensDespesas = itensDespesas;
    }

    public Parcelable getSelected() {
        return selected;
    }

    public void setSelected(Parcelable selected) {
        this.selected = selected;
    }
}
