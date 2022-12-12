package lk.ac.mrt.cse.dbs.simpleexpensemanager;

import static lk.ac.mrt.cse.dbs.simpleexpensemanager.Constants.*;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public DatabaseHelper(@Nullable Context context) {
        super(context, "ExpenseManager.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String createTableStatement=
                "CREATE TABLE "+ACCOUNT_TABLE+"("+ACCOUNT_NO+" INTEGER PRIMARY KEY AUTOINCREMENT ,"+BANK+" TEXT PRIMARY KEY,"+HOLDER_NAME+" TEXT,"+BALANCE+" INT)";


        sqLiteDatabase.execSQL(createTableStatement);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

}
