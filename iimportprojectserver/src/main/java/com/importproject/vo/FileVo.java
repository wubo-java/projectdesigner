package com.importproject.vo;

import lombok.Data;

/**
 * @author wubo
 * @description 文件Vo
 * @date 2021/1/16
 */
@Data
public class FileVo {
    //add by wubo 2021/1/16 文件id 
    private Integer fileid;
    //add by wubo 2021/1/16 项目id 
    private Integer projectid_f;
    //add by wubo 2021/1/16 文件名 
    private String filename;
    //add by wubo 2021/1/16 文件描述
    private String filedesc;
    //add by wubo 2021/1/16 方法id 
    private Integer method_id_fk;
    //add by wubo 2021/1/16 项目路径 
    private String projectroot_f;
    //add by wubo 2021/1/16 文件类型 
    private String filetype;
}
