package com.example.jdgomes.desfrute.domain;


import org.parceler.Parcel;

import java.util.Date;


@Parcel(Parcel.Serialization.BEAN)
class ItensDespesa  {

    private static final long serialVersionUID = 1L;

    private long id;
    private String nome;
    private Date dataCadastro;
    private String descricao;
    private double valor;
    private Date dataVencimento;
    private String situacaoDespesa;


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


    public String getSituacaoDespesa() {
        return situacaoDespesa;
    }

    public void setSituacaoDespesa(String situacaoDespesa) {
        this.situacaoDespesa = situacaoDespesa;
    }
}
