package com.xgrt.exception;

//运行时异常会自动向上抛
public class BusinessException extends RuntimeException {
    private Integer code;//异常编号

    public Integer getCode() {
        return code;
    }

    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(Integer code, Throwable cause, String message) {
        super(message, cause);
        this.code = code;
    }


    //暂时不用，最好都加上
    public BusinessException(Integer code) {
        this.code = code;
    }

    public BusinessException(Integer code, Throwable cause) {
        super(cause);
        this.code = code;
    }

    public BusinessException(int code, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String message) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
