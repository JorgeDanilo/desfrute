package com.example.jdgomes.desfrute.domain;


import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

public class Despesa implements Parcelable {

    private static final long serialVersionUID = 1L;

    private long id;
    private Date dataCadastro;
    private String nome;
    private Double valor;
    private String motivo;
    private String prioridade;
    private String tipo;
    private String tipoPagamento;

    // Flag para indicar que a despesa está selecionado.
    private boolean selected;



    public static final Creator<Despesa> CREATOR = new Creator<Despesa>() {
        @Override
        public Despesa createFromParcel(Parcel p) {
            Despesa d = new Despesa();
            d.readFromParcel(p);
            return d;
        }

        @Override
        public Despesa[] newArray(int size) {
            return new Despesa[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    /**
     * Serializa os dados.
     * @param dest
     * @param flags
     */
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(id);
        dest.writeString(nome);
        dest.writeDouble(valor);
        dest.writeString(motivo);
        dest.writeString(prioridade);
        dest.writeString(tipo);
        dest.writeString(tipoPagamento);
    }

    /**
     * Le os dados na mesma ordem que foram escritos.
     * @param parcel
     */
    public void readFromParcel(Parcel parcel) {
        this.id = parcel.readLong();
        this.nome = parcel.readString();
        this.valor = parcel.readDouble();
        this.motivo = parcel.readString();
        this.prioridade = parcel.readString();
        this.tipo = parcel.readString();
        this.tipoPagamento = parcel.readString();
    }

    @Override
    public String toString() {
        return
                "Despesa: " + nome + "\n" +
                "Valor Despesa: " + valor;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public static Creator<Despesa> getCREATOR() {
        return CREATOR;
    }
}
