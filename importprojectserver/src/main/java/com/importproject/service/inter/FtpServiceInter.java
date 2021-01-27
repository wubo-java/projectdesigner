package com.importproject.service.inter;

import com.importproject.vo.FtpVo;

/**
 * @author wubo
 * @description Ftp文件上传下载interface
 * @date 2021/1/27
 */
public interface FtpServiceInter {
    public void uploadFile(FtpVo ftpVo);
    public void downloadFile(FtpVo ftpVo);
}
