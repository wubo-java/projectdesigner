package com.importproject.repository.inter;

import com.importproject.dto.FileDTO;

import java.util.List;

/**
 * @author wubo
 * @description 文件repository
 * @date 2021/1/16
 */
public interface FileRepositoryInter {


    public FileDTO queryFile(String fileid);


    public List<FileDTO> queryAllFile();

}
