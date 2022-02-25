package com.by.mapper;

import com.by.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author wangby
 * @version 0.0.1
 * @date 2020-10-08 8:35
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> selectUser() {
        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }
}
