package com.example.androidspringclientt.model;

public class User {
    private Integer userIdxId;
    private String userEmail;
    private String userPassword;
    private String userName;

    public Integer getUserIdxId() {
        return userIdxId;
    }

    public void setUserIdxId(Integer userIdxId) {
        this.userIdxId = userIdxId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User(Integer userIdxId, String userEmail, String userPassword, String userName) {
        this.userIdxId = userIdxId;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userName = userName;
    }

    public void setBranch(String branch) {
        this.setBranch(branch);
    }

    public void setLocation(String location) {
        this.setLocation(location);
    }
}
