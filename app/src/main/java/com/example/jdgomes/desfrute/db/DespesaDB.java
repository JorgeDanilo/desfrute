package com.example.jdgomes.desfrute.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.jdgomes.desfrute.domain.Despesa;

import java.util.ArrayList;
import java.util.List;

public class DespesaDB {

    private SQLiteDatabase db;
    private CreateDataBase banco;
    private static final String TAG = "DespesaDB";

    public DespesaDB(Context context) {
        banco = new CreateDataBase(context);
    }


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
