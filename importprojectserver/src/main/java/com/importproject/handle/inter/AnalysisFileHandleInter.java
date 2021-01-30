package com.importproject.handle.inter;

/**
 * @author wubo
 * @description 分析文件handle接口
 * @date 2021/1/30
 */
public interface AnalysisFileHandleInter {
    /**
     * @author wubo
     * @description 分析类
     * @param fileRoot
     * @return
     * @date 2021/1/29
     */

    public void analysisClass(String fileRoot);

    /**
     * @author wubo
     * @description 分析方法
     * @param
     * @return
     * @date 2021/1/29
     */

    public void analysisMethod(String fileRoot);


}
