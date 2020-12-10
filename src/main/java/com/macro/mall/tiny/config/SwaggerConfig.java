package com.macro.mall.tiny.config;

import com.macro.mall.tiny.common.config.BaseSwaggerConfig;
import com.macro.mall.tiny.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 *
 * @author dongjb
 * @date 2020/11/19
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.macro.mall.tiny.modules")
                .title("mall项目脚手架")
                .description("mall项目脚手架相关接口文档")
                .contactName("dongjb")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
