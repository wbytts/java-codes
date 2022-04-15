package com.by.mapper;

import com.by.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author wangby
 * @version 0.0.1
 * @date 2020-10-08 8:18
 */
public class UserMapperImpl implements UserMapper {

    // 我们的所有操作，都使用 SqlSession 来执行，在原来
    // 现在都使用 SqlSessionTemplate

    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<User> selectUser() {
        return sqlSessionTemplate.getMapper(UserMapper.class).selectUser();
    }
}
