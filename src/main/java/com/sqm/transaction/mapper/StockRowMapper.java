package com.sqm.transaction.mapper;

import com.sqm.transaction.pojo.Stock;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * <p>
 *
 * @author sqm
 * @version 1.0
 */
public class StockRowMapper implements RowMapper<Stock> {
    public Stock mapRow(ResultSet resultSet, int i) throws SQLException {
        Stock stock = new Stock();
        stock.setSid(resultSet.getInt("sid"));
        stock.setSname(resultSet.getString("sname"));
        stock.setCount(resultSet.getInt("count"));
        return stock;
    }
}
