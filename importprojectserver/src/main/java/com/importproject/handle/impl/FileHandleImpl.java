package com.importproject.handle.impl;

import com.importproject.dao.FileMapper;
import com.importproject.dto.FileDTO;
import com.importproject.enetity.File;
import com.importproject.enetity.Project;
import com.importproject.handle.inter.FileHandleInter;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author wubo
 * @description 文件handle实现类
 * @date 2021/1/16
 */
@Service
public class FileHandleImpl implements FileHandleInter {

    @Autowired
    FileMapper fileMapper;
    @Autowired
    FileHandleInter fileHandleInter;
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

    /**
     * 对文件夹路径进行操作
     * @param classpath 绝对磁盘位置
     * @param upperId 上一层的id
     * @param projectEnetity 所属项目对象
     * @return
     */
    @Override
    public FileDTO readFile(String classpath, Integer upperId, Project projectEnetity){
        java.io.File file = new java.io.File(classpath);
        FileDTO fileDTO = new FileDTO();
        if(file.exists()){
            StringBuffer sb = new StringBuffer();
            for(int i = 0 ; i < 5 ; i++){
                sb.append(new Random().nextInt(10));
            }
            Integer fileId =  Integer.valueOf(sb.toString());//add by laijinrong 2021/1/19 TODO:连接数据库后，id统一从数据库序列取
            String fileDesc = "文件描述";
            String fileName = file.getName();
            String fileType = fileName.substring(fileName.lastIndexOf(".")+1);

            fileDTO.setFiledesc(fileDesc);
            fileDTO.setFileid(fileId);
            fileDTO.setFilename(fileName);
            fileDTO.setFiletype(fileType);
            fileDTO.setProjectidF(projectEnetity.getProjectid());
            fileDTO.setProjectroot_f(projectEnetity.getProjectroot());
            //存入数据库
            fileHandleInter.insertFileInfo(fileDTO);

            //TODO:对文件类型进行判断
            if(".java".equals(fileType)){
                //反射拿到方法名
            }
        }
        return fileDTO;
    }
}
