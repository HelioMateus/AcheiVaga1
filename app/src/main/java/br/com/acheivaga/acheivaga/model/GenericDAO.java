package br.com.acheivaga.acheivaga.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.List;

/**
 * Created by Helio on 19/05/2017.
 */

public abstract class GenericDAO <T>{


    public abstract boolean salvar(T t);
    public abstract List<T> listar();

}
