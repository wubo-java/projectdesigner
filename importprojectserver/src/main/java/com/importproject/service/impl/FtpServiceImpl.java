package com.importproject.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.importproject.dto.FtpDTO;
import com.importproject.service.inter.FtpServiceInter;
import com.importproject.util.FtpUtil;
import com.importproject.vo.FtpVo;
import org.springframework.stereotype.Service;

/**
 * @author wubo
 * @description Ftp文件上传下载impl
 * @date 2021/1/27
 */
@Service
public class FtpServiceImpl implements FtpServiceInter {
    @Override
    public void uploadFile(FtpVo ftpVo) {
        JSONArray jsonArray= JSONObject.parseArray(ftpVo.getFileList());
        for (Object o : jsonArray) {
            JSONObject jsonObject=(JSONObject) o;
            String name=jsonObject.get("name").toString();
            String url=jsonObject.get("url").toString(); FtpUtil ftpUtil=new FtpUtil();
            FtpDTO ftpDTO=new FtpDTO();
            ftpUtil.uploadFile(ftpDTO,name,url);
        }
    }

    @Override
    public void downloadFile(FtpVo ftpVo) {
        JSONArray jsonArray=JSONObject.parseArray(ftpVo.getFileList());
        for (Object o : jsonArray) {
            JSONObject jsonObject=(JSONObject) o;
            String name=jsonObject.get("name").toString();
            String url=jsonObject.get("url").toString(); FtpUtil ftpUtil=new FtpUtil();
            FtpDTO ftpDTO=new FtpDTO();
            ftpUtil.downloadFtpFile(ftpDTO,name);
        }
    }
}
