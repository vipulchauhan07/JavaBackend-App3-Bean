package com.example.jpabeans4.demojpabeans4;

public class HelloWorld {

    private String msg;

    private String data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return this.getMsg() + " The data is " + this.getData() ;
    }
}
