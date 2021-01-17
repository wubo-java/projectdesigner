package com.importproject.handle.impl;

import com.importproject.dao.FileMapper;
import com.importproject.dto.FileDTO;
import com.importproject.enetity.File;
import com.importproject.handle.inter.FileHandleInter;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wubo
 * @description 文件handle实现类
 * @date 2021/1/16
 */
@Service
public class FileHandleImpl implements FileHandleInter {

    @Autowired
    FileMapper fileMapper;
    /**
     * @author wubo
     * @description 插入文件信息
     * @param fileDTO
     * @return {@link int}
     * @date 2021/1/16
     */

    @Override
    public int insertFileInfo(FileDTO fileDTO) {
        File file=new File();
        BeanUtils.copyProperties(fileDTO,file);
        return fileMapper.insert(file);
    }


    /**
     * @author wubo
     * @description 根据文件id进行更新
     * @param fileDTO
     * @return {@link int}
     * @date 2021/1/16
     */

    @Override
    public int updateFileInfoByID(FileDTO fileDTO) {
        File file=new File();
        BeanUtils.copyProperties(fileDTO,file);
        return fileMapper.updateByPrimaryKeySelective(file);
    }
}
