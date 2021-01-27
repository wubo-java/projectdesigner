package com.importproject.dto;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author wubo
 * @description ftp相关配置参数
 * @date 2021/1/27
 */
public class FtpDTO {

    @Value("${ftpUsername}")
    private String ftpUsername;
    @Value("${ftpPassword}")
    private String ftpPassword;
    @Value(("${ftpHost}"))
    private String ftpHost;
    @Value(("${ftpPort}"))
    private String ftpPort;
    @Value(("${ftpPath}"))
    private String ftpPath;
    @Value(("${localPath}"))
    private String localPath;

    public String getLocalPath() {
        return localPath;
    }

    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    public String getFtpUsername() {
        return ftpUsername;
    }

    public void setFtpUsername(String ftpUsername) {
        this.ftpUsername = ftpUsername;
    }

    public String getFtpPassword() {
        return ftpPassword;
    }

    public void setFtpPassword(String ftpPassword) {
        this.ftpPassword = ftpPassword;
    }

    public String getFtpHost() {
        return ftpHost;
    }

    public void setFtpHost(String ftpHost) {
        this.ftpHost = ftpHost;
    }

    public String getFtpPort() {
        return ftpPort;
    }

    public void setFtpPort(String ftpPort) {
        this.ftpPort = ftpPort;
    }

    public String getFtpPath() {
        return ftpPath;
    }

    public void setFtpPath(String ftpPath) {
        this.ftpPath = ftpPath;
    }
}
