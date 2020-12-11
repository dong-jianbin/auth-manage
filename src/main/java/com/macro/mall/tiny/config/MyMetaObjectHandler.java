package com.macro.mall.tiny.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.macro.mall.tiny.security.util.JwtTokenUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

/**
 * 填充器
 * @author dongjb
 * @date 2020/12/10
 */
@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert fill ....");
        try {
            String username = getUserName();
            this.setFieldValByName("createBy", username, metaObject);
            this.setFieldValByName("createTime", LocalDateTime.now(), metaObject);
            this.setFieldValByName("updateBy", username, metaObject);
            this.setFieldValByName("updateTime", LocalDateTime.now(), metaObject);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update fill ....");
        try {
            String username = getUserName();
            this.setFieldValByName("updateBy", username, metaObject);
            this.setFieldValByName("updateTime", LocalDateTime.now(), metaObject);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }

    public String getUserName(){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        assert attributes != null;
        HttpServletRequest request = attributes.getRequest();
        String authHeader = request.getHeader(this.tokenHeader);
        if (authHeader != null && authHeader.startsWith(this.tokenHead)) {
            // The part after "Bearer "
            String authToken = authHeader.substring(this.tokenHead.length());
            return jwtTokenUtil.getUserNameFromToken(authToken);
        }
        return "";
    }
}
