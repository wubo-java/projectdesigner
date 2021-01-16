package com.importproject.repository.inter;

import com.importproject.dto.ProjectDTO;
import com.importproject.pojo.ProjectPojo;

import java.util.List;

/**
 * @author wubo
 * @description 项目查询repository
 * @date 2021/1/16
 */
public interface ProjectRepositoryInter {


    public ProjectPojo queryProjectPojoInfo(String projectid);


    public ProjectDTO queryProject(String projectid);

    public List<ProjectDTO> queryAllProject();
}
