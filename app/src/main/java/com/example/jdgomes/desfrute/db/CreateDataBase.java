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

        Log.d(TAG, "Criando a Tabela despesa...");
        String criaTableDespesa = "create table despesa " +
                "(_id integer primary key autoincrement," +
                "nome text," +
                "valor double," +
                "motivo text," +
                "prioridade text," +
                "tipoDespesa text," +
                "tipoPagamento text" +
                ");";

        String criaTableItensDespesa = "create table itens_despesa " +
                "(_id integer primary key autoincrement, " +
                "nome text, " +
                "descricao text, " +
                "valor double, " +
                "situacaoDespesa text" +
                ");";

        db.execSQL(criaTableDespesa);

        //TODO: executar o sql e alterar a estrutura da tabela despesa para gerar
        // colocar a coluna estrangeira de itens da despesa.

        Log.d(TAG, "Tabela despesa criada com sucesso...");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String dropTable = "DROP TABLE IF EXISTS despesa";
        db.execSQL(dropTable);
        Log.d(TAG, "Table deleted");
        onCreate(db);
    }
}
