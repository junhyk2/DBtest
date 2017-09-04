package com.example.twinny32_ljh.sqliteapp;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Twinny32_LJH on 2017-08-25.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static  final  String DATABASE_NAME = "Student.db";
    public static  final  String TABLE_NAME = "student_table";
    public static  final  String COL_1 = "ID";
    public static  final  String COL_2= "NAME";
    public static  final  String COL_3 = "SURNAME";
    public static  final  String COL_4 = "MARKS";



    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE table " +TABLE_NAME+" ("+COL_1+" INTEGER PRIMARY KEY AUTOINCREMENT,"
                +COL_2+" TEXT,"+COL_3+" SURNAME TEXT,"+COL_4+"INTEGER);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLA IF EXISTS"+TABLE_NAME);
        onCreate(db);


    }
}
