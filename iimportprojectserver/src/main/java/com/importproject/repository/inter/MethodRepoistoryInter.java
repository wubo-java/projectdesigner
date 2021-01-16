package com.importproject.repository.inter;

import com.importproject.dto.MethodDTO;

import java.util.List;

/**
 * @author wubo
 * @description 方法repoistory
 * @date 2021/1/16
 */
public interface MethodRepoistoryInter {

     
    public MethodDTO queryMethod(String methodid);


    public List<MethodDTO> queryAllMethod(String fileid);

}
