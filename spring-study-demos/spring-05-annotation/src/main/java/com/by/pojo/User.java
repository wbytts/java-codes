package com.by.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author wangby
 * @version 0.0.1
 * @date 2020-10-04 3:22
 * @update 2020-10-04 3:22
 */
/*
    等价于在配置文件中注册了一个 bean
    @Component 有一些衍生注解：功能是一样的，都代表将其装配到容器中
                dao层： @Repository
            service层： @Service
         controller层： @Controller
 */
@Component
@Scope("singleton") // 设置bean的作用域，参考 bean 标签的 scope 属性，默认是 singleton
public class User {

    // 使用 @Value 注解，注入普通属性，相当于 bean 标签中的 property 的 value 属性
    // 如果提供了 set 方法，@Value也可以添加到 set 方法上
    @Value("张三")
    private String name;


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
