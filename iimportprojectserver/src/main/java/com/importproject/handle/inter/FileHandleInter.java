package com.importproject.handle.inter;

import com.importproject.dto.FileDTO;

/**
 * @author wubo
 * @description 文件handle接口
 * @date 2021/1/16
 */
public interface FileHandleInter {

    public int insertFileInfo(FileDTO fileDTO);

    public int updateFileInfoByID(String fileId);
    

}
