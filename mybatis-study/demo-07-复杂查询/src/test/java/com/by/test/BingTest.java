package com.by.test;

import com.by.mapper.StudentMapper;
import com.by.mapper.TeacherMapper;
import com.by.pojo.Student;
import com.by.pojo.Teacher;
import com.by.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

public class BingTest {

    static Logger logger = Logger.getLogger(BingTest.class);

    @Test
    public void test01() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);

        logger.info("通过ID查询一条教师数据");
        Teacher teacher = teacherMapper.getTeacher(1);
        // System.out.println(teacher);

        sqlSession.close();
    }

    @Test
    public void test02() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> studentsInfo = studentMapper.getStudentsInfo();

//        for(Student s : studentsInfo) {
//            System.out.println(s);
//        }

        sqlSession.close();
    }


    @Test
    public void test03() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> studentsInfo = studentMapper.getStudentsInfo2();

        for(Student s : studentsInfo) {
            System.out.println(s);
        }

        sqlSession.close();
    }

    @Test
    public void test04() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);

        Teacher teacher = teacherMapper.getTeacher(1);
        System.out.println(teacher);

        sqlSession.close();
    }
}
