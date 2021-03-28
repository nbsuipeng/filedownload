package com.filedown.main;

import com.filedown.main.filedownload.FileDownload;
import com.filedown.main.filedownload.ImageDownload;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileDownload fd=new ImageDownload();
        boolean flag=fd.fileDownload("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=635250081,1124325256&fm=26&gp=0.jpg","/");
        System.out.println(flag?"下载成功":"下载失败");
    }
}
