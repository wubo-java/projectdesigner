package com.importproject.controller;

/**
 * @author wubo
 * @description 测试调用栈
 * @date 2021/1/23
 */
public class Test {
    public static void main(String[] args) {
        Test test=new Test();
        StackTraceElement stack[] = Thread.currentThread().getStackTrace();

        for(int i=0;i<stack.length;i++){
            System.out.println(stack[i].getClassName()+" 。"+stack[i].getMethodName()+"-----");
        }
        test.test();
    }
    public void test(){
        StackTraceElement stack[] = Thread.currentThread().getStackTrace();

        for(int i=0;i<stack.length;i++){
            System.out.println(stack[i].getClassName()+" 。"+stack[i].getMethodName()+"-----");
        }
       int a=1;
        int b=2;;
        int sum=add(a,b);
        sum=a+b;
        System.out.println(sum);

    }

    public int add(int a,int b){
        StackTraceElement stack[] = Thread.currentThread().getStackTrace();

        for(int i=0;i<stack.length;i++){
            System.out.println(stack[i].getClassName()+" 。"+stack[i].getMethodName()+"-----");
        }
       return a+b;
    }
}
