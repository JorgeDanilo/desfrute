package com.example.jdgomes.desfrute.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.jdgomes.desfrute.domain.Despesa;

import java.util.ArrayList;
import java.util.List;

public class DespesaDB {

    private SQLiteDatabase db;
    private CreateDataBase banco;
    private static final String TAG = "DespesaDB";


    /**
     * Salva uma nova despesa, ou atualiza se já existir.
     * @param despesa
     * @return
     */
    public long save(Despesa despesa) {
        long id = despesa.getId();
        SQLiteDatabase db = banco.getWritableDatabase();
        try {
            ContentValues values = new ContentValues();
            values.put("nome", despesa.getNome());
            values.put("valor", despesa.getValor());
            values.put("motivo", despesa.getMotivo());
            values.put("prioridade", despesa.getPrioridade());
            values.put("tipoDespesa", despesa.getTipo());
            values.put("tipoPagamento", despesa.getTipoPagamento());
            if(id != 0) {
                String _id = String.valueOf(despesa.getId());
                String[] whereArgs = {_id};
                int count = db.update("despesa", values, "_id=?", whereArgs);
                return count;
            } else {
                id = db.insert("despesa", "", values);
                return id;
            }
        } finally {
            db.close();
        }
    }

    /**
     * find all despesas
     * @return
     */
    public List<Despesa> findAll() {
        SQLiteDatabase db = banco.getWritableDatabase();
        try{
            Cursor c = db.query("despesa", null, null, null, null, null, null);
            return toList(c);
        }finally {
            db.close();
        }
    }

    /**
     * convert to list.
     * @param c
     * @return
     */
    private List<Despesa> toList(Cursor c) {
        List<Despesa> despesas = new ArrayList<Despesa>();
        if (c.moveToFirst()) {
            do {
                Despesa despesa = new Despesa();
                despesas.add(despesa);
                despesa.setId(c.getLong(c.getColumnIndex("_id")));
                despesa.setNome(c.getString(c.getColumnIndex("nome")));
                despesa.setValor(c.getDouble(c.getColumnIndex("valor")));
                despesa.setMotivo(c.getString(c.getColumnIndex("motivo")));
                despesa.setPrioridade(c.getString(c.getColumnIndex("prioridade")));
                despesa.setTipo(c.getString(c.getColumnIndex("tipoDespesa")));
                despesa.setTipoPagamento(c.getString(c.getColumnIndex("tipoPagamento")));
            } while (c.moveToNext());
        }
        return despesas;
    }

    /**
     * Find despesas by id.
     * @param id
     * @return
     */
    public Despesa findById(Long id) {
        SQLiteDatabase db = banco.getWritableDatabase();
        try {
            Cursor c = db.query("despesa", null, "_id=?", new String[]{String.valueOf(id)}, null, null, null);
            List<Despesa> despesas = toList(c);
            return despesas.isEmpty() ? null : despesas.get(0);
        } finally {
            db.close();
        }
    }

    /**
     * Deleta despesa.
     * @param despesa
     * @return
     */
    public int delete(Despesa despesa) {
        SQLiteDatabase db = banco.getWritableDatabase();
        try {
            int count = db.delete("despesa", "_id=?", new String[]{String.valueOf(despesa.getId())});
            Log.i(TAG, "Deletou [" + count + "] registro.");
            return count;
        } finally {
            db.close();
        }
    }

}
