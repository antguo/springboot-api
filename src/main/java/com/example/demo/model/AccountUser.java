package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * 第三方用户类 2019-09-18
 */
public class AccountUser {
    @Id
    private Integer accountId;
    /**
     * 第三方id
     */
    @Column(name = "")
    private String accountIdentity;
    /**
     * 引用用户表User_id
     */
    private String userId;
    /**
     * 第三方用户名
     */
    private String accountName;
    /**
     * 第三方类型 0：微信，1：QQ，2：支付宝
     */
    private Integer accountType;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountIdentity() {
        return accountIdentity;
    }

    public void setAccountIdentity(String accountIdentity) {
        this.accountIdentity = accountIdentity;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }
}
