package com.sqm.transaction.service.impl;

import com.sqm.transaction.dao.AccountDao;
import com.sqm.transaction.dao.StockDao;
import com.sqm.transaction.exception.StockException;
import com.sqm.transaction.pojo.Account;
import com.sqm.transaction.pojo.Stock;
import com.sqm.transaction.service.StockProcessService;

/**
 * <p>
 *
 * @author sqm
 * @version 1.0
 */
public class StockProcessServiceImpl implements StockProcessService {
    private AccountDao accountDao;
    private StockDao stockDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setStockDao(StockDao stockDao) {
        this.stockDao = stockDao;
    }

    public void openAccount(String aname, double money) {
        accountDao.insertAccount(aname, money);
    }

    public void openStock(String sname, int count) {
        stockDao.insertStock(sname, count);
    }

    public void buyStock(String aname, String sname, double money, int amount) throws StockException {
        accountDao.updateAccount(aname, money);
        if (1 == 1) {
            throw new StockException();
        }
        stockDao.updateStock(sname,amount);
    }

    public Account findAccount(String aname) {
        return accountDao.selectAccount(aname);
    }

    public Stock findStock(String sname) {
        return stockDao.selectStock(sname);
    }
}
