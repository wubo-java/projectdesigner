package com.importproject.handle.impl;

import com.importproject.dto.MethodDTO;
import com.importproject.handle.inter.MethodHandleInter;
import org.springframework.stereotype.Service;

/**
 * @author wubo
 * @description 方法handle实现类
 * @date 2021/1/16
 */
@Service
public class MethodHandleImpl implements MethodHandleInter {

    /**
     * @author wubo
     * @description 插入方法信息
     * @param methodDTO
     * @return {@link int}
     * @date 2021/1/16
     */

    @Override
    public int insertMethodInfo(MethodDTO methodDTO) {
        return 0;
    }

    /**
     * @author wubo
     * @description 查询方法信息
     * @param methodid
     * @return {@link com.importproject.dto.MethodDTO}
     * @date 2021/1/16
     */

    @Override
    public int updateMethodById(String methodid) {
        return 0;
    }
}
