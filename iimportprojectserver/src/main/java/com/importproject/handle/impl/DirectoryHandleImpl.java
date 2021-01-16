package com.importproject.handle.impl;

import com.importproject.dto.DirectoryDTO;
import com.importproject.handle.inter.DirectoryHandleInter;
import org.springframework.stereotype.Service;

/**
 * @author wubo
 * @description 项目handle实现类
 * @date 2021/1/16
 */
@Service
public class DirectoryHandleImpl implements DirectoryHandleInter {
    /**
     * @author wubo
     * @description 插入文件夹信息。
     * @param directoryDTO
     * @return {@link int}
     * @date 2021/1/16
     */

    @Override
    public int insertDirectoryInfo(DirectoryDTO directoryDTO) {
        return 0;
    }
    /**
     * @author wubo
     * @description 根据文件夹id更新。
     * @param directoryId
     * @return {@link int}
     * @date 2021/1/16
     */

    @Override
    public int updateDirectoryInfoById(String directoryId) {
        return 0;
    }
}
