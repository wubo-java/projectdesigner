package com.importproject.handle.impl;

import com.importproject.dto.FileDTO;
import com.importproject.handle.inter.FileHandleInter;
import org.springframework.stereotype.Service;

/**
 * @author wubo
 * @description 文件handle实现类
 * @date 2021/1/16
 */
@Service
public class FileHandleImpl implements FileHandleInter {
    /**
     * @author wubo
     * @description 插入文件信息
     * @param fileDTO
     * @return {@link int}
     * @date 2021/1/16
     */

    @Override
    public int insertFileInfo(FileDTO fileDTO) {
        return 0;
    }


    /**
     * @author wubo
     * @description 根据文件id进行更新
     * @param fileId
     * @return {@link int}
     * @date 2021/1/16
     */

    @Override
    public int updateFileInfoByID(String fileId) {
        return 0;
    }
}
