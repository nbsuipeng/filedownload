package com.filedown.main.filedownload;

import com.sun.deploy.net.HttpRequest;

import java.io.*;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ImageDownload implements FileDownload {
    private URL u;



    @Override
    public boolean fileDownload(String url,String des) throws IOException {
        //解析url

        u=new URL(url);
        long l = System.currentTimeMillis();
//        URLConnection urlConnection = u.openConnection();

        long l1 = System.currentTimeMillis();
        System.out.println("连接"+u.getFile()+"资源耗时:"+(l1-l)+"毫秒");

        l = System.currentTimeMillis();
        InputStream inputStream = u.openStream();
        l1 = System.currentTimeMillis();
        System.out.println("连接"+u.getFile()+"资源耗时:"+(l1-l)+"毫秒");
        //目录不存在就创造
        File f=new File(des);
        if(!f.exists()) f.mkdirs();


        FileOutputStream fos=new FileOutputStream(des+"\\"+String.valueOf(System.currentTimeMillis())+".jpg");
        /**
         * 创建缓冲区
         */
        byte[] buffer=new byte[1024];
        int len;
        /**
         * 下载文件
         */
        while((len=inputStream.read(buffer))!=-1)
        {
            fos.write(buffer,0,len);
        }
        /**
         * 关闭连接
         */
        inputStream.close();
        fos.close();

        System.out.println("下载成功:"+u.getFile());
        return true;




    }
}
