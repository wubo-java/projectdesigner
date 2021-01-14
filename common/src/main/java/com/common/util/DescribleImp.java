package com.common.util;

/**
 * @author wubo
 * @description 具体装饰
 * @date 2021/1/14
 */
public class DescribleImp extends AbstractDescrible{
    public DescribleImp(DscribeInterface dscribeInterface) {
        super(dscribeInterface);
    }

    @Override
    public void test() {
        super.test();
        System.out.println("ddk");
    }
}
