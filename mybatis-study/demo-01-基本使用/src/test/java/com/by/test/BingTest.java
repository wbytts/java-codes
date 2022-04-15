package com.by.test;

import com.by.mapper.UserDao;
import com.by.pojo.User;
import com.by.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BingTest {

    /**
     * 测试 SqlSession 的获取，以及简单查询的执行
     */
    @Test
    public void testSelectAll() {

        // 获得 SqlSession 对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 获取 Mapper
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        // 调用接口的方法
        List<User> userList = userMapper.getUserList();

        for(User u : userList) {
            System.out.println(u);
        }

        System.out.println("--------------------------------------------------------");
         // 另一种方式
        List<User> users = sqlSession.selectList("com.com.com.by.dao.UserDao.getUserList");

        for(User u : users) {
            System.out.println(u);
        }

        sqlSession.close();
    }

    /**
     * 测试按id查询用户的接口
     */
    @Test
    public void testSelectUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        User user = userMapper.getUserById(2L);
        System.out.println(user);

        sqlSession.close();
    }

    /**
     * 测试添加用户
     */
    @Test
    public void testInsertUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);

        User user = new User();
        user.setId(12345);
        user.setName("test_insert");
        user.setPwd("qweqweqwe");

        userMapper.addUser(user);

        // 增删改需要提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 测试修改用户
     */
    @Test
    public void testUpdateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);

        User user = userMapper.getUserById(2L);
        user.setName("#####");
        userMapper.updateUser(user);

        // 增删改需要提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 测试删除用户
     */
    @Test
    public void testDeleteUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);

        userMapper.deleteUser(2L);

        // 增删改需要提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testAddUserMap() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);

        Map<String, Object> map = new HashMap<>();
        map.put("id", "333");
        map.put("name", "qweqweqweasdaczxcfsafdadsas");
        map.put("pwd", "XXXXXXX");

        userMapper.addUserMap(map);

        // 增删改需要提交事务
        sqlSession.commit();
        sqlSession.close();
    }
}
