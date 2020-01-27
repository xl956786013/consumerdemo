package com.xuling.consumerdemo.model;

import java.io.Serializable;

public class Result<T> implements Serializable {
    public static final int SUCCESS = 99;
    public static final int FAIL = 0;
    private static final long serialVersionUID = -3513899590297178641L;


    private int code;

    private String info;

    private T data;

    private int total;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
