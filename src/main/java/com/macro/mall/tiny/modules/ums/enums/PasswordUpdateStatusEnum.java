package com.macro.mall.tiny.modules.ums.enums;

/**
 * 用户状态枚举值
 *
 * @author dongjb
 * @date 2020/11/19
 */
public enum PasswordUpdateStatusEnum {
    /**
     * 枚举列表
     */
    SUCCESS(0, "更新成功"),
    PARAM_INVALID(-1, "提交参数不合法"),
    NO_USER(-2, "找不到该用户"),
    OLD_PASSWORD_ERR(-3, "旧密码错误");

    private final Integer code;
    private final String message;

    PasswordUpdateStatusEnum(Integer code, String message) {
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
