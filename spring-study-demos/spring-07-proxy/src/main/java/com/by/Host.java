package com.by;

/**
 * 被代理角色，房东
 * @author wangby
 * @version 0.0.1
 * @date 2020-10-05 16:18
 */
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东要出租房子。");
    }
}
