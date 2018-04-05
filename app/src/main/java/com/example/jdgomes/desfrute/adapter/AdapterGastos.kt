package com.example.jdgomes.desfrute.adapter


import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

import com.example.jdgomes.desfrute.R
import com.example.jdgomes.desfrute.domain.Despesa

class AdapterGastos(private val despesas: List<Despesa>, private val act: Activity) : BaseAdapter() {

    override fun getCount(): Int {
        return despesas.size
    }

    override fun getItem(position: Int): Any {
        return despesas[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View, parent: ViewGroup): View {
        val view = act.layoutInflater.inflate(R.layout.lista_despesas, parent, false)
        val despesa = despesas[position]
        val nomeDespesa = view.findViewById<TextView>(R.id.coluna_nome)
        val motivoDespesa = view.findViewById<TextView>(R.id.coluna_motivo)
        val valorDespesa = view.findViewById<TextView>(R.id.coluna_valor)
        val prioridadeDespesa = view.findViewById<TextView>(R.id.coluna_prioridade)
        val btnDeleteDespesa = view.findViewById<Button>(R.id.btnDeletaDespesa)
        val btnDetalharDespesa = view.findViewById<Button>(R.id.btnDetalharDespesa)

        view.setOnLongClickListener { v ->
            Toast.makeText(act, "Clicked", Toast.LENGTH_SHORT).show()
            val alertDialog = AlertDialog.Builder(v.context).create()
            alertDialog.setTitle("Reset...")
            alertDialog.setMessage("Are you sure?")
            alertDialog.setButton("OK") { dialog, which ->
                // here you can add functions
            }
            alertDialog.setIcon(R.drawable.ic_credit_card_)
            alertDialog.show()
            true
        }

        // Click to item on list view.
        view.setOnClickListener { v ->
            //TODO: ir para o novo fragment de detalhes personlizado da despesa.

            val alertDialog = AlertDialog.Builder(v.context).create()
            alertDialog.setTitle("Despesa")
            alertDialog.setButton("OK") { dialog, which ->
                // here you can add functions
            }
            alertDialog.setIcon(R.drawable.ic_credit_card_)
            alertDialog.show()
        }

        //        // Deleta Despesa
        //        btnDeleteDespesa.setOnClickListener(new View.OnClickListener() {
        //            @Override
        //            public void onClick(View v) {
        //                act.runOnUiThread(new Runnable() {
        //                    @Override
        //                    public void run() {
        //                        db.delete(despesa);
        //                        despesas.remove(position);
        //                        Toast.makeText(act, "Despesa " + despesa.getNome() +" Excluída com Sucesso", Toast.LENGTH_SHORT).show();
        //                        notifyDataSetChanged();
        //                    }
        //                });
        //
        //            }
        //        });
        //
        //
        //        //TODO: criar uma view conforme documentação.
        //        // detalhar despesa
        //        btnDetalharDespesa.setOnClickListener(new View.OnClickListener() {
        //            @Override
        //            public void onClick(View v) {
        //                Despesa despesaSaved = db.findById(despesa.getId());
        //                Intent intent = new Intent(act, GastosActivity.class);
        //                act.startActivity(intent);
        //            }
        //        });

        return view
    }
}
