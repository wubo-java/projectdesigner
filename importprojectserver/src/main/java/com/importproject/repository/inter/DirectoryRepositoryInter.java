package com.importproject.repository.inter;

import com.importproject.dto.DirectoryDTO;

import java.util.List;

/**
 * @author wubo
 * @description 文件夹repository
 * @date 2021/1/16
 */
public interface DirectoryRepositoryInter {

    public DirectoryDTO queryDirectory(String directoryid);

    public List<DirectoryDTO> queryAllDirectory();

}
