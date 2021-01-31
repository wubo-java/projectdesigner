package com.importproject.handle.impl;

import com.importproject.handle.inter.AnalysisFileHandleInter;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

/**
 * @author wubo
 * @description 分析文件handle实现类
 * @date 2021/1/30
 */
public class AnalysiFileHandleImpl implements AnalysisFileHandleInter {
    private   int count = 0;
    @Autowired
    AnalysiFileHandleImpl analysiFileHandle;
    public static void main(String[] args) {
        try{
            List<StringBuffer> classList = new ArrayList<>();
            Map<String,List<String>> method = new HashMap<>();//map<类名，方法列表>
            AnalysiFileHandleImpl analysiFileHandle=new AnalysiFileHandleImpl();
            File file=new File("D:\\文件\\springboot\\projectdesigner\\importprojectserver\\src\\main\\java\\com\\importproject\\handle\\impl\\DirectoryHandleImpl.java");
            String str=analysiFileHandle.removeComments(file);
            String[] strs=str.split("\n");
            str=analysiFileHandle.makeFirstLeftLineFeed(strs);//在{前后加上换行符
            str=analysiFileHandle.changeLine(str.split("\n"));//在}前后加上换行符
            analysiFileHandle.analysisAllClass(0,str.split("\n"),classList);
            //对类操作 取方法名和类成员变量
            classList.stream().forEach(stringBuffer -> getMethod(stringBuffer.toString(),method));
            for(String key : method.keySet()){
                for(String s : method.get(key)){
                    System.out.println(key+":"+s);
                }
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    /**
     * //add by laijinrong 2021/1/31
     * 对类stringBuffer进行操作，得到方法名，存入Map
     * @param stringBuffer
     * @param methodMap
     */
    private static void getMethod(String stringBuffer, Map<String, List<String>> methodMap) {
        List<String> list = new ArrayList<>();
        stringBuffer.replaceAll("\n","");//把换行符全部干掉
        //获取类名
        String className = getClassName(stringBuffer);

        //获取类名

        String classBody = stringBuffer.substring(stringBuffer.indexOf("{") + 1,stringBuffer.lastIndexOf("}"));//避开第一个大括号，得到类体

        classBody = killMethodBody(classBody);//去掉方法体

        list = getMethodOfRight(classBody); //使用“(”来判断方法名
        methodMap.put(className,list);//把类名和方法名填进map中
    }



    /**
     *
     * @param classBody
     * @return
     */
    private static List<String> getMethodOfRight(String classBody) {
        List<String> list = new ArrayList<>();
        if(classBody==null||classBody.isEmpty()){
            return list;
        }
        while ( classBody.indexOf("(") != -1){
            String methodNameStr = classBody.substring(0,classBody.indexOf("(")).trim();
            String qwe= methodNameStr.substring(methodNameStr.lastIndexOf(" ")).trim();
            list.add(qwe);
            classBody = classBody.replaceFirst("[(]","["); //把方法括号“(”替换成"["，防止重复被搜索到
        }
        return list;
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
        List<StringBuffer> classList = new ArrayList<>();
        File file=new File(fileRoot);
        String str=removeComments(file);
        String[] strs=str.split("\n");
        str=makeFirstLeftLineFeed(strs);
        str=changeLine(str.split("\n"));
        analysisAllClass(0,str.split("\n"),classList);
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
            str = str.replaceAll("/\\*{1,2}[\\s\\S]*?\\*/", "");            //把/** * **/里的所有注释去掉
            String[] strings=str.split("\n");
            for (String string : strings) {   //按行操作
               makeClassToFirst(string,stringBuffers);//逐行读取到stringBuffers
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
        }
        return stringBuffers.toString();

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
        if(classindex(str)!=-1){                                                                //匹配到考虑到的class关键字
            //把本行能想到的匹配到的格式转换成特定的格式
            int classIndex = 0 ;
            if(classindex(str)>0){
                String s1 =  str.substring(classindex(str));
                stringBuffers.append(str.substring(0,classindex(str)+s1.indexOf("class"))+"\n");
                classIndex = classindex(str)+s1.indexOf("class");
            }else {
                stringBuffers.append(str.substring(0,classindex(str))+"\n");
                classIndex = classindex(str);
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
                    if ("".equals(beginstr)) {
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
            if ("{".equals(str)) {
                left++;
            } else if ("}".equals(str)) {
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
            return orginalstr.indexOf("class ");
        }else if("class".equals(orginalstr)){
            return orginalstr.indexOf("class");
        }else if(orginalstr.indexOf("{class")>-1){
            return orginalstr.indexOf("{class");
        }
        return -1;
    }

    /**
     * @author wubo
     * @description
     * @param flag
     * @param str
     * @return {@link int}
     * @date 2021/1/30
     */

    public int analysisAllClass(int flag,String[] str,List<StringBuffer> classList){
        List list=new ArrayList();
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append(str[flag]+"\n");
        for (int i = flag+1; i < str.length; i++) {
            if(classindex(str[i])>-1){
                i=analysisAllClass(i,str,classList);
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
                        classList.add(stringBuffer);
                        return i;
                    }
                }
            }
        }

        return -1;

    }

    /**
     * @param classBody
     * //add by laijinrong 2021/1/31
     * @return
     */
    public static String killMethodBody(String classBody){
        if(classBody.indexOf("{")==-1){
            return classBody; //不存在{,说明类中方法体已全部被删
        }

        Stack stack = new Stack();
        int index = 0 ;
        int flag = 0 ; //优化效率
        while (classBody.indexOf("{") != -1){
            for(int i = flag ; i < classBody.length() ; i++){
                char ch = classBody.charAt(i) ;
                if(ch == '{'){
                    stack.push(classBody.indexOf("{")); //压栈 栈的内容为{的索引 第一个压栈的即是方法体的"{"
                }else if(ch == '}'){
                    index = (int) stack.pop(); //弹栈
                    if(stack.empty()){         //为空即是匹配到方法体的"}"
                        classBody = classBody.substring(0,index)+classBody.substring(i + 1);
                        flag = index;
                        break;  //弹出去，重新对classBody进行循环
                    }
                }
            }
        }
        return classBody;
    }

    /**
     * 类名的判断条件
     * //add by laijinrong 2021/1/31
     * @param stringBuffer
     * @return
     */
    private static String getClassName(String stringBuffer) {
        String classNameStr = stringBuffer.substring(5,stringBuffer.indexOf("{"));

        if(classNameStr.indexOf(" extends ") != -1){
            return classNameStr.substring(0,classNameStr.indexOf(" extends ")).replaceAll(" ","");
        }else if(classNameStr.indexOf(" implements ") != -1){
            return classNameStr.substring(0,classNameStr.indexOf(" implements ")).replaceAll(" ","");
        }else {
            return classNameStr.replaceAll(" ","");
        }
    }
}





