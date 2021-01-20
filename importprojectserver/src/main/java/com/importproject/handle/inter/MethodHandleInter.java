package com.importproject.handle.inter;

import com.importproject.dto.MethodDTO;

/**
 * @author wubo
 * @description 方法接口handle接口
 * @date 2021/1/16
 */
public interface MethodHandleInter {

    public int insertMethodInfo(MethodDTO methodDTO);

    public int updateMethodById(MethodDTO methodDTO);
}
