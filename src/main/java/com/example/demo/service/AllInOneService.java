package com.example.demo.service;

import com.example.demo.model.News;
import com.example.demo.model.Type;
import com.example.demo.model.User;

import java.util.List;

/**
 * 业务接口 2019-09-17
 */
public interface AllInOneService {
    /**
     * @Description: 查询所有的新闻分类名称，以列表list形式返回
     */
    public List<Type> queryAllType();
    /**
     * @Description: 根据分类查询该新闻下的所有新闻列表
     */
    public List<News> queryAllNewsByTypeId(String typeId);
    /**
     * @Description: 根据新闻主键查询新闻的详情
     */
    public News queryNewsDetail(String newsId);
    /**
     * 用户模块start
     */
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
    /**
     * 用户模块end
     */
}
