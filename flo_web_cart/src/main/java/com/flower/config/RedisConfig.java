package com.flower.config;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisConfig {

    @Bean
    public StringRedisTemplate redisTemplate( RedisConnectionFactory redisConnectionFactory){

        return new StringRedisTemplate( redisConnectionFactory );
    }
}
