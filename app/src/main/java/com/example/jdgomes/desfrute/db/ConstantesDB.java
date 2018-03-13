package com.example.jdgomes.desfrute.db;


public class ConstantesDB {

    static String createTableDespesa = "create table despesa " +
            "(_id integer primary key autoincrement," +
            "nome text," +
            "valor double," +
            "motivo text," +
            "prioridade text," +
            "tipoDespesa text," +
            "tipoPagamento text" +
            ");";

    static String createTableIntesDespesa = "create table itens_despesa " +
            "(_id integer primary key autoincrement, " +
            "nome text, " +
            "descricao text, " +
            "valor double, " +
            "situacaoDespesa text" +
            ");";

    static String dropTableDespesa = "DROP TABLE IF EXISTS despesa";

}
