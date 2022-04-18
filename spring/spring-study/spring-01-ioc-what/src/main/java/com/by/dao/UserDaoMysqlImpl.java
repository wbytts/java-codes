package com.by.dao;

import com.by.dao.UserDao;

/**
 * @author wangby
 */
public class UserDaoMysqlImpl implements UserDao {
    public void getUser() {
        System.out.println("MySQL 获取数据");
    }
}