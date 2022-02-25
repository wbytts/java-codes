package com.by.diy;

/**
 * @author wangby
 * @version 0.0.1
 * @date 2020-10-05 23:23
 */
public class DiyPointCut {

    public void before() {
        System.out.println("方法执行前");
    }

    public void after() {
        System.out.println("方法执行后");
    }

}
