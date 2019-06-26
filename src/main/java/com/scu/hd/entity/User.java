package com.scu.hd.entity;

/**
 * @author hyy
 * @date 2019/6/26 17:45
 */
public class User {
    private String userId;
    private String userPassword;
    private String userRole;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public User(String userId, String userPassword, String userRole) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.userRole = userRole;
    }

    public User() {
    }


    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userRole='" + userRole + '\'' +
                '}';
    }
}

