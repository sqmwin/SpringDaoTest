package com.sqm.springdao.pojo;

/**
 * <p>
 *
 * @author sqm
 * @version 1.0
 */
public class User {
    private Integer id;
    private String username;
    private int age;
    //Contructor
    //getter and setter
    //toString()

    public User() {
    }

    public User(Integer id, String username, int age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
