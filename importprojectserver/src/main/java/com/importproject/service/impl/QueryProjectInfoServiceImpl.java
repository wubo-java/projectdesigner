package com.importproject.service.impl;

import com.importproject.dto.ZMenuDTO;
import com.importproject.handle.inter.ProjectHandleinter;
import com.importproject.pojo.ProjectPojo;
import com.importproject.repository.inter.ProjectRepositoryInter;
import com.importproject.service.inter.QueryProjecInfoServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wubo
 * @description 查询工程信息
 * @date 2021/1/16
 */
@Service
public class QueryProjectInfoServiceImpl implements QueryProjecInfoServiceInter {

    @Autowired
    ProjectRepositoryInter projectRepositoryInter;

    @Autowired
    ProjectHandleinter projectHandleinter;
    @Override
    public List<ZMenuDTO> queryProjectPojoInfo(String projectid) {
        ProjectPojo projectPojo=projectRepositoryInter.queryProjectPojoInfo(projectid);
        return projectHandleinter.copyValue(projectPojo);
    }
}
