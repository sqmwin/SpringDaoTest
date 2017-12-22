package com.sqm.transaction.service;

import com.sqm.transaction.exception.StockException;
import com.sqm.transaction.pojo.Account;
import com.sqm.transaction.pojo.Stock;

/**
 * <p>
 *  股票进程业务接口
 * @author sqm
 * @version 1.0
 */
public interface StockProcessService {
    void openAccount(String aname, double money);

    void openStock(String sname, int count);

    //aname银行账户花money原购买sname的股票amount股;抛出异常
    void buyStock(String aname, String sname, double money, int amount) throws StockException;

    Account findAccount(String aname);

    Stock findStock(String sname);
}
