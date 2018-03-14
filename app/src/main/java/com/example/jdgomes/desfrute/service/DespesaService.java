package com.example.jdgomes.desfrute.service;

import android.content.Context;
import android.util.Log;

import com.example.jdgomes.desfrute.db.CreateDataBase;
import com.example.jdgomes.desfrute.domain.Despesa;
import com.example.jdgomes.desfrute.db.DespesaDB;

import java.util.List;

public class DespesaService {

    private static final String TAG = "DespesaService";

    CreateDataBase banco;

    public DespesaService(Context context) {
        banco = new CreateDataBase(context);
    }

    /**
     * Salva as despesas no banco de dados.
     * @param context
     * @param despesas
     */
    public static void salvarDespesa(Context context, List<Despesa> despesas) {

    }
}
