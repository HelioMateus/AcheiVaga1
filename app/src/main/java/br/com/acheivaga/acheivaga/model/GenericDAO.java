package br.com.acheivaga.acheivaga.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.List;

/**
 * Created by Helio on 19/05/2017.
 */

public abstract class GenericDAO <T> extends SQLiteOpenHelper{
    private static final String NOME_BANCO="achei_vaga";
    private static final int VERSAO_BANCO=1;

    public GenericDAO(Context context) {
        super(context, NOME_BANCO,null,VERSAO_BANCO);
    }



    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public abstract boolean salvar(T t);
    public abstract List<T> listar();
    public abstract boolean deletar(int id);
}
