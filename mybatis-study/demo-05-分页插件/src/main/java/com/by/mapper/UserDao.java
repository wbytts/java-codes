package com.by.mapper;

import com.by.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {

    /**
     * 查询全部用户
     * @return 用户的列表
     */
    List<User> getUserList();

    /**
     * 根据id查询用户
     * @param id 用户id
     * @return 查询到的一个用户对象
     */
    User getUserById(Long id);

    /**
     * 添加一个 User
     * @param user 用户对象
     * @return 插入结果
     */
    int addUser(User user);

    /**
     * 修改用户
     * @param user 用户对象
     * @return 修改返回值
     */
    int updateUser(User user);

    /**
     * 删除用户
     * @param id 用户id
     * @return
     */
    int deleteUser(Long id);

    /**
     * 通过 map 对象添加用户
     * @param map Map 对象
     * @return
     */
    int addUserMap(Map<String, Object> map);

    /**
     * 查询所有用户，并分页
     * @return
     */
    List<User> selectUserPageByLimit(Map<String, Object> map);


    /**
     * 分页查询，通过 RowBounds
     * @param map
     * @return
     */
    List<User> selectUserPageByRowBounds(Map<String, Object> map);


}
