package com.example.jdgomes.desfrute.utils

import android.content.Context
import android.content.SharedPreferences

object Prefs {

    val PREF_ID = "desfrute"

    fun setBoolean(context: Context, chave: String, on: Boolean) {
        val pref = context.getSharedPreferences(PREF_ID, 0)
        val editor = pref.edit()
        editor.putBoolean(chave, on)
        editor.commit()
    }

    fun getBoolean(context: Context, chave: String): Boolean {
        val pref = context.getSharedPreferences(PREF_ID, 0)
        return pref.getBoolean(chave, true)
    }

    fun setInteger(context: Context, chave: String, valor: Int) {
        val pref = context.getSharedPreferences(PREF_ID, 0)
        val editor = pref.edit()
        editor.putInt(chave, valor)
        editor.commit()
    }

    fun getInteger(context: Context, chave: String): Int {
        val pref = context.getSharedPreferences(PREF_ID, 0)
        return pref.getInt(chave, 0)
    }

    fun setString(context: Context, chave: String, valor: String) {
        val pref = context.getSharedPreferences(PREF_ID, 0)
        val editor = pref.edit()
        editor.putString(chave, valor)
        editor.commit()
    }

    fun getString(context: Context, chave: String): String {
        val pref = context.getSharedPreferences(PREF_ID, 0)
        return pref.getString(chave, "")
    }
}
