package com.entity;

/**
 * @author chenlihao
 * @create 2020-12-07 17:04
 */
public class User {
    private String username;//这是陈立豪添加的username
    private String password;//这是陈立豪第二次添加的password
    private int id;     //这是傅宇航第一次添加id
    private String username2;//这是陈立豪第二次更新

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
