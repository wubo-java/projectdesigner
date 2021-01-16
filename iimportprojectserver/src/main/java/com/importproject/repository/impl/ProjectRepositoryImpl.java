package com.importproject.repository.impl;

import com.importproject.dto.ProjectDTO;
import com.importproject.pojo.ProjectPojo;
import com.importproject.repository.inter.ProjectRepositoryInter;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wubo
 * @description 项目查询
 * @date 2021/1/16
 */
@Service
public class ProjectRepositoryImpl implements ProjectRepositoryInter {
    /**
     * @author wubo
     * @description 查询工程信息
     * @param projectid
     * @return {@link java.util.List< ProjectPojo >}
     * @date 2021/1/16
     */

    @Override
    public List<ProjectPojo> queryProjectPojoInfo(String projectid) {
        return null;
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
        return null;
    }
}
