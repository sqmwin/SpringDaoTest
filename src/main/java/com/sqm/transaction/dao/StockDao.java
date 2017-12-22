package com.sqm.transaction.dao;

import com.sqm.transaction.pojo.Stock;

/**
 * <p>
 *
 * @author sqm
 * @version 1.0
 */
public interface StockDao {
    void insertStock(String sname, int count);

    void updateStock(String sname, int count);

    Stock selectStock(String sname);
}
