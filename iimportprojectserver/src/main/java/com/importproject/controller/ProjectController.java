package com.importproject.controller;

import com.importproject.dto.ProjectDTO;
import com.importproject.dto.ZMenuDTO;
import com.importproject.service.inter.ImportprojectServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wubo
 * @description 项目模块controller
 * @date 2021/1/16
 */
@RestController
public class ProjectController {
    @Autowired
    ImportprojectServiceInter importprojectServiceInter;
    @RequestMapping("/importProject")
    public String importProject(){
        return null;
    }


   /**
    * @author wubo
    * @description 查询工程信息
    * @param projectid
    * @return {@link java.util.List<com.importproject.dto.ZMenuDTO>}
    * @date 2021/1/16
    */
    @RequestMapping("/queryProjectPojoInfo")
    public List<ZMenuDTO> queryProjectPojoInfo(String projectid){
        return null;
    }

    /**
     * @author wubo
     * @description 查询详情信息。
     * @param projectid
     * @return {@link ProjectDTO}
     * @date 2021/1/16
     */
    @RequestMapping("/queryProject")
    public ProjectDTO queryProject(String projectid){
        return null;
    }


}
