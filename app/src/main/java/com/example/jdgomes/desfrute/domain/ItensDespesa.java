package com.example.jdgomes.desfrute.domain;


import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

class ItensDespesa implements Parcelable  {

    private static final long serialVersionUID = 1L;

    private long id;
    private String nome;
    private Date dataCadastro;
    private String descricao;
    private double valor;
    private Date dataVencimento;
    private String situacaoDespesa;

    private static final Creator<ItensDespesa> CREATOR = new Creator<ItensDespesa>() {
        @Override
        public ItensDespesa createFromParcel(Parcel p) {
            ItensDespesa itensDespesa = new ItensDespesa();
            itensDespesa.readFromParcel(p);
            return itensDespesa;
        }

        @Override
        public ItensDespesa[] newArray(int size) {
            return new ItensDespesa[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(id);
        dest.writeString(nome);
        dest.writeSerializable(dataCadastro);
        dest.writeString(descricao);
        dest.writeDouble(valor);
        dest.writeString(situacaoDespesa);
    }

    /**
     * Le os dados na mesma ordem que foram escritos.
     * @param parcel
     */
    public void readFromParcel(Parcel parcel) {
       this.id = parcel.readLong();
       this.nome = parcel.readString();
       this.dataCadastro = (Date) parcel.readSerializable();
       this.descricao = parcel.readString();
       this.valor = parcel.readDouble();
       this.situacaoDespesa = parcel.readString();
    }

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
