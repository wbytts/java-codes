package com.by.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        InputStream inputStream = null;
        try {
            // 获取 SqlSessionFactory 对象
            String resource = "mybatis-config.xml";
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    // 可以从sqlSessionFactory中获取SqlSession
    // SqlSession 完全包含了面向数据库执行SQL命令所需的所有方法
    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }

}
