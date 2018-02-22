package com.example.jdgomes.desfrute.domain;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DespesaDB extends SQLiteOpenHelper {

    public static final String NOME_BANCO = "desfrute.sqlite";
    private static final String TAG = "sql";
    private static final int VERSAO_BANCO = 1;

    public DespesaDB(Context context) {
        super(context, NOME_BANCO, null , VERSAO_BANCO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d(TAG, "Criando a Tabela despesa...");
        String criaTableDespesa = "create table if not exists despesa " +
                "(_id integer primary key autoincrement," +
                "data_cadastro datetime" +
                "nome text" +
                "valor double" +
                "motivo text" +
                "prioridade text" +
                "tipo text" +
                "tipoPagamento text" +
                ");";
        db.execSQL(criaTableDespesa);
        Log.d(TAG, "Tabela despesa criada com sucesso...");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Caso mude a versão do banco de dados, podemos executar um SQL aqui.
    }

    public long save(Despesa despesa) {
        return 0l;
    }
}
