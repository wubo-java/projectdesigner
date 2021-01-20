package com.importproject.vo;

import lombok.Data;

/**
 * @author wubo
 * @description 方法Vo
 * @date 2021/1/16
 */
@Data
public class MethodVo {
    //add by wubo 2021/1/16 方法id 
    private Integer methodid;
    //add by wubo 2021/1/16 项目id 
    private Integer projectid_m;
    //add by wubo 2021/1/16 方法名 
    private  String methodname;
    //add by wubo 2021/1/16 方法描述
    private  String methoddesc;
}
