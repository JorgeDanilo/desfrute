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
    private List<ItensDespesa> itensDespesas;
    private Parcelable selected;

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
