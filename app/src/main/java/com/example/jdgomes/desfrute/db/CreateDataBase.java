package com.example.jdgomes.desfrute.db;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class CreateDataBase extends SQLiteOpenHelper {

    public static final String NOME_BANCO = "desfrute.sqlite";
    private static final String TAG = "sql";
    private static final int VERSAO_BANCO = 3;

    public CreateDataBase(Context context) {
        super(context, NOME_BANCO, null , VERSAO_BANCO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ConstantesDB.createTableDespesa);
        db.execSQL(ConstantesDB.createTableIntesDespesa);

        //TODO: executar o sql e alterar a estrutura da tabela despesa para gerar
        // colocar a coluna estrangeira de itens da despesa.
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(ConstantesDB.dropTableDespesa);
        onCreate(db);
    }
}
