package com.macro.mall.tiny.common.api;

/**
 * 封装API的错误码
 *
 * @author macro
 * @date 2020/11/19
 */
public interface IErrorCode {
    /**
     * 获取错误代码
     * @return 错误代码
     */
    long getCode();

    /**
     * 获取错误信息
     * @return 错误信息
     */
    String getMessage();
}
