package com.sxt.commons.utils;

/**
 * @program: srm
 * @description: 控制器响应结果的包装类
 * @author: 波波烤鸭
 * @create: 2019-05-03 19:59
 */

import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Restful统一Json响应对象封装
 *
 * @author 波波烤鸭
 * @email dengpbs@163.com
 *
 */
public class Resp implements Serializable {
    private static final long serialVersionUID = 1L;

    private final static String SUCCESS_CODE = "200";


    /**
     * 返回状态码
     */
    private String status;

    /**
     * 返回消息
     */
    private String message;

    /**
     * 其他内容
     */
    private Map<String, Object> ext;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getExt() {
        return ext;
    }

    public void setExt(Map<String, Object> ext) {
        this.ext = ext;
    }

    public Resp() {
        this.status = SUCCESS_CODE;
        this.message = "SUCCESS";
    }

    public Resp(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public Resp(String status, String message, Map<String, Object> ext) {
        this.status = status;
        this.message = message;
        this.ext = ext;
    }

    // 快速返回成功
    public static Resp success() {
        return new Resp(SUCCESS_CODE, "请求成功", null);
    }

    public static Resp success(String message) {
        return new Resp(SUCCESS_CODE, message);
    }

    public static Resp success(String message, Map<String, Object> extra) {
        return new Resp(SUCCESS_CODE, message, extra);
    }

    // 快速返回失败状态
    public static Resp fail() {
        return new Resp(ErrorCode.SYSTEM_ERROR.getCode(), ErrorCode.SYSTEM_ERROR.getMessage());
    }

    public Resp fail(String message) {
        return new Resp(ErrorCode.SYSTEM_ERROR.getCode(), message);
    }

    public Resp fail(String message, Map<String, Object> extra) {
        return new Resp(ErrorCode.SYSTEM_ERROR.getCode(), message, extra);
    }

    public static Resp fail(ErrorCode errorCode) {
        return new Resp(errorCode.getCode(), errorCode.getMessage());
    }

    public static Resp fail(ErrorCode errorCode, String message) {
        return new Resp(errorCode.getCode(), message);
    }

    public static Resp fail(ErrorCode errorCode, String message, Map<String, Object> extra) {
        return new Resp(errorCode.getCode(), message, extra);
    }

    // 快速返回自定义状态码
    public static Resp result(String statusCode, String message) {
        return new Resp(statusCode, message);
    }

    public static Resp result(String statusCode, String message, Map<String, Object> extra) {
        return new Resp(statusCode, message, extra);
    }

    // 快速返回Http状态
    public static Resp httpStatus(HttpStatus httpStatus, String message) {
        return result(httpStatus.toString(), message);
    }

}

