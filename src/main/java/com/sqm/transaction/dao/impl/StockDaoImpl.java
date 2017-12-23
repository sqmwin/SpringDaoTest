package com.sqm.transaction.dao.impl;

import com.sqm.transaction.dao.StockDao;
import com.sqm.transaction.mapper.StockRowMapper;
import com.sqm.transaction.pojo.Stock;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * <p>
 *
 * @author sqm
 * @version 1.0
 */
public class StockDaoImpl extends JdbcDaoSupport implements StockDao {
    @Override
    public void insertStock(String sname, int count) {
        String insert = "INSERT INTO stock(sname,count) VALUES(?,?)";
        getJdbcTemplate().update(insert, sname, count);
    }

    //买入的股票
    @Override
    public void updateStock(String sname, int count) {
        String update = "UPDATE stock SET count=count + ? WHERE sname=?";
        getJdbcTemplate().update(update, count, sname);
    }
    @Override
    public Stock selectStock(String sname) {
        String select = "SELECT * FROM stock WHERE sname = ?";
        Stock stock = getJdbcTemplate().queryForObject(select, new StockRowMapper(), sname);
        return stock;
    }
}
