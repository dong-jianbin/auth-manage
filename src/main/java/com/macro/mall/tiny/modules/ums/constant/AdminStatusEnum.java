package com.macro.mall.tiny.modules.ums.constant;

import com.macro.mall.tiny.common.api.IErrorCode;

/**
 * 用户状态枚举值
 *
 * @author dongjb
 * @date 2020/11/19
 */
public enum AdminStatusEnum {
    /**
     * 枚举列表
     */
    DISABLE(0, "禁用"),
    ENABLE(1, "启用");
    private final Integer code;
    private final String message;

    AdminStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
