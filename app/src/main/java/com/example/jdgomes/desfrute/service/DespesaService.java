package com.example.jdgomes.desfrute.service;

import android.content.Context;
import android.util.Log;

import com.example.jdgomes.desfrute.domain.Despesa;
import com.example.jdgomes.desfrute.domain.DespesaDB;

import java.util.List;

public class DespesaService {

    private static final String TAG = "DespesaService";

    /**
     * Salva as despesas no banco de dados.
     * @param context
     * @param despesas
     */
    public static void salvarDespesa(Context context, List<Despesa> despesas) {
        DespesaDB db = new DespesaDB(context);
        try {
            for (Despesa d: despesas) {
                Log.d(TAG, "Salvando a despesa " + d.nome);
                db.save(d);
            }
        } finally {
            db.close();
        }
    }
}
