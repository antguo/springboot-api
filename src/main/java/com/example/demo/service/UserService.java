package com.example.demo.service;

import com.example.demo.model.User;

/**
 * 用户业务接口
 */
public interface UserService {
    /**
     * @Description: 根据手机号和密码查找用户信息
     */
    public User queryUserByTelAndPwd(String telephone, String password);
    /**
     * @Description: 根据手机号查找用户
     */
    public User queryUserByTel(String telephone);
    /**
     * @Description: 根据手机号和短信验证码查找用户
     */
    public User queryUserByTelAndCode(String telephone, String code);
}
