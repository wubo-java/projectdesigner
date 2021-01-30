package com.importproject.util.Thread;

import com.importproject.handle.inter.AnalysisFileHandleInter;

/**
 * @author wubo
 * @description 分析文件context
 * @date 2021/1/30
 */
public class FileAnalysisContext implements Runnable{
    private AnalysisFileHandleInter analysisFileHandleInter;
    private String projectRoot;
    public FileAnalysisContext(AnalysisFileHandleInter analysisFileHandleInter,String projectRoot){
        this.analysisFileHandleInter=analysisFileHandleInter;
        this.projectRoot=projectRoot;
    }
    @Override
    public void run() {
        analysisFileHandleInter.analysisMethod(this.projectRoot);
    }
}
