package com.example.jdgomes.desfrute.domain;


import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

public class Despesa implements Parcelable {

    private static final long serialVersionUID = 1L;

    public long id;
    public Date dataCadastro;
    public String nome;
    public Double valor;
    public String motivo;
    public String prioridade;
    public String tipo;
    public String tipoPagamento;

    // Flag para indicar que a despesa está selecionado.
    public boolean selected;



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
        return "Despesa {" + "nome='" + nome + '\'' + '}';
    }
}
