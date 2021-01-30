package com.importproject.service;

/**
 * @author wubo
 * @description dd
 * @date 2021/1/30
 */
public class Test {

    public static void main(String[] args) {
        test1 t=new test1();
        t.setUsername("wubo");
        test1 tt=new test1();
        System.out.println(t.getUsername());
    }
}


class  test1{
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}