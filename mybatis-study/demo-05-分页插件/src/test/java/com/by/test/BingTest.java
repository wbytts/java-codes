package com.by.test;

import com.by.mapper.UserDao;
import com.by.pojo.User;
import com.by.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BingTest {

    static Logger logger = Logger.getLogger(BingTest.class);

    /**
     * 测试 SqlSession 的获取，以及简单查询的执行
     */
    @Test
    public void testSelectAll() {

        logger.error("[info]: 测试查找所有用户的方法-------开始");

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
        List<User> users = sqlSession.selectList("com.by.dao.UserDao.getUserList");

        for(User u : users) {
            System.out.println(u);
        }

        sqlSession.close();

        logger.info("[info]: 测试查找所有用户的方法-------结束");

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
        user.setPassword("qweqweqwe");

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

    /**
     * 测试分页查询
     */
    @Test
    public void testLimit() {

        logger.info("开始测试分页查询");
        logger.info("通过工具类 MybatisUtils 获取 sqlSession");
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        logger.info("得到 userMapper");
        UserDao userMapper = sqlSession.getMapper(UserDao.class);

        logger.info("封装分页查询的相关参数， startIndex=1， pageSize=3");
        Map<String, Object> map = new HashMap<>();
        map.put("startIndex", 1);
        map.put("pageSize", 3);
        logger.info("开始执行分页查询");
        List<User> users = userMapper.selectUserPageByLimit(map);
        logger.info("查询结果如下：");
        for (User u : users) {
            logger.info(u);
        }

        logger.info("查询任务完毕，关闭sqlSession");
        sqlSession.close();
    }

    /**
     * 通过 RowBounds 实现分页
     * 通过 java 代码层面实现分页
     */
    @Test
    public void testSelectPageByRowBounds() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        // 通过 RowBounds 实现分页
        RowBounds rowBounds = new RowBounds(1, 2);

        // 注意这里，第三个参数才是 RowBounds
        List<User> users = sqlSession.selectList("com.by.dao.UserDao.selectUserPageByRowBounds", null, rowBounds);

        for (User u : users) {
            System.out.println(u);
        }

        sqlSession.close();
    }
}
