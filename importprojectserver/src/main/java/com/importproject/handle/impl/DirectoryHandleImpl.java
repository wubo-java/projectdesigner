package com.importproject.handle.impl;

import com.importproject.dao.DirectoryMapper;
import com.importproject.dto.DirectoryDTO;
import com.importproject.enetity.Directory;
import com.importproject.enetity.Project;
import com.importproject.handle.inter.DirectoryHandleInter;
import com.importproject.handle.inter.FileHandleInter;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Random;

/**
 * @author wubo
 * @description 项目handle实现类
 * @date 2021/1/16
 */
@Service
public class DirectoryHandleImpl implements DirectoryHandleInter {

    @Autowired
    DirectoryMapper directoryMapper;
    @Autowired
    DirectoryHandleInter directoryHandleInter;
    @Autowired
    FileHandleInter fileHandleInter;

    /**
     * @param directoryDTO
     * @return {@link int}
     * @author wubo
     * @description 插入文件夹信息。
     * @date 2021/1/16
     */

    @Override
    public int insertDirectoryInfo(DirectoryDTO directoryDTO) {
        Directory directory = new Directory();
        BeanUtils.copyProperties(directoryDTO, directory);
        return directoryMapper.insert(directory);
    }

    /**
     * @param directoryDTO
     * @return {@link int}
     * @author wubo
     * @description 根据文件夹id更新。
     * @date 2021/1/16
     */

    @Override
    public int updateDirectoryInfoById(DirectoryDTO directoryDTO) {
        Directory directory = new Directory();
        BeanUtils.copyProperties(directoryDTO, directory);
        directoryMapper.updateByPrimaryKeySelective(directory);
        return 0;
    }

    /**
     * 对文件夹进行读写操作
     * @param path 绝对磁盘位置
     * @param upperId 上一层的id
     * @param projectEnetity 所属项目对象classpath
     * @return
     */
    @Override
    public DirectoryDTO readDirectory(String path, Integer upperId, Project projectEnetity) {
        File directory = new File(path);
        DirectoryDTO directoryDTO = new DirectoryDTO();
        if (directory.exists()) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < 5; i++) {
                sb.append(new Random().nextInt(10));
            }
            Integer directoryId = Integer.valueOf(sb.toString());//add by laijinrong 2021/1/19 TODO:连接数据库后，id统一从数据库序列取
            String directorydesc = "文件夹描述";
            String directoryname = directory.getName();

            directoryDTO.setDirectorydesc(directorydesc);
            directoryDTO.setDirectoryid(directoryId);
            directoryDTO.setDirectoryname(directoryname);
            directoryDTO.setProjectrootD(projectEnetity.getProjectroot());
            directoryDTO.setProjectidD(projectEnetity.getProjectid());
            //存入数据库
            directoryHandleInter.insertDirectoryInfo(directoryDTO);

            //遍历文件路径下的所有文件和文件夹 add by laijinrong 2021/1/19
            File[] files = directory.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    //文件夹操作
                    directoryHandleInter.readDirectory(file.getAbsolutePath(), directoryId, projectEnetity);
                } else {
                    //文件操作
                    fileHandleInter.readFile(file.getAbsolutePath(), directoryId, projectEnetity);
                }
            }
        }
        return directoryDTO;
    }class test2{
    }
}
class t3{}class t4{}

class t5{
    class t6{}} class t7{}


class t8{ class t9{

}
   class t11{}
}


class t111{class tu{}}


class  t10{}

