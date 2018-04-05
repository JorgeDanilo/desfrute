package com.example.jdgomes.desfrute.domain


import android.os.Parcelable
import com.orm.SugarRecord

import org.parceler.Parcel

import java.util.Date

@Parcel(Parcel.Serialization.BEAN)
class Despesa : SugarRecord() {

    var id: Long = 0
    var dataCadastro: Date? = null
    var nome: String? = null
    internal var itensDespesas: List<ItensDespesa>? = null
    var selected: Parcelable? = null

}
