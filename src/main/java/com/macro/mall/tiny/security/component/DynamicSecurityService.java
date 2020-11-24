package com.macro.mall.tiny.security.component;

import org.springframework.security.access.ConfigAttribute;

import java.util.Map;

/**
 * 动态权限相关业务类
 *
 * @author dongjb
 * @date 2020/11/19
 */
public interface DynamicSecurityService {
    /**
     * 加载资源ANT通配符和资源对应MAP
     * @return map
     */
    Map<String, ConfigAttribute> loadDataSource();
}
