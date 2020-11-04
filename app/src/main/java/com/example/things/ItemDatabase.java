package com.example.things;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.ArrayMap;

public class ItemDatabase extends SQLiteOpenHelper {

    static final private String DB_NAME = "TODO_LIST";
    static final private String DB_TABLE = "ITEM";
    static final private int DB_VER = 0;

    Context ctx;
    SQLiteDatabase idb;
    public ItemDatabase(Context ct)
    {
        super(ct,DB_NAME,null,DB_VER);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+DB_TABLE+"(_id integer primary key autoincrement, title, content)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists "+DB_TABLE);
        onCreate(db);
    }

    public void Insert(String title, String content)
    {
        idb = getWritableDatabase();
        idb.execSQL("insert into "+DB_TABLE+" (title, content) values('"+title+"','"+content+"')");
    }

    public ArrayMap<String,String> getAll(Context ctx)
    {
        idb = getReadableDatabase();
        Cursor cur = idb.rawQuery("Select * from "+DB_TABLE,null);
        String title="", content="";
        while(cur.moveToNext())
        {
            title = cur.getString(1);
            content = cur.getString(2);
        }
        return
    }
}
