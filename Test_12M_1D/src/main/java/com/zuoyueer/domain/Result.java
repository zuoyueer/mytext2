package com.zuoyueer.domain;

import java.io.Serializable;

/**
 * @author Zuoyueer
 * Date: 2019/11/29
 * Time: 17:03
 * @projectName Framework
 * @description: 处理结果封装的javaBean
 */
public class Result implements Serializable {
    private boolean flag;
    private Object data;
    private String msg;

    public Result(boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }

    public Result(boolean flag, Object data, String msg) {
        this.flag = flag;
        this.data = data;
        this.msg = msg;
    }

    public Result() {
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
