package com.importproject.repository.impl;

import com.importproject.dao.MethodMapper;
import com.importproject.dto.MethodDTO;
import com.importproject.enetity.Method;
import com.importproject.repository.inter.MethodRepoistoryInter;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wubo
 * @description 查询方法
 * @date 2021/1/16
 */
@Service
public class MethodRepositoryImpl implements MethodRepoistoryInter {

    @Autowired
    MethodMapper methodMapper;
    @Override
    public MethodDTO queryMethod(String methodid) {
        Method method=methodMapper.selectByPrimaryKey(Integer.parseInt(methodid));
        MethodDTO methodDTO=new MethodDTO();
        BeanUtils.copyProperties(method,methodDTO);
        return methodDTO;
    }

    /**
     * @author wubo
     * @description 查询所有方法信息
     * @param
     * @return {@link java.util.List<com.importproject.dto.MethodDTO>}
     * @date 2021/1/16
     */
    @Override
    public List<MethodDTO> queryAllMethod() {
        List<Method> methodList=methodMapper.selectAll();
        List<MethodDTO> methodDTOList=new ArrayList<>();
        for (Method method : methodList) {
            MethodDTO methodDTO=new MethodDTO();
            BeanUtils.copyProperties(method,methodDTO);
            methodDTOList.add(methodDTO);
        }
        return methodDTOList;
    }
}
