package com.example.jdgomes.desfrute.domain


import android.os.Parcelable

import com.orm.SugarRecord

import org.parceler.Parcel

import java.util.Date

@Parcel(Parcel.Serialization.BEAN)
class Despesa : SugarRecord<Despesa>() {

    private val id: Long = 0
    private val dataCadastro: Date? = null
    private val nome: String? = null
    private val itensDespesas: List<ItensDespesa>? = null
    private val selected: Parcelable? = null

    companion object {

        private val serialVersionUID = 1L
    }

}
