package com.by.pojo;

/**
 * @author wangby
 * @version 0.0.1
 * @date 2020-10-03 9:20
 * @update 2020-10-03 9:20
 */
public class User {
    private String name;

    public void show() {
        System.out.println("name=" + name);
    }

    public User() {
        System.out.println("User的无参构造");
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("User的name属性的set方法");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
