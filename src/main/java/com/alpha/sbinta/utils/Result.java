package com.alpha.sbinta.utils;

import java.io.Serializable;
import java.util.List;


public class Result implements Serializable
{
    private int resultCode;
    private String message;
    private Result data;

    public Result() {}

    public Result(int resultCode, String message)
    {
        this.resultCode = resultCode;
        this.message = message;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Result getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = (Result) data;
    }

    @Override
    public String toString()
    {
        return "Result{" +
                "resultCode=" + resultCode +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
