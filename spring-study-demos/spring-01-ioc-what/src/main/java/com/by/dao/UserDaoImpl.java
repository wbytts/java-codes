package com.by.dao;

import com.by.dao.UserDao;

/**
 * @author wangby
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("获取数据");
    }
}
