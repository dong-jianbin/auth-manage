package com.macro.mall.tiny.config;

import com.macro.mall.tiny.common.config.BaseRedisConfig;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * Redis配置类
 *
 * @author dongjb
 * @date 2020/11/19
 */
@EnableCaching
@Configuration
public class RedisConfig extends BaseRedisConfig {

}
