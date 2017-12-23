package com.sqm.transaction.dao.impl;

import com.sqm.transaction.dao.AccountDao;
import com.sqm.transaction.mapper.AccountRowMapper;
import com.sqm.transaction.pojo.Account;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * <p>
 *
 * @author sqm
 * @version 1.0
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    //新建一个账户
    @Override
    public void insertAccount(String aname, double balance) {
        String insert = "INSERT INTO account(aname,balance) VALUES (? ,?)";
        getJdbcTemplate().update(insert, aname, balance);
    }

    //消费账户余额
    @Override
    public void updateAccount(String aname, double balance) {
        String update = "UPDATE account SET balance = balance-? WHERE aname = ?";
        getJdbcTemplate().update(update, balance, aname);
    }

    //选择指定账户
    @Override
    public Account selectAccount(String aname) {
        String select = " SELECT * FROM account WHERE aname =?";
        Account account = getJdbcTemplate().queryForObject(select, new AccountRowMapper(), aname);
        return account;
    }
}
