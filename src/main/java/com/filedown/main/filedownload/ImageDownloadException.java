package com.filedown.main.filedownload;

import java.net.MalformedURLException;

public class ImageDownloadException extends MalformedURLException {
    @Override
    public void printStackTrace() {
        System.out.println("图片连接有错！");
        super.printStackTrace();
    }
}
