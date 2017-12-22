package com.sqm.springdao.service;

import com.sqm.springdao.pojo.User;

import java.util.List;

/**
 * <p>
 *
 * @author sqm
 * @version 1.0
 */
public interface UserService {
    void addUser(User user);

    void removeUser(int id);

    void moodifyUser(User user);

    String findUsernameById(int id);

    List<String> findUsernamesById(int id);

    User findUserById(int id);

    List<User> findAllUsers();
}
