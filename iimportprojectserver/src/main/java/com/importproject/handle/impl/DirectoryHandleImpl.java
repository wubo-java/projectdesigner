package com.importproject.handle.impl;

import com.importproject.dao.DirectoryMapper;
import com.importproject.dto.DirectoryDTO;
import com.importproject.enetity.Directory;
import com.importproject.handle.inter.DirectoryHandleInter;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wubo
 * @description 项目handle实现类
 * @date 2021/1/16
 */
@Service
public class DirectoryHandleImpl implements DirectoryHandleInter {

    @Autowired
    DirectoryMapper directoryMapper;
    /**
     * @author wubo
     * @description 插入文件夹信息。
     * @param directoryDTO
     * @return {@link int}
     * @date 2021/1/16
     */

    @Override
    public int insertDirectoryInfo(DirectoryDTO directoryDTO) {
        Directory directory=new Directory();
        BeanUtils.copyProperties(directoryDTO,directory);
        return directoryMapper.insert(directory);
    }
    /**
     * @author wubo
     * @description 根据文件夹id更新。
     * @param directoryDTO
     * @return {@link int}
     * @date 2021/1/16
     */

    @Override
    public int updateDirectoryInfoById(DirectoryDTO directoryDTO) {
        Directory directory=new Directory();
        BeanUtils.copyProperties(directoryDTO,directory);
        directoryMapper.updateByPrimaryKeySelective(directory);
        return 0;
    }
}
