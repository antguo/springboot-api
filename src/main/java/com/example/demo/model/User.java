package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class User {
    @Id
    private Integer userId;
    /**
     * 用户id
     */
    @Column(name = "user_identity")
    private String userIdentity;
    /**
     * 用户类型
     */
    @Column(name = "type")
    private Integer type;
    /**
     * 用户昵称
     */
    @Column(name = "user_name")
    private String userName;
    /**
     * 登录密码
     */
    @Column(name = "user_password")
    private String userPassword;
    /**
     * 用户手机号码
     */
    private String userTelephone;
    /**
     * 用户头像，存路径
     */
    private String userImg;
    /**
     * 用户性别
     */
    private Integer userSex;
    /**
     * 用户出生日
     */
    private Date userBirth;
    /**
     * 短信验证码
     */
    private String verificationCode;

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserIdentity() {
        return userIdentity;
    }

    public void setUserIdentity(String userIdentity) {
        this.userIdentity = userIdentity;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserTelephone() {
        return userTelephone;
    }

    public void setUserTelephone(String userTelephone) {
        this.userTelephone = userTelephone;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public Date getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(Date userBirth) {
        this.userBirth = userBirth;
    }
}
