package com.importproject.handle.inter;

import com.importproject.dto.FileDTO;
import com.importproject.enetity.Project;

import java.io.IOException;

/**
 * @author wubo
 * @description 文件handle接口
 * @date 2021/1/16
 */
public interface FileHandleInter {

    public int insertFileInfo(FileDTO fileDTO);

    public int updateFileInfoByID(FileDTO fileDTO);

    /**
     * 对文件夹路径进行操作
     * @param classpath 绝对磁盘位置
     * @param upperId 上一层的id
     * @param projectEnetity 所属项目对象
     * @return
     */
    public FileDTO readFile(String classpath,Integer upperId, Project projectEnetity);
}
