package lk.ac.mrt.cse.dbs.simpleexpensemanager.control;

import android.content.Context;

import lk.ac.mrt.cse.dbs.simpleexpensemanager.control.ExpenseManager;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.AccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.TransactionDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.DBAccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.InMemoryAccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.InMemoryTransactionDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.model.Account;

public class DBExpenseManager extends ExpenseManager{
        Context contex;
        public DBExpenseManager(Context contex) {
            this.contex=contex;
            setup();
        }

        @Override
        public void setup() {
            /*** Begin generating dummy data for In-Memory implementation ***/

            TransactionDAO inMemoryTransactionDAO = new InMemoryTransactionDAO();
            setTransactionsDAO(inMemoryTransactionDAO);

            AccountDAO inMemoryAccountDAO = new InMemoryAccountDAO();
            setAccountsDAO(inMemoryAccountDAO);

            AccountDAO dbAccountDAO = new DBAccountDAO(contex);

            // dummy data
            Account dummyAcct1 = new Account("12345A", "Yoda Bank", "Anakin Skywalker", 10000.0);
            Account dummyAcct2 = new Account("78945Z", "Clone BC", "Obi-Wan Kenobi", 80000.0);
            getAccountsDAO().addAccount(dummyAcct1);
            getAccountsDAO().addAccount(dummyAcct2);

            /*** End ***/
        }

}
