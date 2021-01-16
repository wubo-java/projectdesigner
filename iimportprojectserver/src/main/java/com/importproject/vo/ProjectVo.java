package com.importproject.vo;

import lombok.Data;

/**
 * @author wubo
 * @description 项目Vo
 * @date 2021/1/16
 */
@Data
public class ProjectVo {
    //add by wubo 2021/1/16 项目id 
    private Integer projectid;
    //add by wubo 2021/1/16 项目描述 
    private String projectdesc;
    //add by wubo 2021/1/16 项目路径
    private String projectroot;
}
