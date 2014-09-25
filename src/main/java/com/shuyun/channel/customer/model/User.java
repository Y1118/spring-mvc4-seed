package com.shuyun.channel.customer.model;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author kui.liu
 * @since 2014/09/24 下午10:51
 */

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class User {

    private String userName;

    private int age;

    private User() {

    }

    private User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public static User newInstance(String userName, int age) {
        return new User(userName, age);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}