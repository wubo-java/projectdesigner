package com.common.util;

/**
 * @author wubo
 * @description 客户端
 * @date 2021/1/14
 */
public class Client {
    public static void main(String[] args) {
        Client client=new Client();
        client.test();
    }
    public void test(){
        DscribeInterface dscribeInterfaces=new DescribleImpl();
        dscribeInterfaces=new DescribleImp(dscribeInterfaces);
        dscribeInterfaces.test();
    }

}
