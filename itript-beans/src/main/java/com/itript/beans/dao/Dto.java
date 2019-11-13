package com.itript.beans.dao;

public class Dto<T> {
    private T data;
    /**
     * 错误码
     */
    private String errorCode;
    /**
     *
     */
    private String msg;
    /**
     * 成功标志
     */
    private String success;
}
