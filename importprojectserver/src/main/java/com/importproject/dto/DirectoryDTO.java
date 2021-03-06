package com.importproject.dto;

import lombok.Data;

/**
 * @author wubo
 * @description 文件夹DTO
 * @date 2021/1/16
 */
@Data
public class DirectoryDTO {
    //add by wubo 2021/1/16 文件夹id
    private Integer directoryid;
    //add by wubo 2021/1/16  项目id
    private Integer projectidD;
    //add by wubo 2021/1/16 项目描述
    private String directorydesc;
    //add by wubo 2021/1/16 项目路径
    private String projectrootD;
    //add by wubo 2021/1/16 文件夹名
    private String directoryname;
    //add by wubo 2021/1/29 文件夹id外键，父子id
    private Integer directoryid_fk;
    

}
