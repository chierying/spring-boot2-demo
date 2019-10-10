package com.example.springboot.entity.vo;

import lombok.Data;

/**
 * 基础返回结果
 */
@Data
public class Result {
    public static final int OK = 200;
    public static final int BAD_REQUEST = 400;
    public static final int INTERNAL_SERVER_ERR = 500;

    private int status;
    private Object data;

    public static Result ok(Object result) {
        Result r = new Result();
        r.setStatus(OK);
        r.setData(result);
        return r;
    }

    public static Result badRequest(Object result) {
        Result r = new Result();
        r.setStatus(BAD_REQUEST);
        r.setData(result);
        return r;
    }

    public static Result err(Object result) {
        Result r = new Result();
        r.setStatus(INTERNAL_SERVER_ERR);
        r.setData(result);
        return r;
    }
}
