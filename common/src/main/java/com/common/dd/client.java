package com.common.dd;

/**
 * @author wubo
 * @description dd
 * @date 2021/1/14
 */
public class client {
    public static void main(String[] args) {
        proxyinterface proxyinterface=new sourceimpl();
        proxyinterface proxyinterface1=new targetimpl(proxyinterface);
        proxyinterface1.test();
    }
}
