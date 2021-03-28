package com.filedown.main;

import com.filedown.main.filedownload.FileDownload;
import com.filedown.main.filedownload.ImageDownload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void main(String[] args) throws IOException {

        FileDownload fd=new ImageDownload();
        fd.fileDownload("http://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=635250081,1124325256&fm=26&gp=0.jpg","C:\\Users\\15478\\Desktop");
        fd.fileDownload("http://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=635250081,1124325256&fm=26&gp=0.jpg","C:\\Users\\15478\\Desktop");
        fd.fileDownload("http://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=635250081,1124325256&fm=26&gp=0.jpg","C:\\Users\\15478\\Desktop");



    }
}
