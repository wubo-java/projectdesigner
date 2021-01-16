package com.importproject.handle.inter;

import com.importproject.dto.DirectoryDTO;

/**
 * @author wubo
 * @description 文件夹handle接口
 * @date 2021/1/16
 */
public interface DirectoryHandleInter {

    public int insertDirectoryInfo(DirectoryDTO directoryDTO);

    public int updateDirectoryInfoById(String directoryId);
}
