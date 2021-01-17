package com.importproject.handle.impl;

import com.importproject.dao.ProjectMapper;
import com.importproject.dto.ZMenuDTO;
import com.importproject.handle.inter.ProjectHandleinter;
import com.importproject.pojo.ProjectPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
     * @param projectId
     * @return
     * @date 2021/1/16
     */

    @Override
    public void updateProjectByProjectId(String projectId) {

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
      //TODO 将数据库对象转换为ZTree对象。
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
    public void insertProjectInfo() {

    }
}
