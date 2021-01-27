package com.importproject.util;

import com.importproject.dto.FtpDTO;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

import java.io.*;
import java.net.SocketException;

/**
 * @author wubo
 * @description 文件上传与下载
 * @date 2021/1/27
 */
public class FtpUtil {

    /**
     * @author wubo
     * @description ftp文件上传
     * @param ftpDTO
     * @param fileName
     * @param localFilePath
     * @return {@link boolean}
     * @date 2021/1/27
     */

    public  boolean uploadFile(FtpDTO ftpDTO,
                               String fileName, String localFilePath) {
        boolean success = false;
        FTPClient ftpClient = getFTPClient(ftpDTO.getFtpHost(),ftpDTO.getFtpUsername(),ftpDTO.getFtpPassword(),Integer.parseInt(ftpDTO.getFtpPort()));
        File file=new File(localFilePath);
        try {
            int reply;
            InputStream input=new FileInputStream(file);
            reply = ftpClient.getReplyCode();
            if (!FTPReply.isPositiveCompletion(reply)) {
                ftpClient.disconnect();
                return success;
            }
            ftpClient.setControlEncoding("UTF-8"); // 中文支持
            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
            ftpClient.enterLocalPassiveMode();
            ftpClient.changeWorkingDirectory(ftpDTO.getFtpPath());

            ftpClient.storeFile(fileName, input);

            input.close();
            ftpClient.logout();
            success = true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ftpClient.isConnected()) {
                try {
                    ftpClient.disconnect();
                } catch (IOException ioe) {
                }
            }
        }
        return success;
    }

    /**
     * @author wubo
     * @description  ftp文件下载
     * @param ftpDTO
     * @param fileName
     * @return
     * @date 2021/1/27
     */

    public  void downloadFtpFile(FtpDTO ftpDTO, String fileName) {

        FTPClient ftpClient = null;

        try {
            ftpClient = getFTPClient(ftpDTO.getFtpHost(), ftpDTO.getFtpUsername(), ftpDTO.getFtpPassword(), Integer.parseInt(ftpDTO.getFtpPort()));
            ftpClient.setControlEncoding("UTF-8"); // 中文支持
            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
            ftpClient.enterLocalPassiveMode();
            ftpClient.changeWorkingDirectory(ftpDTO.getFtpPath());

            File localFile = new File(ftpDTO.getLocalPath() + File.separatorChar + fileName);
            OutputStream os = new FileOutputStream(localFile);
            ftpClient.retrieveFile(fileName, os);
            os.close();
            ftpClient.logout();

        } catch (FileNotFoundException e) {
            System.out.println("没有找到" + ftpDTO.getFtpPath() + "文件");
            e.printStackTrace();
        } catch (SocketException e) {
            System.out.println("连接FTP失败.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件读取错误。");
            e.printStackTrace();
        }

    }

    /**
     * @author wubo
     * @description 连接ftp
     * @param ftpHost
     * @param ftpUserName
     * @param ftpPassword
     * @param ftpPort
     * @return {@link org.apache.commons.net.ftp.FTPClient}
     * @date 2021/1/27
     */

    public FTPClient getFTPClient(String ftpHost, String ftpUserName,
                                  String ftpPassword, int ftpPort) {
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient = new FTPClient();
            ftpClient.connect(ftpHost, ftpPort);// 连接FTP服务器
            ftpClient.login(ftpUserName, ftpPassword);// 登陆FTP服务器
            if (!FTPReply.isPositiveCompletion(ftpClient.getReplyCode())) {
                System.out.println("未连接到FTP，用户名或密码错误。");
                ftpClient.disconnect();
            } else {
                System.out.println("FTP连接成功。");
            }
        } catch (SocketException e) {
            e.printStackTrace();
            System.out.println("FTP的IP地址可能错误，请正确配置。");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("FTP的端口错误,请正确配置。");
        }
        return ftpClient;
    }
}
