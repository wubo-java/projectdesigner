package com.importproject.controller;

import com.importproject.dto.DirectoryDTO;
import com.importproject.repository.inter.DirectoryRepositoryInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wubo
 * @description 项目目录controller
 * @date 2021/1/16
 */
@RestController
public class DiretoryController {

    @Autowired
    DirectoryRepositoryInter directoryRepositoryInter;
    /**
     * @author wubo
     * @description 查询单个文件夹信息
     * @param directoryid
     * @return {@link DirectoryDTO}
     * @date 2021/1/16
     */
     
    @RequestMapping("/queryDirectory")
    public DirectoryDTO queryDirectory(String directoryid){
        return directoryRepositoryInter.queryDirectory(directoryid);
    }
}
