package com.importproject.dto;

import lombok.Data;

/**
 * @author wubo
 * @description 项目集合DTO
 * @date 2021/1/16
 */
@Data
public class ProjectsDTO {
    //add by wubo 2021/1/16 项目集合id 
    private Integer projectsid;
    //add by wubo 2021/1/16 项目id 
    private Integer projectid_p_fk;
    //add by wubo 2021/1/16 项目集合描述
    private String projectsdesc;
}
