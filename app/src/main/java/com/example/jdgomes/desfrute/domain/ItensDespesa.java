package com.example.jdgomes.desfrute.domain;


import org.parceler.Parcel;

import java.util.Date;


@Parcel(Parcel.Serialization.BEAN)
class ItensDespesa  {

    private static final long serialVersionUID = 1L;

    private long id;
    private String nome;
    private Date dataCadastro;
    private String descricao; // ok
    private double valor; // ok
    private Date dataVencimento; // ok
    private EnumSituacaoDespesa situacaoDespesa; // ok
    private String motivo; // ok => subject icon
    private String prioridade; // ok => alta, baixa.
    private String tipo; // ok => trabalho, casa, etc.
    private String tipoPagamento; // ok = > Cartão, Debito,


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public EnumSituacaoDespesa getSituacaoDespesa() {
        return situacaoDespesa;
    }

    public void setSituacaoDespesa(EnumSituacaoDespesa situacaoDespesa) {
        this.situacaoDespesa = situacaoDespesa;
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
}
