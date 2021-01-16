package com.importproject.repository.impl;

import com.importproject.dto.MethodDTO;
import com.importproject.repository.inter.MethodRepoistoryInter;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wubo
 * @description 查询方法
 * @date 2021/1/16
 */
@Service
public class MethodRepositoryImpl implements MethodRepoistoryInter {

    @Override
    public MethodDTO queryMethod(String methodid) {
        return null;
    }

    /**
     * @author wubo
     * @description 查询所有方法信息
     * @param fileid
     * @return {@link java.util.List<com.importproject.dto.MethodDTO>}
     * @date 2021/1/16
     */
    @Override
    public List<MethodDTO> queryAllMethod(String fileid) {
        return null;
    }
}
