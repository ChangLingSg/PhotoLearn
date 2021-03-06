package com.mtech.parttimeone.photolearn.data.entity;

public class AccountEntity {
    private String userId;
    private String name;
    private String email;
    private String lastActive;

    public AccountEntity() {

    }

    public AccountEntity(String userId, String name, String email, String lastActive) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.lastActive = lastActive;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = email;
    }

    public String getLastActive() {
        return lastActive;
    }

    public void setLastActive(String lastActive) {
        this.lastActive = lastActive;
    }
}
