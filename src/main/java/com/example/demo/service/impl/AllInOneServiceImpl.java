package com.example.demo.service.impl;

import com.example.demo.mapper.NewsMapper;
import com.example.demo.mapper.TypeMapper;
import com.example.demo.model.News;
import com.example.demo.model.Type;
import com.example.demo.model.User;
import com.example.demo.service.AllInOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

import java.util.List;

/**
 * 接口实现类
 */
@Service
public class AllInOneServiceImpl implements AllInOneService {

    @Autowired
    private TypeMapper typeMapper;
    @Autowired
    private NewsMapper newsMapper;

    @Override
    public List<Type> queryAllType() {
        return typeMapper.selectAll();
    }

    @Override
    public List<News> queryAllNewsByTypeId(String typeId) {
        Example example = new Example(News.class);
        Criteria criteria = example.createCriteria();// 创建条件查询
        criteria.andEqualTo("typeId", typeId);
        List<News> newsList = newsMapper.selectByExample(example);
        return newsList;
    }

    @Override
    public News queryNewsDetail(String newsId) {
        return newsMapper.selectByPrimaryKey(newsId);
    }

    /**
     * 用户模块start
     */
    /**
     * 根据电话和密码查找用户
     * @param telephone
     * @param password
     * @return
     */
    @Override
    public User queryUserByTelAndPwd(String telephone, String password) {
        return null;
    }

    /**
     * 根据电话查找用户
     * @param telephone
     * @return
     */
    @Override
    public User queryUserByTel(String telephone) {
        return null;
    }

    @Override
    public User queryUserByTelAndCode(String telephone, String code) {
        return null;
    }

    /**
     * 用户模块end
     */
}
