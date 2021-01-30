package com.importproject.handle.impl;

import com.importproject.handle.inter.AnalysisFileHandleInter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wubo
 * @description 分析文件handle实现类
 * @date 2021/1/30
 */
public class AnalysiFileHandleImpl implements AnalysisFileHandleInter {
    private   int count = 0;
    
    /**
     * @author wubo
     * @description 分析class
     * @param fileRoot
     * @return 
     * @date 2021/1/30
     */
     
    @Override
    public void analysisClass(String fileRoot) {
        try {

            File file = new File(fileRoot);
            removeComments(file);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            analysisFileProcess(br, "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @author wubo
     * @description 分析方法
     * @param fileRoot
     * @return 
     * @date 2021/1/30
     */
     
    @Override
    public void analysisMethod(String fileRoot) {
        analysisClass(fileRoot);
    }

    /**
     * @author wubo
     * @description 移除注释，并生成临时文件
     * @param file
     * @return 
     * @date 2021/1/30
     */
     
    public void removeComments(File file) {
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            fileWriter = new FileWriter("D:\\temp\\temp.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            String str = "";
            StringBuffer stringBuffer = new StringBuffer();
            while ((str = bufferedReader.readLine()) != null) {
                stringBuffer.append(str);
            }
            str = stringBuffer.toString();
            str = str.replaceAll("/\\*{1,2}[\\s\\S]*?\\*/", "");
            bufferedWriter.write(str);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
                bufferedReader.close();
                fileReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }

    /**
     * @author wubo
     * @description  实现分析class的过程
     * @param br
     * @param beginstr
     * @return
     * @date 2021/1/30
     */

    public void analysisFileProcess(BufferedReader br, String beginstr) {
        List<String> list = new ArrayList<String>();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(beginstr);
        if (beginstr.contains("{")) {
            list.add("{");
        }
        try {
            String str = "";
            while ((str = br.readLine()) != null) {


                if (str.contains("class")) {
                    if (beginstr.equals("")) {
                        stringBuffer.append(str);
                        beginstr = "&";
                        if (str.contains("{")) {
                            list.add("{");
                        }
                        continue;
                    }

                    if (str.indexOf("}") != -1 && (str.indexOf("}") < str.indexOf("class"))) {
                        list.add("}");
                        if (isComplete(list)) {
                            stringBuffer.append(str.substring(0, str.indexOf("}") + 1));
                            System.out.println(stringBuffer.toString());
                            str = str.substring(str.indexOf("}") + 1, str.length());
                            count++;
                            analysisFileProcess(br, str);
                        } else {
                            stringBuffer.append(str.substring(0, str.indexOf("}") + 1));
                            str = str.substring(str.indexOf("}") + 1, str.length());
                            count++;
                            analysisFileProcess(br, str);
                        }

                    } else if (str.indexOf("{") > -1 && (str.indexOf("{") < str.indexOf("class"))) {
                        stringBuffer.append(str.substring(0, str.indexOf("{") + 1));
                        str = str.substring(str.indexOf("{") + 1, str.length());
                        list.add("{");
                        count++;
                        analysisFileProcess(br, str);
                    } else {
                        count++;
                        analysisFileProcess(br, str);
                    }
                } else {
                    stringBuffer.append(str);

                    if (str.contains("{")) {
                        list.add("{");

                    }
                    if (str.contains("}")) {
                        list.add("}");
                        if (isComplete(list)) {
                            if (count != 0) {
                                count--;
                                System.out.println(stringBuffer.toString());

                                return;
                            } else {
                                System.out.println(stringBuffer.toString());
                            }
                        }
                    }
                }

            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {


        }
    }


    /**
     * @author wubo
     * @description 判断是否是正常的大括号结束。
     * @param list
     * @return {@link boolean}
     * @date 2021/1/30
     */
     
    public boolean isComplete(List<String> list) {
        int left = 0;
        int right = 0;
        for (String str : list) {
            if (str.equals("{")) {
                left++;
            } else if (str.equals("}")) {
                right++;
            }
        }
        if (left == right) {
            return true;
        }
        return false;
    }
}
 

    


