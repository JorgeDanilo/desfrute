package com.example.jdgomes.desfrute.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.jdgomes.desfrute.R
import com.example.jdgomes.desfrute.formulario.ItensFormulario


class ItensFragment : BaseFragment() {

    internal var formulario = ItensFormulario()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_itens, container, false)
        this.loadComponents(view)
        return view
    }

    /**
     * Carrega os componentes do spinner.
     * @param view
     */
    private fun loadComponents(view: View) {


    }


}
