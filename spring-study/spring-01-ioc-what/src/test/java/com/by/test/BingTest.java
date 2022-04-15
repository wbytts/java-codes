package com.by.test;

import com.by.dao.UserDaoOracleImpl;
import com.by.service.UserService;
import com.by.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BingTest {

    @Test
    public void test01() {

        // 用户实际上调用的是业务层，与 DAO 层不接触
        UserService userService = new UserServiceImpl();

        // ((UserServiceImpl) userService).setUserDao(new UserDaoImpl());
        // ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());
        ((UserServiceImpl) userService).setUserDao(new UserDaoOracleImpl());

        userService.getUser();
    }

    @Test
    public void test02() {
        // 获取 Spring 上下文对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 容器在手，天下我有，需要什么拿什么

        // 我们的对象，现在可以给 context 管理，我们要用的时候，从里面取出来即可
        // UserService userService = (UserService) context.getBean("userService");

        // 也可以不需要强转，只要在获取bean的时候指定接收的类型
        UserService userService = context.getBean("userService", UserService.class);
        userService.getUser();

    }

}
