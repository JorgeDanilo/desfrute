package com.example.jdgomes.desfrute.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup

import com.example.jdgomes.desfrute.R
import com.example.jdgomes.desfrute.R.id.txtNome
import com.example.jdgomes.desfrute.domain.Despesa
import com.example.jdgomes.desfrute.formulario.GastosFormulario
import com.orm.SugarRecord

class GastosFragment : BaseFragment() {

    internal var gastosFormulario = GastosFormulario()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_gastos, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item!!.itemId) {
            R.id.saveGastos -> {
                if (this.validateForm(this.gastosFormulario)) {
                    val despesa = Despesa()
                    var txtNome = R.id.txtNome.toString()
                    despesa.nome = txtNome
                    Log.d("DESPESA", despesa.nome)
                    val idInsert = despesa.save()
                    Log.d("INSERTE", idInsert.toString())
                    //Save.
                    //TODO: refatorar para o itens da despesa.

                }
                return super.onOptionsItemSelected(item)
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }


    /**
     * Checa se há campos vazios no formulario.
     * @param formulario
     * @return
     */
    private fun validateForm(formulario: GastosFormulario): Boolean {

        //TODO: REFATORAR PARA O ITEN DA DESPESA.

        //        if ( formulario.getTxtNome().getText().toString().equals("") ) {
        //            showToast(this.getActivity(), "Campo Nome é obrigatório");
        //            return false;
        //        }
        //
        //        if ( formulario.getTxtValor().getText().toString().equals("") ) {
        //            showToast(this.getActivity(), "Campo Valor é obrigatório");
        //            return false;
        //        }
        //
        //        if ( formulario.getTxtMotivo().getText().toString().equals("") ) {
        //            showToast(this.getActivity(), "Campo Motivo é obrigatório");
        //            return false;
        //        }

        return true
    }
}
