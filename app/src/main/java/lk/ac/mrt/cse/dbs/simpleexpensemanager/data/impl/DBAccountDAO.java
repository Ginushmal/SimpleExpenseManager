package lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl;

import static lk.ac.mrt.cse.dbs.simpleexpensemanager.Constants.*;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.Nullable;

import java.util.List;

import lk.ac.mrt.cse.dbs.simpleexpensemanager.DatabaseHelper;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.AccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.exception.InvalidAccountException;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.model.Account;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.model.ExpenseType;

public class DBAccountDAO extends DatabaseHelper implements AccountDAO {
    public DBAccountDAO(Context contex) {
        super(contex);
    }

    @Override
    public List<String> getAccountNumbersList() {
        return null;
    }

    @Override
    public List<Account> getAccountsList() {
        return null;
    }

    @Override
    public Account getAccount(String accountNo) throws InvalidAccountException {
        return null;
    }

    @Override
    public void addAccount(Account account) {
        SQLiteDatabase db =this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(ACCOUNT_NO,account.getAccountNo());
        cv.put(BANK,account.getBankName());
        cv.put(HOLDER_NAME,account.getAccountHolderName());
        cv.put(BALANCE,account.getBalance());

        db.insert(ACCOUNT_TABLE,null,cv);

        db.close();
    }

    @Override
    public void removeAccount(String accountNo) throws InvalidAccountException {

    }

    @Override
    public void updateBalance(String accountNo, ExpenseType expenseType, double amount) throws InvalidAccountException {

    }
}
