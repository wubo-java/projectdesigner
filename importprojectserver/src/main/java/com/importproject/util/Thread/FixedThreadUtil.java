package com.importproject.util.Thread;

import com.importproject.handle.impl.AnalysiFileHandleImpl;
import com.importproject.handle.inter.AnalysisFileHandleInter;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author wubo
 * @description 定长线程池
 * @date 2021/1/30
 */
public class FixedThreadUtil implements BaseThreadUtil{
    @Value("threadNum")
    private int threadNum;
    @Override
    public void threadRun(List<String> projectRootList) {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(this.threadNum);
        for (String projectRoot : projectRootList) {
            AnalysisFileHandleInter analysisFileHandleInter=new AnalysiFileHandleImpl();
            FileAnalysisContext fileAnalysisContext=new FileAnalysisContext(analysisFileHandleInter,projectRoot);
            fixedThreadPool.execute(fileAnalysisContext);
        }
    }
}
