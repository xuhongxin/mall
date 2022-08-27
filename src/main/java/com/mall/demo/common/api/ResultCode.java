package com.mall.demo.common.api;

/**
 * @author: create by hongxin.xu
 * @date: 2022/8/27
 **/
public enum ResultCode implements IErrorCode{
    SUCCESS(200,"操作成功"),
    FAILED(500,"操作失败"),

    VALIDATE_FAILED(404,"参数校验失败"),

    UNAUTHORIZED(401,"暂未登录或token过期"),

    FORBIDDEN(403,"没有权限");

    private long code;
    private String message;

    private ResultCode(long code,String message){
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
