package com.importproject.service.impl;

import com.importproject.service.inter.ImportprojectServiceInter;
import org.springframework.stereotype.Service;

/**
 * @author wubo
 * @description 导入项目业务实现类
 * @date 2021/1/16
 */
@Service
public class ImportProjectServiceimpl implements ImportprojectServiceInter {
    /**
     * @author wubo
     * @description 插入项目信息
     * @param projectroot
     * @return
     * @date 2021/1/16
     */

    @Override
    public void importProject(String projectroot) {
        //TODO 读取文件路径插入project表
        //TODO 遍历项目，递归判断，第一次是文件夹，插入文件夹表，并mybatis返回主键，第二次用于第二层遍历同样插入加update，
        // 达到插入project表，directory表，file表,。
        //DirectoryHandle,FileHandle,ProjectHandle
        //TODO,FileRepository获取所有文件
       //TODO MethodHandler,根据文件处理方法与文件的对应关系。
    }
}
