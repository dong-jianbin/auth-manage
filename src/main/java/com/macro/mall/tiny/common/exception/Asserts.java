package com.macro.mall.tiny.common.exception;


import com.macro.mall.tiny.common.api.IErrorCode;

/**
 * 断言处理类，用于抛出各种API异常
 *
 * @author dongjb
 * @date 2020/11/19
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
