package com.by.service;

/**
 * @author wangby
 * @version 0.0.1
 * @date 2020-10-05 23:03
 */
public class UserServiceImpl3 implements UserService {
    @Override
    public void insert() {
        System.out.println("增加了一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void update() {
        System.out.println("修改了一个用户");
    }

    @Override
    public void select() {
        System.out.println("查询了一个用户");
    }
}
