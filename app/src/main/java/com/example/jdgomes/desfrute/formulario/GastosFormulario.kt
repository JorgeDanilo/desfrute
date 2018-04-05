package com.example.jdgomes.desfrute.formulario


class GastosFormulario {

    var itensDespesaMock: Array<String>? = null

    init {
        this.loadData()
    }


    private fun loadData() {

        this.itensDespesaMock = arrayOf("Itens 1", "Itens 2", "Itens 3", "Itens 4")
    }
}
