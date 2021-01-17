package com.importproject.handle.impl;

import com.importproject.dao.ProjectMapper;
import com.importproject.dto.*;
import com.importproject.enetity.Project;
import com.importproject.handle.inter.ProjectHandleinter;
import com.importproject.pojo.ProjectPojo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wubo
 * @description 文件夹handle实现类
 * @date 2021/1/16
 */
@Service
public class ProjectHandleImpl implements ProjectHandleinter {

    @Autowired
    ProjectMapper projectMapper;
    /**
     * @author wubo
     * @description 根据工程id更新。
     * @param projectDTO
     * @return
     * @date 2021/1/16
     */

    @Override
    public int updateProjectByProjectId(ProjectDTO projectDTO) {
        Project project=new Project();
        BeanUtils.copyProperties(projectDTO,project);
        return projectMapper.updateByPrimaryKeySelective(project);
    }

    /**
     * @author wubo
     * @description 将数据库对象转换为前端ZTree识别的对象。
     * @param
     * @return
     * @date 2021/1/16
     */

    @Override
    public List<ZMenuDTO> copyValue(ProjectPojo projectPojo) {
        List<ZMenuDTO> zMenuDTOList=new ArrayList<>();
      //TODO 将数据库对象转换为ZTree对象。
        List<DirectoryDTO> directoryDTOList=projectPojo.getDirectoryDTOList();
        for (DirectoryDTO directoryDTO : directoryDTOList) {
            ZMenuDTO zMenuDTO=new ZMenuDTO();
            //TODO 转换文件夹信息入zMenuDTO。
        }
        List<FileDTO> fileDTOList=projectPojo.getFileDTOList();
        for (FileDTO fileDTO : fileDTOList) {
            ZMenuDTO zMenuDTO=new ZMenuDTO();
            //TODO 转换文件信息入zMenuDTO。
        }
        List<MethodDTO> methodDTOList=projectPojo.getMethodDTOList();
        for (MethodDTO methodDTO : methodDTOList) {
            ZMenuDTO zMenuDTO=new ZMenuDTO();
            //TODO 转换方法信息入zMenuDTO。
        }
      return null;
    }

    /**
     * @author wubo
     * @description 插入工程信息。
     * @param
     * @return
     * @date 2021/1/16
     */
    @Override
    public int insertProjectInfo(ProjectDTO projectDTO) {
        Project project=new Project();
        BeanUtils.copyProperties(projectDTO, project);
        return projectMapper.insert(project);
    }
}
