package com.stackroute.model;

public class User {

    private String userName;
    private String userPassword;

    public User(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName=" + userName +
                ", userPassword=" + userPassword +
                '}';
    }
}