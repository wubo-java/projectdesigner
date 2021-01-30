package com.importproject.util.Thread;

import com.importproject.handle.impl.AnalysiFileHandleImpl;
import com.importproject.handle.inter.AnalysisFileHandleInter;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author wubo
 * @description 缓存型内存池
 * @date 2021/1/30
 */
public class CacheThreadUtil implements BaseThreadUtil{

    @Override
    public void threadRun(List<String> projectRootList) {
        for (String projectRoot : projectRootList) {
            ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
            AnalysisFileHandleInter analysisFileHandleInter=new AnalysiFileHandleImpl();
            FileAnalysisContext fileAnalysisContext=new FileAnalysisContext(analysisFileHandleInter,projectRoot);
            cachedThreadPool.execute(fileAnalysisContext);
        }

    }
}
