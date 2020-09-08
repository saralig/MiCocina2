package Controller;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import static android.content.Context.MODE_PRIVATE;

public class Usuario {


    String sql="CREATE TABLE Usuario(Nombre text, correo TEXT, contraseña TEXT)";

    public Usuario( String nombre, String correo, String clave) {
        //super(nombre, correo ,clave);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sql);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Usuario");
        db.execSQL(sql);



    }
}
