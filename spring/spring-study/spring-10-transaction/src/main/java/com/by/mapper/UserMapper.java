package com.by.mapper;

import com.by.pojo.User;

import java.util.List;

/**
 * @author wangby
 * @version 0.0.1
 * @date 2020-10-08 7:11
 */
public interface UserMapper {
    public List<User> selectUser();
}
