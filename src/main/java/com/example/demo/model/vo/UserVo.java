package com.example.demo.model.vo;

import io.swagger.annotations.ApiModelProperty;

/**
 * 根据手机号和密码获取用户信息接口的VO类
 */
public class UserVo {
    @ApiModelProperty("用户手机号")
    private String userTelephone;
    @ApiModelProperty("用户密码")
    private String userPassword;

    public String getUserTelephone() {
        return userTelephone;
    }

    public void setUserTelephone(String userTelephone) {
        this.userTelephone = userTelephone;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
