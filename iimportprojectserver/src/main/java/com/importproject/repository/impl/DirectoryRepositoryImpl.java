package com.importproject.repository.impl;

import com.importproject.dao.DirectoryMapper;
import com.importproject.dto.DirectoryDTO;
import com.importproject.enetity.Directory;
import com.importproject.repository.inter.DirectoryRepositoryInter;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wubo
 * @description 文件夹查询
 * @date 2021/1/16
 */
@Service
public class DirectoryRepositoryImpl implements DirectoryRepositoryInter {

    @Autowired
    DirectoryMapper directoryMapper;
    /**
     * @author wubo
     * @description 查询项目文件夹信息
     * @param directoryid
     * @return {@link DirectoryDTO}
     * @date 2021/1/16
     */
    @Override
    public DirectoryDTO queryDirectory(String directoryid) {
        Directory directory=directoryMapper.selectByPrimaryKey(Integer.parseInt(directoryid));
        DirectoryDTO directoryDTO=new DirectoryDTO();
        BeanUtils.copyProperties(directory,directoryDTO);
        return directoryDTO;
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
        List<Directory> directoryList=directoryMapper.selectAll();
        List<DirectoryDTO> directoryDTOList=new ArrayList<>();
        for (Directory project : directoryList) {
            DirectoryDTO directoryDTO=new DirectoryDTO();
            BeanUtils.copyProperties(project,directoryDTO);
            directoryDTOList.add(directoryDTO);
        }
        return directoryDTOList;
    }
}
