package com.importproject.service.inter;

import com.importproject.dto.ZMenuDTO;

import java.util.List;

/**
 * @author wubo
 * @description 查询工程信息
 * @date 2021/1/16
 */
public interface QueryProjecInfoServiceInter {
    public List<ZMenuDTO> queryProjectPojoInfo(String projectid);
}
