package com.importproject.repository.impl;

import com.importproject.dao.ProjectMapper;
import com.importproject.dto.DirectoryDTO;
import com.importproject.dto.FileDTO;
import com.importproject.dto.MethodDTO;
import com.importproject.dto.ProjectDTO;
import com.importproject.enetity.Project;
import com.importproject.pojo.ProjectPojo;
import com.importproject.repository.inter.DirectoryRepositoryInter;
import com.importproject.repository.inter.FileRepositoryInter;
import com.importproject.repository.inter.MethodRepoistoryInter;
import com.importproject.repository.inter.ProjectRepositoryInter;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wubo
 * @description 项目查询
 * @date 2021/1/16
 */
@Service
public class ProjectRepositoryImpl implements ProjectRepositoryInter {

    @Autowired
    ProjectMapper projectMapper;

    @Autowired
    DirectoryRepositoryInter directoryRepositoryInter;

    @Autowired
    FileRepositoryInter fileRepositoryInter;

    @Autowired
    MethodRepoistoryInter methodRepoistoryInter;

    /**
     * @author wubo
     * @description 查询所有项目信息
     * @param 
     * @return {@link java.util.List<com.importproject.dto.ProjectDTO>}
     * @date 2021/1/16
     */
     
    @Override
    public List<ProjectDTO> queryAllProject() {
        List<Project> projectList=projectMapper.selectAll();
        List<ProjectDTO> projectDTOList=new ArrayList<>();
        for (Project project : projectList) {
            ProjectDTO projectDTO=new ProjectDTO();
            BeanUtils.copyProperties(project,projectDTO);
            projectDTOList.add(projectDTO);
        }
        return projectDTOList;
    }

    /**
     * @author wubo
     * @description 查询工程信息
     * @param projectid
     * @return {@link java.util.List< ProjectPojo >}
     * @date 2021/1/16
     */

    @Override
    public ProjectPojo queryProjectPojoInfo(String projectid) {
        List<DirectoryDTO> directoryDTOList=directoryRepositoryInter.queryAllDirectory();
        List<FileDTO> fileDTOList=fileRepositoryInter.queryAllFile();
        List<MethodDTO> methodDTOList=methodRepoistoryInter.queryAllMethod();
        ProjectPojo projectPojo=new ProjectPojo();
        projectPojo.setDirectoryDTOList(directoryDTOList);
        projectPojo.setFileDTOList(fileDTOList);
        projectPojo.setMethodDTOList(methodDTOList);
        return projectPojo;
    }

    /**
     * @author wubo
     * @description 查询详情信息。
     * @param projectid
     * @return {@link ProjectDTO}
     * @date 2021/1/16
     */
    @Override
    public ProjectDTO queryProject(String projectid) {
       Project project= projectMapper.selectByPrimaryKey(Integer.parseInt(projectid));
       ProjectDTO projectDTO=new ProjectDTO();
       BeanUtils.copyProperties(project,projectDTO);
        return projectDTO;
    }
}
