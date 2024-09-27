package com.example.androidspringclientt.model;

public class User {
    private int userIdxId;
    private String userName;
    private String location;
    private String branch;

    public int getUserIdxId() {
        return userIdxId;
    }

    public void setId(int userIdxId) {
        this.userIdxId = userIdxId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "User {" +
                "userIdxId=" + userIdxId +
                ", userName='" + userName + '\'' +
                ", location='" + location + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
