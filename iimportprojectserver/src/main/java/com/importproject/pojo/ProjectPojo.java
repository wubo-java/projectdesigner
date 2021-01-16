package com.importproject.pojo;

import com.importproject.dto.DirectoryDTO;
import com.importproject.dto.FileDTO;
import lombok.Data;

import java.util.List;

/**
 * @author wubo
 * @description 项目pojo
 * @date 2021/1/16
 */
@Data
public class ProjectPojo {
    private List<FileDTO> fileDTOList;
    private List<DirectoryDTO> directoryDTOList;
}
