package com.by.pojo;

/**
 * @author wangby
 * @version 0.0.1
 * @date 2020-10-04 3:41
 * @update 2020-10-04 3:41
 */
public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
