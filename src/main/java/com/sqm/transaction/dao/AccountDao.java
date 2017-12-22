package com.sqm.transaction.dao;

import com.sqm.transaction.pojo.Account;

/**
 * <p>
 *
 * @author sqm
 * @version 1.0
 */
public interface AccountDao {
    void insertAccount(String aname, double balance);

    void updateAccount(String aname, double balance);

    Account selectAccount(String aname);
}

