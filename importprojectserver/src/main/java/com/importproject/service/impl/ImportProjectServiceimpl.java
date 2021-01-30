package com.importproject.service.impl;

import com.importproject.dto.FileDTO;
import com.importproject.dto.ProjectDTO;
import com.importproject.handle.inter.ProjectHandleinter;
import com.importproject.repository.inter.FileRepositoryInter;
import com.importproject.service.inter.ImportprojectServiceInter;
import com.importproject.util.FileUtil;
import com.importproject.util.Thread.FixedThreadUtil;
import com.importproject.util.Thread.ThreadContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wubo
 * @description 导入项目业务实现类
 * @date 2021/1/16
 */
@Service
public class ImportProjectServiceimpl implements ImportprojectServiceInter {
    @Autowired
    ProjectHandleinter projectHandleinter;

    @Autowired
    FileRepositoryInter fileRepositoryInter;
    /**
     * @author wubo
     * @description 插入项目信息
     * @param projectRoot
     * @return
     * @date 2021/1/16
     */

    @Override
    public void importProject(String projectRoot) {

        //插入项目表
        ProjectDTO projectDTO=new ProjectDTO();
        projectDTO.setProjectroot(projectRoot);
        int projectId=projectHandleinter.insertProjectInfo(projectDTO);

        //插入文件夹表和文件表
        File file=new File(projectRoot);
        FileUtil fileUtil=new FileUtil();
        fileUtil.analyFileToDataBase(file,projectId,-1);

        //拿到所有文件，进行方法分析
        List<FileDTO> fileDTOList= fileRepositoryInter.queryAllFile();
        List<String> projectRootList=new ArrayList<>();
        for (FileDTO fileDTO : fileDTOList) {
            projectRootList.add(fileDTO.getProjectrootF());
        }
        FixedThreadUtil fixedThreadUtil=new FixedThreadUtil();
        ThreadContext threadContext=new ThreadContext(fixedThreadUtil);
        threadContext.runThread(projectRootList);
       //TODO MethodHandler,根据文件处理方法与文件的对应关系。
    }


}
