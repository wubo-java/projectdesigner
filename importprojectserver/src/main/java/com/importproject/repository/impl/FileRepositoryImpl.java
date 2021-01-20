package com.importproject.repository.impl;

import com.importproject.dao.FileMapper;
import com.importproject.dto.FileDTO;
import com.importproject.enetity.File;
import com.importproject.repository.inter.FileRepositoryInter;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wubo
 * @description 文件查询
 * @date 2021/1/16
 */
@Service
public class FileRepositoryImpl  implements FileRepositoryInter {

    @Autowired
    FileMapper fileMapper;
    /**
     * @author wubo
     * @description 根据文件id查询文件信息
     * @param fileid
     * @return {@link com.importproject.dto.FileDTO}
     * @date 2021/1/16
     */
    @Override
    public FileDTO queryFile(String fileid) {
        File file=fileMapper.selectByPrimaryKey(Integer.parseInt(fileid));
        FileDTO fileDTO=new FileDTO();
        BeanUtils.copyProperties(file,fileDTO);
        return fileDTO;
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
        List<File> fileList=fileMapper.selectAll();
        List<FileDTO> fileDTOList=new ArrayList<>();
        for (File file : fileList) {
            FileDTO fileDTO=new FileDTO();
            BeanUtils.copyProperties(file,fileDTO);
            fileDTOList.add(fileDTO);
        }
        return fileDTOList;
    }
}
