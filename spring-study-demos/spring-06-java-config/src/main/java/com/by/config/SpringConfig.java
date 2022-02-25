package com.by.config;

import com.by.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 使用注解的方式配置Spring
 * @author wangby
 * @version 0.0.1
 * @date 2020-10-04 3:41
 * @update 2020-10-04 3:41
 */
@Configuration
public class SpringConfig {

    @Bean
    public User user() {
        return new User();
    }

}
