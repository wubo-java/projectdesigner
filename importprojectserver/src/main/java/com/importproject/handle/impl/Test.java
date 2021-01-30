package com.importproject.handle.impl;

/**
 * @author wubo
 * @description dd
 * @date 2021/1/30
 */
public class Test {
    public static void main(String[] args) {
        AnalysiFileHandleImpl analysiFileHandle=new AnalysiFileHandleImpl();

        String str="dd}}";
        System.out.println(analysiFileHandle.changeLine(str.split("\n")));;
    }
}
