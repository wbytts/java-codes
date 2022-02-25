package com.by.config;

import com.by.pojo.Person;
import com.by.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * Spring 的配置类
 *      配置类 == 配置文件
 * @author wbytts
 * @version 0.0.1
 * @date 2020-12-07 2:22
 */
@Configuration  // 告诉 Spring 这是一个配置类
@ComponentScan(value = "com.by", excludeFilters = {
        // @ComponentScan.Filter(type= FilterType.ANNOTATION, classes= {Controller.class, Service.class})
})  // 配置要扫描的包
/*
    ComponentScan：
        value：指定要扫描的包
        excludeFilters：配置要排除的包，配置一个 Filter[]
        includeFilters：配置只需要包含的包，也是配置一个 Filter[]
        excludeFilters、includeFilters都需要禁用默认的过滤规则 useDefaultFilters=false
    ComponentScan 可以多写几个，或者使用 ComponentsScans ，其value可以配置一个 ComponentScan 数组

    @Filter
        常用的过滤类型：
            FilterType.ANNOTATION：按照注解过滤
                @Filter(type= FilterType.ANNOTATION, classes= {Controller.class, Service.class})
            FilterType.ASSIGNABLE_TYPE：按照指定的类型过滤
                @Filter(type=FilterType.ASSIGNABLE_TYPE, classes={BookService.class})
            FilterType.ASPECTJ：按照 ASPECTJ表达式过滤
            FilterType.REGEX：按照正则表达式过滤
            FilterType.CUSTOM：使用自定义规则
                自定义过滤类，实现 TypeFilter 接口，重写 match 方法

 */
public class MainConfig {

    /**
     * 向容器中添加一个 Bean，类型默认为返回值的类型，id默认为方法名
     * @return
     */
    @Bean
    public Person person() {
        return new Person("wby", 18);
    }

}
