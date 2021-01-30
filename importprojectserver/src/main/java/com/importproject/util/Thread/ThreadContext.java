package com.importproject.util.Thread;

import java.util.List;

/**
 * @author wubo
 * @description 线程池容器
 * @date 2021/1/30
 */
public class ThreadContext {

    private BaseThreadUtil baseThreadUtil;
    public ThreadContext(BaseThreadUtil baseThreadUtil){
     this.baseThreadUtil=baseThreadUtil;
    }
    public void runThread(List<String> projectRootList){
            baseThreadUtil.threadRun(projectRootList);
    }
}
