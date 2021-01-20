package com.importproject.vo;

import lombok.Data;

/**
 * @author wubo
 * @description 文件夹Vo
 * @date 2021/1/16
 */
@Data
public class DirectoryVo {
    //add by wubo 2021/1/16 文件夹id
    private Integer directoryid;
    //add by wubo 2021/1/16  项目id
    private Integer project_id;
    //add by wubo 2021/1/16 项目描述 
    private String directorydesc;
    //add by wubo 2021/1/16 项目路径 
    private String projectroot_id;
    //add by wubo 2021/1/16 文件夹名 
    private String directoryname;
    //add by wubo 2021/1/16 文件id 
    private  Integer fileid_d_fk;

}
