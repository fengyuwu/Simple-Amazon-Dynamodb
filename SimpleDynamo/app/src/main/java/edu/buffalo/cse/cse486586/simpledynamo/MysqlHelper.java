package edu.buffalo.cse.cse486586.simpledynamo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by fengyuwu on 2/8/18.
 *  * Welcome to Litte Feng chat room
 * Version 1
 * source: https://developer.android.com/training/data-storage/sqlite.html#java
 *         https://developer.android.com/guide/topics/data/data-storage.html#db
 *         https://developer.android.com/guide/topics/providers/content-provider-basics.html
 *         https://developer.android.com/guide/topics/providers/content-provider-creating.html#Insert
 *         https://developer.android.com/reference/android/content/ContentUris.html#withAppendedId(android.net.Uri, long)
 *         https://developer.android.com/reference/android/database/sqlite/SQLiteDatabase.html#insertWithOnConflict(java.lang.String, java.lang.String, android.content.ContentValues, int)
 *         https://developer.android.com/reference/android/database/sqlite/SQLiteOpenHelper.html
 *         https://developer.android.com/reference/android/util///Log.html
 *         https://developer.android.com/guide/topics/data/data-storage.html#db
 *         https://developer.android.com/training/data-storage/sqlite.html#java
 *         https://developer.android.com/reference/android/database/sqlite/SQLiteDatabase.html
 *         https://developer.android.com/reference/android/database/sqlite/SQLiteDatabase.html#CONFLICT_REPLACE
 *         https://developer.android.com/reference/android/database/sqlite/SQLiteOpenHelper.html#onCreate(android.database.sqlite.SQLiteDatabase)
 *         https://developer.android.com/studio/debug/am-logcat.html#format
 *
 *
 *
 * This is a helper class to manage database creation and version management.
 * It has 2 synchronized methods, getWritableDatabase() and getReadableDatabase().
 * I think they can make my database operations thread safe which is important. Since I have 5 AVD
 * and doing database operation. Also this is a good practice because it
 * makes creation and upgrading database and version management easier if this ever come up in the
 * features.
 *
 * @author fengyuwu
 *
 */


public class MysqlHelper extends SQLiteOpenHelper {
    //These are mySQL statement to create the sqlite database.
    //Set first column as Primary key, this will make it unique,
    //later, the insert method can check for uniqueness and update the key when there is conflict
    //violation.







    MysqlHelper(Context context) {
        //construction begin.
        //https://developer.android.com/reference/android/database/sqlite/SQLiteOpenHelper.html
        super(context, "my_database", null, 6);
        //Log.i("class helper?", "Construction finished" + "F.W.");


    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        //Called when the database is created for the first time.
        //This is where the creation of tables and the initial population of the tables should happen.

        //initial population of the tables.It execute the SQL statement,
        //and create the tables based on my parameter.
        db.execSQL("CREATE TABLE " + "my_table" + " (" +
                "key" + " TEXT PRIMARY KEY," +
                "value" + " TEXT)");
        //Log.i("class helper?", "Initializing Tables!!!" + "F.W.");
//        System.out.print(" onCreate called!");

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Updated Database!!!
//        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
        //Log.i("class helper?", "Updated Database!!!" + "F.W.");
//        System.out.print(" onUpgrade called!");


    }
    @Override
    public void onDowngrade (SQLiteDatabase db, int oldVersion, int newVersion) {

        //This callback method is not required by the Android. It is used to downgrade the database.
        //keep here for now, if the later PA need to use this.
        //Not a abstract method.

        //Log.i("class helper?", "The database has been Downgrade !!!" + "F.W.");

        //Log.wtf("class helper?", "The should not happen, if so ,crush the app" + "F.W.");
//        System.out.print("What a terrible failure! debug onDowngrade in MysqlHelper");
//        System.exit(-1);

    }

    @Override
    public void onOpen (SQLiteDatabase db){
        //called when the database has been opened.

        //Log.i("class helper?", "The database has been opened !!! as expected" + "F.W.");
//        System.out.print("check point here.");

    }


//stable feb 16


}
