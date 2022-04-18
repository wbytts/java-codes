package com.by.mapper;

import com.by.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {

    Teacher getTeacher(@Param("tid") int id);

}
