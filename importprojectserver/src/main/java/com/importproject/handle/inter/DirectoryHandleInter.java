package com.importproject.handle.inter;

import com.importproject.dto.DirectoryDTO;
import com.importproject.enetity.Project;

/**
 * @author wubo
 * @description 文件夹handle接口
 * @date 2021/1/16
 */
public interface DirectoryHandleInter {

    public int insertDirectoryInfo(DirectoryDTO directoryDTO);

    public int updateDirectoryInfoById(DirectoryDTO directoryDTO);

    /**
     * 对文件夹路径进行操作
     * @param classpath 绝对磁盘位置
     * @param upperId 上一层的id
     * @param projectEnetity 所属项目对象
     * @return
     */
    public DirectoryDTO  readDirectory(String classpath,Integer upperId, Project projectEnetity);
}
