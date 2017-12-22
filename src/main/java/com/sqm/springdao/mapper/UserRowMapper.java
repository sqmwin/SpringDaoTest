package com.sqm.springdao.mapper;

import com.sqm.springdao.pojo.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * <p>
 *
 * @author sqm
 * @version 1.0
 */
public class UserRowMapper implements RowMapper<User> {
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setUsername(resultSet.getString("username"));
        user.setAge(resultSet.getInt("age"));
        return user;
    }
}
