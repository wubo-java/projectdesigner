package com.importproject.handle.inter;

import com.importproject.dto.ProjectDTO;
import com.importproject.dto.ZMenuDTO;
import com.importproject.pojo.ProjectPojo;

import java.util.List;

/**
 * @author wubo
 * @description 项目handle接口
 * @date 2021/1/16
 */
public interface ProjectHandleinter {

    public int updateProjectByProjectId(ProjectDTO projectDTO);

    public int insertProjectInfo(ProjectDTO projectDTO);

    public List<ZMenuDTO> copyValue(ProjectPojo projectPojo);
}
