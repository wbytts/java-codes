package com.by.pojo;

/**
 * @author wangby
 * @version 0.0.1
 * @date 2020-10-03 3:09
 * @update 2020-10-03 3:09
 */
public class Hello {
    private String str;

    public Hello() {
    }

    public Hello(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
