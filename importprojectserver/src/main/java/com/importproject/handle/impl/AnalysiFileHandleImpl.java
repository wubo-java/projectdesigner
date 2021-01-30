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


    public static void main(String[] args) {
        try{
            AnalysiFileHandleImpl analysiFileHandle=new AnalysiFileHandleImpl();
            File file=new File("D:\\projectdesigner\\importprojectserver\\src\\main\\java\\com\\importproject\\handle\\impl\\DirectoryHandleImpl.java");
            String str=analysiFileHandle.removeComments(file);
            String[] strs=str.split("\n");
            str=analysiFileHandle.makeFirstLeftLineFeed(strs);
            str=analysiFileHandle.changeLine(str.split("\n"));
            analysiFileHandle.analysisAllClass(0,str.split("\n"));
        }catch (Exception e){
            e.printStackTrace();
        }

    }


    /**
     * @author wubo
     * @description 
     * @param flag
     * @param str
     * @return {@link int}
     * @date 2021/1/30
     */

    public int analysisAllClass(int flag,String[] str){
        List list=new ArrayList();
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append(str[flag]+"\n");
        for (int i = flag+1; i < str.length; i++) {
            if(classindex(str[i])>-1){
                i=analysisAllClass(i,str);
            }else{
                stringBuffer.append(str[i]+"\n");
                if(str[i].indexOf("{")>-1){
                    for (int j = 0; j < cacluteCount(str[i],'{'); j++) {
                        list.add("{");
                    }
                }

                if(str[i].indexOf("}")>-1){
                    list.add("}");
                    if(isComplete(list)){
                        System.out.println(stringBuffer.toString());
                        return i;
                    }
                }
            }
        }
        return -1;

    }
    /**
     * @author wubo
     * @description 分析class
     * @param fileRoot
     * @return 
     * @date 2021/1/30
     */
     
    @Override
    public void analysisClass(String fileRoot) {
//        try {
//
//            File file = new File(fileRoot);
//            removeComments(file);
//            FileReader fr = new FileReader(file);
//            BufferedReader br = new BufferedReader(fr);
//            analysisFileProcess(br, "");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        File file=new File(fileRoot);
        String str=removeComments(file);
        String[] strs=str.split("\n");
        str=makeFirstLeftLineFeed(strs);
        str=changeLine(str.split("\n"));
        analysisAllClass(0,str.split("\n"));
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
     * @description 将右括号成为一行
     * @param str
     * @param stringBuffers
     * @return 
     * @date 2021/1/30
     */
     
    public void makeRightLineFeed(String str,StringBuffer stringBuffers){
        if(str.indexOf("}")!=-1){
            stringBuffers.append(str.substring(0,str.indexOf("}")+1)+"\n");
            makeRightLineFeed(str.substring(str.indexOf("}")+1,str.length()),stringBuffers);
        }else{
            stringBuffers.append(str+"\n");
        }

    }

    /**
     * @author wubo
     * @description 将所有的右括号成为一行
     * @param str
     * @return {@link java.lang.String}
     * @date 2021/1/30
     */

   public String changeLine(String[] str){
        StringBuffer stringBuffer=new StringBuffer();
       for (int i = 0; i < str.length; i++) {
           makeRightLineFeed(str[i],stringBuffer);
       }
       return stringBuffer.toString();
   }


   /**
    * @author wubo
    * @description 将class 的第一个左括号之后的代码全部换行。
    * @param str
    * @return {@link java.lang.String}
    * @date 2021/1/30
    */
    
    public String makeFirstLeftLineFeed(String[] str){
        StringBuffer stringBuffer=new StringBuffer();
        for (int i = 0; i < str.length; i++) {
            if(classindex(str[i])!=-1){
                if(str[i].indexOf("{")>-1){
                    stringBuffer.append(str[i].substring(0,str[i].indexOf("{"))+"\n");
                    stringBuffer.append(str[i].substring(str[i].indexOf("{"))+"\n");
                }else{
                    stringBuffer.append(str[i]+"\n");
                }
            }else{
                stringBuffer.append(str[i]+"\n");
            }
        }
        return stringBuffer.toString();
    }


    /**
     * @author wubo
     * @description 移除注释，并将class置于行首。
     * @param file
     * @return 
     * @date 2021/1/30
     */
     
    public String removeComments(File file) {
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        StringBuffer stringBuffers=new StringBuffer();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String str = "";
            StringBuffer stringBuffer = new StringBuffer();
            while ((str = bufferedReader.readLine()) != null) {
                stringBuffer.append(str+"\n");
            }
            str = stringBuffer.toString();
            str = str.replaceAll("/\\*{1,2}[\\s\\S]*?\\*/", "");

            String[] strings=str.split("\n");
            for (String string : strings) {
               makeClassToFirst(string,stringBuffers);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return stringBuffers.toString();
        }


    }


    /**
     * @author wubo
     * @description 将class关键字定位到头部
     * @param str
     * @param stringBuffers
     * @return 
     * @date 2021/1/30
     */

    public void makeClassToFirst(String str,StringBuffer stringBuffers){
        if(classindex(str)!=-1){
            //匹配到考虑到的class关键字
            //把本行能想到的匹配到的格式转换成特定的格式
            int classIndex = 0 ;
            if(classindex(str)>0){
                String s1 =  str.substring(classindex(str));
                stringBuffers.append(str.substring(0,classindex(str)+s1.indexOf("class"))+"\n");
                classIndex = classindex(str)+s1.indexOf("class");
            }else {
                stringBuffers.append(str.substring(0,classindex(str))+"\n");
                classIndex=classindex(str);
            }
            stringBuffers.append("class ");
            //递归本行，考虑到本行有多个class关键字
            makeClassToFirst(str.substring(5+classIndex,str.length()),stringBuffers);
        }else{
            stringBuffers.append(str+"\n");
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

    @Deprecated
    public void analysisFileProcess(BufferedReader br, String beginstr) {
        int num=0;
        List<String> list = new ArrayList<String>();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(beginstr);
        if (beginstr.contains("{")) {
            num=cacluteCount(beginstr,'{');
            for (int i = 0; i < num; i++) {
                list.add("{");
            }
        }

        if(beginstr.contains("}")){
            num=cacluteCount(beginstr,'}');
            for (int i = 0; i < num; i++) {
                list.add("}");
            }
        }
        try {
            String str = "";
            while ((str = br.readLine()) != null) {
                if (classindex(str)>-1) {
                    if (beginstr.equals("")) {
                        stringBuffer.append(str);
                        beginstr = "&";
                        if (str.contains("{")) {
                            list.add("{");
                        }
                        continue;
                    }
                    if (str.indexOf("}") != -1 && (str.indexOf("}") <classindex(str))) {
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

                    } else if (str.indexOf("{") > -1 && (str.indexOf("{") < classindex(str))) {
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
                        num=cacluteCount(str,'{');
                        for (int i = 0; i < num; i++) {
                            list.add("{");
                        }
                    }
                    if (str.contains("}")) {
                        num=cacluteCount(str,'}');
                        for (int i = 0; i < num; i++) {
                            list.add("}");
                        }
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


    /**
     * @author wubo
     * @description 计算某个字符出现次数，这里用于计算左右大括号的次数
     * @param orignalStr
     * @param des
     * @return {@link int}
     * @date 2021/1/30
     */

    public int cacluteCount(String orignalStr,char des){
        int sum=0;
        for (int i = 0; i <orignalStr.length() ; i++) {
            if(orignalStr.charAt(i) == des){
                sum++;
            }
        }
        return sum;
    }


    /**
     * @author wubo
     * @description  定位是类，并返回class的下标。
     * @param orginalstr
     * @return {@link int}
     * @date 2021/1/30
     */
    public int classindex(String orginalstr){
        if(orginalstr.indexOf(" class ")>-1){
            return orginalstr.indexOf(" class ");
        }else if(orginalstr.indexOf("}class")>-1){
            return orginalstr.indexOf("}class");
        }else if(orginalstr.indexOf("class ")==0){
            return orginalstr.indexOf("class");
        }else if(orginalstr.equals("class")){
            return orginalstr.indexOf("class");
        }else if(orginalstr.indexOf("{class")>-1){
            return orginalstr.indexOf("{class");
        }
        return -1;
    }
}
 

    


