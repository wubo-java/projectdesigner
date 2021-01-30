package com.importproject.util;

import com.importproject.dto.DirectoryDTO;
import com.importproject.dto.FileDTO;
import com.importproject.handle.inter.DirectoryHandleInter;
import com.importproject.handle.inter.FileHandleInter;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;

/**
 * @author wubo
 * @description 操作文件的工具类
 * @date 2021/1/29
 */
public class FileUtil {

    @Autowired
    DirectoryHandleInter directoryHandleInter;


    @Autowired
    FileHandleInter fileHandleInter;


    /**
     * @author wubo
     * @description 分析文件进入数据库
     * @param projectId
     * @return
     * @date 2021/1/29
     */

    public  void analyFileToDataBase(File file ,int projectId,int id) {
        if(file.isDirectory()){
            DirectoryDTO directoryDTO=new DirectoryDTO();
            directoryDTO.setDirectoryname(file.getName());
            directoryDTO.setProjectidD(projectId);
            directoryDTO.setProjectrootD(file.getPath());
            int upperFileId=directoryHandleInter.insertDirectoryInfo(directoryDTO);
            DirectoryDTO directoryDTOUpdate=new DirectoryDTO();
            directoryDTOUpdate.setDirectoryid_fk(upperFileId);
            directoryDTOUpdate.setDirectoryid(upperFileId);
            directoryHandleInter.updateDirectoryInfoById(directoryDTOUpdate);
            for(File ff : file.listFiles()){
                analyFileToDataBase(ff,projectId,upperFileId);
            }
        }else{
            FileDTO fileDTO=new FileDTO();
            fileDTO.setFilename(file.getName());
            fileDTO.setFiletype(file.getPath().substring(file.getPath().lastIndexOf(".")+1,file.getPath().length()));
            fileDTO.setProjectroot_f(file.getPath());
            fileDTO.setProjectidF(projectId);
            int upperFileId=fileHandleInter.insertFileInfo(fileDTO);
            FileDTO fileDTOUpdate=new FileDTO();
            fileDTOUpdate.setDirectoryid(id);
            fileDTOUpdate.setFileid(upperFileId);
            fileHandleInter.updateFileInfoByID(fileDTOUpdate);
        }
    }
}
