package com.importproject.handle.impl;

import com.importproject.dao.MethodMapper;
import com.importproject.dto.MethodDTO;
import com.importproject.enetity.Method;
import com.importproject.handle.inter.MethodHandleInter;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wubo
 * @description 方法handle实现类
 * @date 2021/1/16
 */
@Service
public class MethodHandleImpl implements MethodHandleInter {

    @Autowired
    MethodMapper methodMapper;
    /**
     * @author wubo
     * @description 插入方法信息
     * @param methodDTO
     * @return {@link int}
     * @date 2021/1/16
     */

    @Override
    public int insertMethodInfo(MethodDTO methodDTO) {
        Method method=new Method();
        BeanUtils.copyProperties(methodDTO,method);
        return methodMapper.insert(method);
    }

    /**
     * @author wubo
     * @description 查询方法信息
     * @param methodid
     * @return {@link com.importproject.dto.MethodDTO}
     * @date 2021/1/16
     */

    @Override
    public int updateMethodById(MethodDTO methodDTO) {
        Method method=new Method();
        BeanUtils.copyProperties(methodDTO,method);
        return methodMapper.updateByPrimaryKeySelective(method);
    }
}
