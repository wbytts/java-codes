package com.by;

/**
 * 代理角色：中介
 * @author wangby
 * @version 0.0.1
 * @date 2020-10-05 16:19
 */
public class Proxy implements Rent {

    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        fare();
    }

    public void seeHouse() {
        System.out.println("中介带你看房");
    }

    // 收中介费
    public void fare() {
        System.out.println("收中介费");
    }

    public void hetong() {
        System.out.println("签合同");
    }
}
