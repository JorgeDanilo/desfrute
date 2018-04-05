package com.example.jdgomes.desfrute.domain


import com.orm.SugarRecord
import org.parceler.Parcel
import java.util.Date


@Parcel(Parcel.Serialization.BEAN)
internal class ItensDespesa : SugarRecord<ItensDespesa>() {

    private val id: Long = 0
    private val nome: String? = null
    private val dataCadastro: Date? = null
    private val descricao: String? = null
    private val valor: Double? = null
    private val dataVencimento: Date? = null
    private val motivo: String? = null
    private val situacaoDespesa: EnumSituacaoDespesa? = null
    private val prioridade: EnumTipoPrioridade? = null
    private val tipoGasto: EnumTipoGasto? = null
    private val tipoPagamento: EnumTipoPagamento? = null

    companion object {

        private val serialVersionUID = 1L
    }
}
