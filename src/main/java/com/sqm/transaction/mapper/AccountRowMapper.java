package com.sqm.transaction.mapper;

import com.sqm.transaction.pojo.Account;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * <p>
 *
 * @author sqm
 * @version 1.0
 */
public class AccountRowMapper implements RowMapper<Account> {
    public Account mapRow(ResultSet resultSet, int i) throws SQLException {
        Account account = new Account();
        account.setAid(resultSet.getInt("aid"));
        account.setAname(resultSet.getString("aname"));
        account.setBalance(resultSet.getDouble("balance"));
        return account;
    }
}
