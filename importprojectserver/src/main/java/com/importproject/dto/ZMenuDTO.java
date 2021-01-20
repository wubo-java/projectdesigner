package com.importproject.dto;

import lombok.Data;

/**
 * @author wubo
 * @description 扩展树实体类
 * @date 2021/1/16
 */
@Data
public class ZMenuDTO {
    //add by wubo 2021/1/16 业务id 
    private Long id;
    //add by wubo 2021/1/16 业务名称 
    private String title;
    //add by wubo 2021/1/16 前端显示层数 
    private Long Parent;
}
