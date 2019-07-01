package com.study.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Copyright: Copyright (c) 2019 LanRu-Caifu
 *
 * @ClassName: RedisConfig
 * @Description: redisTemplate使用
 * @author: liusheng
 * @date: 2019-06-18 22:48
 * @version: v1.0.0
 * ---------------------------------------------------------*
 * Modification History:
 * Date          Author         Version         Description
 * ---------------------------------------------------------*
 * 2019-06-18   liusheng        v1.0.0          Modify reason
 */
@Configuration
public class RedisConfig {

    /**
     * @MethodName: redisTemplate
     * @Description: 把RedisTemplate交由spring管理
     * @author: liusheng
     * @date: 2019-06-18 22:54
     */
    @Bean
    public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory) {
        // 直接new出一个RedisTemplate
        RedisTemplate<String, String> redisTemplate = new RedisTemplate<>();
        // 把RedisConnectionFactory设置到RedisTemplate
        redisTemplate.setConnectionFactory(factory);
        return redisTemplate;
    }

}
    