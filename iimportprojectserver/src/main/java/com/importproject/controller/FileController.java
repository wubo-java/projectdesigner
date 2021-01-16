package com.importproject.controller;

import com.importproject.dto.FileDTO;
import com.importproject.repository.inter.FileRepositoryInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wubo
 * @description 文件controller
 * @date 2021/1/16
 */
@RestController
public class FileController {

    @Autowired
    FileRepositoryInter fileRepositoryInter;
    /**
     * @author wubo
     * @description 查询单个文件信息
     * @param fileid
     * @return {@link com.importproject.dto.FileDTO}
     * @date 2021/1/16
     */
     
    @RequestMapping("/queryFile")
    public FileDTO queryFile(String fileid){
        return fileRepositoryInter.queryFile(fileid);
    }
}
