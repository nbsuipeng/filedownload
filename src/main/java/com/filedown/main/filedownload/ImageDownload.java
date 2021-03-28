package com.filedown.main.filedownload;

import com.sun.deploy.net.HttpRequest;

import java.io.*;
import java.lang.reflect.Field;
import java.net.*;

public class ImageDownload implements FileDownload {
    private URL u;



    @Override
    public boolean fileDownload(String url,String des) throws IOException {
        //解析url

        u=new URL(url);
        long l = System.currentTimeMillis();
        //打开链接
        URLConnection urlConnection = u.openConnection();
        /**
         * 设置超时时间
         */
        urlConnection.setConnectTimeout(2000);
        long l1 = System.currentTimeMillis();
        System.out.println("连接"+u.getFile()+"资源耗时:"+(l1-l)+"毫秒");

        l = System.currentTimeMillis();
        InputStream inputStream=null;
        try
        {
            inputStream= urlConnection.getInputStream();
        }catch (SocketTimeoutException e)
        {
            //e.printStackTrace();
            //连接失败，返回false
            System.out.println(u.getFile()+"下载失败");
            return false;
        }
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
