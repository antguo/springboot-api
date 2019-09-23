package com.example.demo.mapper;

import com.example.demo.model.User;
import com.example.demo.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户列表
 */
@Mapper
public interface UserMapper extends MyMapper<User> {

}
