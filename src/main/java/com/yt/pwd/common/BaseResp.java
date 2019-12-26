package com.yt.pwd.common;

public class BaseResp<T> {


    private int type = 200;

    private String msg = "success";

    private T data;


    public BaseResp(int type, String msg, T data) {
        this.type = type;
        this.msg = msg;
        this.data = data;
    }

    public BaseResp() {
    }

    public BaseResp(T data) {
        this.data = data;
    }


    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
