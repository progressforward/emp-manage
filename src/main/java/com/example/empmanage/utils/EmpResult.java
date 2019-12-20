package com.example.empmanage.utils;

public class EmpResult<T> {
    private String state;
    private T data;
    private String message;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public EmpResult(String state, T data, String message){
        this.state = state;
        this.data = data;
        this.message = message;
    }
}
