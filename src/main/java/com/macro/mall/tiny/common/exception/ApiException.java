package com.macro.mall.tiny.common.exception;


import com.macro.mall.tiny.common.api.IErrorCode;

/**
 * 自定义API异常
 *
 * @author dongjb
 * @date 2020/11/19
 */
public class ApiException extends RuntimeException {
    private static final long serialVersionUID = -3096765186314157046L;
    private IErrorCode errorCode;

    public ApiException(IErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public IErrorCode getErrorCode() {
        return errorCode;
    }
}
