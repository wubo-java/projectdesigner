package com.importproject.controller;

import com.importproject.service.inter.FtpServiceInter;
import com.importproject.vo.FtpVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wubo
 * @description ftp文件上传和下载
 * @date 2021/1/27
 */
@RestController
public class FtpController {

    @Autowired
    FtpServiceInter ftpServiceInter;
    @RequestMapping("/queryFile")
    public void upLoadFile(FtpVo ftpVo){
        ftpServiceInter.uploadFile(ftpVo);
    }

    public void downLoadFile(FtpVo ftpVo){
        ftpServiceInter.downloadFile(ftpVo);
    }
}
