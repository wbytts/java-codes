package com.by.service;

import com.by.dao.UserDao;
import com.by.dao.UserDaoImpl;
import com.by.dao.UserDaoMysqlImpl;

/**
 * @author wangby
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    /**
     * 利用 set 方法实现动态值的注入
     * 使用了 set 注入后，程序不再具有了主动性，而是变成了被动地接收对象
     * 这种思想从本质上解决了问题，我们程序员不用再去管理对象的创建了，系统的耦合性大大降低，可以更加专注于业务的实现
     * 这个就是 IoC 的原型
     * @param userDao
     */
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }

}
