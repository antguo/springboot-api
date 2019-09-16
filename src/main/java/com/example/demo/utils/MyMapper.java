package com.example.demo.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 继承自己的MyMapper
 *
 * @param <T>
 * @author guowj
 * @since 2019-09-10 16:03
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
    // TODO
    // FIXME 特别注意，该接口不能被扫描到，否则会出错
}
