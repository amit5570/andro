package sycs.com.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by Student on 11-02-2020.
 */

public class DBHandler extends SQLiteOpenHelper {
    public DBHandler(Context c){
        super(c,"SYCS Datatbase.db",null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String qry="CREATE TABLE DETAILS(ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,MOBILE TEXT)";
        db.execSQL(qry);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public long saveDetails(String name,String contact){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues val=new ContentValues();
        val.put("NAME",name);
        val.put("MOBILE",contact);
        long res=db.insert("DETAILS",null,val);
        return res;

    }
    public Cursor getDetails(){
        SQLiteDatabase db=this.getReadableDatabase();

        String qry="Select * from DETAIILS";

    }
}
