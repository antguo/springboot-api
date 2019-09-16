package com.example.demo.mapper;

import com.example.demo.model.News;
import com.example.demo.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NewsMapper extends MyMapper<News> {
}
