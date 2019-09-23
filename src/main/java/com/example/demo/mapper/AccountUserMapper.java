package com.example.demo.mapper;

import com.example.demo.model.AccountUser;
import com.example.demo.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 第三方用户表映射
 */
@Mapper
public interface AccountUserMapper extends MyMapper<AccountUser> {

}
