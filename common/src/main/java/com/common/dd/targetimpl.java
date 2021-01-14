package com.common.dd;

/**
 * @author wubo
 * @description td
 * @date 2021/1/14
 */
public class targetimpl implements proxyinterface{
    public proxyinterface proxyinterface;
    public targetimpl(proxyinterface proxyinterface){
        this.proxyinterface=proxyinterface;
    }
    @Override
    public void test(){
        proxyinterface.test();
        System.out.println("dd");
    }
}
