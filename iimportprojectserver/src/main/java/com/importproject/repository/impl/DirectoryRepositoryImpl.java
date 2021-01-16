package com.importproject.repository.impl;

import com.importproject.dto.DirectoryDTO;
import com.importproject.repository.inter.DirectoryRepositoryInter;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wubo
 * @description 文件夹查询
 * @date 2021/1/16
 */
@Service
public class DirectoryRepositoryImpl implements DirectoryRepositoryInter {

    /**
     * @author wubo
     * @description 查询项目文件夹信息
     * @param directoryid
     * @return {@link DirectoryDTO}
     * @date 2021/1/16
     */
    @Override
    public DirectoryDTO queryDirectory(String directoryid) {
        return null;
    }

    /**
     * @author wubo
     * @description  查询项目所有文件夹信息
     * @param
     * @return {@link List< DirectoryDTO>}
     * @date 2021/1/16
     */

    @Override
    public List<DirectoryDTO> queryAllDirectory() {
        return null;
    }
}
