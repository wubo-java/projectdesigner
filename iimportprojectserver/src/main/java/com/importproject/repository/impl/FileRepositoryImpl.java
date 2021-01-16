package com.importproject.repository.impl;

import com.importproject.dto.FileDTO;
import com.importproject.repository.inter.FileRepositoryInter;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wubo
 * @description 文件查询
 * @date 2021/1/16
 */
@Service
public class FileRepositoryImpl  implements FileRepositoryInter {

    /**
     * @author wubo
     * @description 根据文件id查询文件信息
     * @param fileid
     * @return {@link com.importproject.dto.FileDTO}
     * @date 2021/1/16
     */
    @Override
    public FileDTO queryFile(String fileid) {
        return null;
    }

    /**
     * @author wubo
     * @description 查询所有文件信息
     * @param
     * @return {@link java.util.List<com.importproject.dto.FileDTO>}
     * @date 2021/1/16
     */

    @Override
    public List<FileDTO> queryAllFile() {
        return null;
    }
}
