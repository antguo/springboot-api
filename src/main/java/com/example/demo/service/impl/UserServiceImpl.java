package com.example.demo.service.impl;

import com.example.demo.mapper.AccountUserMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

/**
 * 用户业务接口实现类 2019-09-18
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private AccountUserMapper accountUserMapper;

    /**
     * 根据手机号和密码查找用户
     * @param telephone
     * @param password
     * @return
     */
    @Override
    public User queryUserByTelAndPwd(String telephone, String password) {
        Example example = new Example(User.class);
        Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userTelephone",telephone);
        criteria.andEqualTo("userPassword",password);
        User user = userMapper.selectOneByExample(example);
        return user;
    }

    /**
     * 根据手机号查找用户
     * @param telephone
     * @return
     */
    @Override
    public User queryUserByTel(String telephone) {
        Example example = new Example(User.class);
        Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userTelephone",telephone);
        User user = userMapper.selectOneByExample(example);
        return user;
    }

    /**
     * 根据手机号和验证码查找用户
     * @param telephone
     * @param code
     * @return
     */
    @Override
    public User queryUserByTelAndCode(String telephone, String code) {
        Example example = new Example(User.class);
        Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userTelephone",telephone);
        criteria.andEqualTo("verificationCode", code);
        User user = userMapper.selectOneByExample(example);
        return user;
    }
}
