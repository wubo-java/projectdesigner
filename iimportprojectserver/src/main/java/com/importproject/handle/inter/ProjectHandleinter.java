package com.importproject.handle.inter;

import com.importproject.dto.ZMenuDTO;
import com.importproject.pojo.ProjectPojo;

import java.util.List;

/**
 * @author wubo
 * @description 项目handle接口
 * @date 2021/1/16
 */
public interface ProjectHandleinter {

    public void updateProjectByProjectId(String projectId);

    public void insertProjectInfo();

    public List<ZMenuDTO> copyValue(ProjectPojo projectPojo);
}
