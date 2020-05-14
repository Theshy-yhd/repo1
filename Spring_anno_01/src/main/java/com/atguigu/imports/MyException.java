package com.atguigu.imports;

/**
 * @author yinhuidong
 * @createTime 2020-05-13-18:35
 */
public class MyException extends Exception {

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public MyException(String msg) {
        this.msg = msg;
    }

    public MyException() {

    }

    @Override
    public String toString() {
        return "MyException{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
