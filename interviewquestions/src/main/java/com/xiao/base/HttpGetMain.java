package com.xiao.base;

import java.io.Closeable;
import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.util.EntityUtils;

import com.xiao.base.SSLClient;

public class HttpGetMain {
    public static String getHttpGetResult(String url) {
        // 获取连接客户端工具
        HttpClient httpClient = null;
        HttpRequestBase httpReq = null;
        CloseableHttpResponse response = null;
        String entityStr = null;
        try {
            try {
                httpClient = new SSLClient();
            } catch (Exception e) {
                e.printStackTrace();
            }
            // 根据带参数的URI对象构建GET请求对象
            HttpGet httpGet = new HttpGet(url);
            // httpReq = httpGet;

            // 执行请求
            response = (CloseableHttpResponse) httpClient.execute(httpGet);
            // 获得响应的实体对象
            HttpEntity entity = response.getEntity();
            // 使用Apache提供的工具类进行转换成字符串
            if (entity != null) {
                entityStr = EntityUtils.toString(entity, "UTF-8");
            }
        } catch (ClientProtocolException e) {
            System.err.println("Http协议出现问题");
            e.printStackTrace();
        } catch (ParseException e) {
            System.err.println("解析错误");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("IO异常");
            e.printStackTrace();
        } finally {
            // 释放连接
            if (null != response) {
                try {
                    response.close();
                    ((Closeable) httpClient).close();
                } catch (IOException e) {
                    System.err.println("释放连接出错");
                    e.printStackTrace();
                }
            }
        }

        return entityStr;
    }


    public static void main(String[] args) {
//        String result = getHttpGetResult("https://app.bzlrobot.com/app_platform/api/user/getAccessToken");
        String result = getHttpGetResult("https://app.bzlrobot.com/app_platform/api/user/getUserInfo?accessToken=FP89h5RxgG9fj9woL2geEeHyEnJ1OiCB&ticket=123");
        System.out.println(result);
    }
}