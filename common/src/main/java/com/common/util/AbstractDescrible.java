package com.common.util;

/**
 * @author wubo
 * @description 抽象装饰
 * @date 2021/1/14
 */
public abstract class AbstractDescrible implements DscribeInterface{
    private DscribeInterface dscribeInterface=null;

    public AbstractDescrible(DscribeInterface dscribeInterface){
        this.dscribeInterface=dscribeInterface;
    }
    @Override
    public void test() {
        this.dscribeInterface.test();
    }
}
