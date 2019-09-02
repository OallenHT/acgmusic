package com.entity;

import java.sql.Timestamp;
import java.util.List;

public class User {

    private Integer uid;
    private String email;
    private String nickname;
    private String password;
    private Timestamp registerTime;
    private String describe;
    private String headImage;

    private List<BombRecord> bombRecords;

    public User() {
    }

    public User(Integer uid) {
        this.uid = uid;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User(Integer uid, String password) {
        this.uid = uid;
        this.password = password;
    }

    public User(String email, String nickname, String password) {
        this.email = email;
        this.nickname = nickname;
        this.password = password;
    }

    public User(Integer uid, String nickname, String describe) {
        this.uid = uid;
        this.nickname = nickname;
        this.describe = describe;
    }

    public User(Integer uid, String email, String nickname, String password, Timestamp registerTime, String describe, String headImage) {
        this.uid = uid;
        this.email = email;
        this.nickname = nickname;
        this.password = password;
        this.registerTime = registerTime;
        this.describe = describe;
        this.headImage = headImage;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Timestamp registerTime) {
        this.registerTime = registerTime;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public List<BombRecord> getBombRecords() {
        return bombRecords;
    }

    public void setBombRecords(List<BombRecord> bombRecords) {
        this.bombRecords = bombRecords;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", registerTime=" + registerTime +
                ", describe='" + describe + '\'' +
                ", headImage='" + headImage + '\'' +
                ", bombRecords=" + bombRecords +
                '}';
    }
}
