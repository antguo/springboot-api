package com.example.demo.service;

import com.example.demo.model.News;
import com.example.demo.model.Type;

import java.util.List;

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
}
