package com.importproject.handle.impl;

import com.importproject.dao.ProjectMapper;
import com.importproject.dto.*;
import com.importproject.enetity.Project;
import com.importproject.handle.inter.DirectoryHandleInter;
import com.importproject.handle.inter.ProjectHandleinter;
import com.importproject.pojo.ProjectPojo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author wubo
 * @description 文件夹handle实现类
 * @date 2021/1/16
 */
@Service
public class ProjectHandleImpl implements ProjectHandleinter {

    @Autowired
    ProjectMapper projectMapper;
    @Autowired
    DirectoryHandleInter directoryHandleInter;
    /**
     * @author wubo
     * @description 根据工程id更新。
     * @param projectDTO
     * @return
     * @date 2021/1/16
     */

    @Override
    public int updateProjectByProjectId(ProjectDTO projectDTO) {
        Project project=new Project();
        BeanUtils.copyProperties(projectDTO,project);
        return projectMapper.updateByPrimaryKeySelective(project);
    }

    /**
     * @author wubo
     * @description 将数据库对象转换为前端ZTree识别的对象。
     * @param
     * @return
     * @date 2021/1/16
     */

    @Override
    public List<ZMenuDTO> copyValue(ProjectPojo projectPojo) {
        List<ZMenuDTO> zMenuDTOList=new ArrayList<>();
      //TODO 将数据库对象转换为ZTree对象。
        List<DirectoryDTO> directoryDTOList=projectPojo.getDirectoryDTOList();
        for (DirectoryDTO directoryDTO : directoryDTOList) {
            ZMenuDTO zMenuDTO=new ZMenuDTO();
            //TODO 转换文件夹信息入zMenuDTO。
        }
        List<FileDTO> fileDTOList=projectPojo.getFileDTOList();
        for (FileDTO fileDTO : fileDTOList) {
            ZMenuDTO zMenuDTO=new ZMenuDTO();
            //TODO 转换文件信息入zMenuDTO。
        }
        List<MethodDTO> methodDTOList=projectPojo.getMethodDTOList();
        for (MethodDTO methodDTO : methodDTOList) {
            ZMenuDTO zMenuDTO=new ZMenuDTO();
            //TODO 转换方法信息入zMenuDTO。
        }
      return zMenuDTOList;
    }

    /**
     *  读取项目最外层文件
     * @param classpath
     * //add by laijinrong 2021/1/19
     */
    @Override
    public ProjectDTO readProject(String classpath) {
        ProjectDTO projectDTO = new ProjectDTO();
        File project = new File(classpath);
        Project projectEnetity = new Project();

        if (project.exists()) {
            //项目信息 add by laijinrong 2021/1/19
            StringBuffer sb = new StringBuffer();
            for(int i = 0 ; i < 5 ; i++){
                sb.append(new Random().nextInt(10));
            }
            Integer projectId = Integer.valueOf(sb.toString());//TODO:连接数据库后，id统一从数据库序列取
            String projectName = project.getName();
            String projectRoot = project.getAbsolutePath();

            //设置项目DTO  add by laijinrong 2021/1/19
            projectDTO.setProjectid(projectId);
            projectDTO.setProjectdesc(projectName);
            projectDTO.setProjectroot(projectRoot);

            //设置enetity 给文件夹下的对象添加项目信息
            projectEnetity.setProjectid(projectId);
            projectEnetity.setProjectdesc(projectName);
            projectEnetity.setProjectroot(projectRoot);

            //遍历文件路径下的所有文件和文件夹 add by laijinrong 2021/1/19
            File[] files = project.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    //文件夹操作
                    directoryHandleInter.readDirectory(file.getAbsolutePath(),projectId,projectEnetity);
                } else {
                    //文件操作
                    System.out.println("文件:" + file.getAbsolutePath());
                }
            }
        } else {
            System.out.println("文件不存在!");
        }

        return projectDTO;
    }

    @Override
    public void AnalyFileToDataBase(String projectRoot, int projectId,int upperFileId) {

    }

    /**
     * @author wubo
     * @description 插入工程信息。
     * @param
     * @return
     * @date 2021/1/16
     */
    @Override
    public int insertProjectInfo(ProjectDTO projectDTO) {
        Project project=new Project();
        BeanUtils.copyProperties(projectDTO, project);
        return projectMapper.insert(project);
    }
}
