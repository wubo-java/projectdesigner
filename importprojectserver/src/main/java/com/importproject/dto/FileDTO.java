package com.importproject.dto;

import lombok.Data;

/**
 * @author wubo
 * @description 文件DTO
 * @date 2021/1/16
 */
@Data
public class FileDTO {
    //add by wubo 2021/1/16 文件id
    private Integer fileid;
    //add by wubo 2021/1/16 项目id
    private String projectrootF;
    //add by wubo 2021/1/16 文件名
    private String filename;
    //add by wubo 2021/1/16 文件描述
    private String filedesc;
    //add by wubo 2021/1/16 项目路径
    private String projectroot_f;
    //add by wubo 2021/1/16 文件类型
    private String filetype;
    //add by wubo 2021/1/29 项目id
    private Integer projectidF;
    //add by wubo 2021/1/29  文件夹id
    private Integer directoryid;











}
