package com.example.jdgomes.desfrute.domain;


import android.os.Parcel;
import android.os.Parcelable;

public class Despesa implements Parcelable {

    public long id;


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

    public boolean selected; // Flag para indicar que a despesa está selecionado.

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        // Escreve os dados para serem serializados.
        dest.writeLong(id);;
    }

    public void readFromParcel(Parcel parcel) {

    }
}
