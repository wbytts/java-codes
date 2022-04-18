package com.by;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 我们会用这个类自动生成代理类1111111
 * @author wangby
 * @version 0.0.1
 * @date 2020-10-05 22:24
 */
public class ProxyInvocationHandler implements InvocationHandler {

    // 被代理的接口
    private Rent rent;

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    // 生成被代理的类
    public Object getProxy() {
        return java.lang.reflect.Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    // 处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 动态代理的本质，就是使用反射的方式实现
        Object result = method.invoke(rent, args);
        return result;
    }
}
