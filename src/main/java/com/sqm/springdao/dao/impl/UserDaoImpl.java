package com.sqm.springdao.dao.impl;

import com.mchange.v2.async.StrandedTaskReporting;
import com.sqm.springdao.dao.UserDao;
import com.sqm.springdao.mapper.UserRowMapper;
import com.sqm.springdao.pojo.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import javax.print.attribute.standard.RequestingUserName;
import java.util.List;

/**
 * <p>
 *
 * @author sqm
 * @version 1.0
 */
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {
    
    public void insertUser(User user) {
        String insert = "INSERT INTO user(username,age) VALUES (? ,?)";
        this.getJdbcTemplate().update(insert,user.getUsername(),user.getAge());
    }

    public void deleteUser(int id) {
        String delete = "DELETE FROM user WHERE id = ?";
        this.getJdbcTemplate().update(delete, id);
    }

    public void updateUser(User user) {
        String update = "UPDATE user SET username=?,age=? WHERE id = ?";
        this.getJdbcTemplate().update(update,user.getUsername(),user.getAge(),user.getId());
    }

    public String selectUsernameById(int id) {
        String select = "SELECT username FROM user WHERE id = ?";
        String username = getJdbcTemplate().queryForObject(select, String.class, id);
        return username;
    }

    public List<String> selectUsernamesByAge(int age) {
        String select = "SELECT username FROM user WHERE age = ?";
        List<String> usernames = getJdbcTemplate().queryForList(select, String.class, age);
        return usernames;
    }

    public User selectUserById(int id) {
        String select = "SELECT * FROM user WHERE id = ?";
        User user = getJdbcTemplate().queryForObject(select, new UserRowMapper(), id);
        return user;
    }

    public List<User> selectAllUsers() {
        String select = "SELECT * FROM user";
        List<User> users = getJdbcTemplate().query(select, new UserRowMapper());
        return users;
    }
}
