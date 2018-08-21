package com.imooc.order.exception;

import com.imooc.order.enums.ResultEnum;

public class OrderException  extends  RuntimeException{
    private  Integer code;

    public OrderException(ResultEnum resultEnum){
        this(resultEnum.getMessage(),resultEnum.getCode());
    }

    public OrderException(Integer code) {
        this.code = code;
    }

    public OrderException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public OrderException(String message, Throwable cause, Integer code) {
        super(message, cause);
        this.code = code;
    }

    public OrderException(Throwable cause, Integer code) {
        super(cause);
        this.code = code;
    }

    public OrderException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Integer code) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }
}
