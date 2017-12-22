package com.sqm.springdao.dao;

import com.sqm.springdao.pojo.User;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * <p>
 *
 * @author sqm
 * @version 1.0
 */
public interface UserDao {
    void insertUser(User user);

    void deleteUser(int id);

    void updateUser(User user);

    String selectUsernameById(int id);

    List<String> selectUsernamesByAge(int age);

    User selectUserById(int id);

    List<User> selectAllUsers();


    
}
