package com.macro.mall.tiny.modules.pms.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author dongjb
 * @date 2020/11/10
 */

public enum ShowStatusEnum{
    /**
     * 1-显示, 2-隐藏
     */
    SHOW(1, "显示"),
    HIDDEN(0, "隐藏");
    @EnumValue
    private int value;
    @JsonValue
    private String desc;

    ShowStatusEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}