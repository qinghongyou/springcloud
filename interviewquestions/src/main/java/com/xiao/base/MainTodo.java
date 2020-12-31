package com.xiao.base;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MainTodo {


    public static void main(String [] args ) throws Exception {
        long startTime = System.currentTimeMillis();
        for(int i=0;i<50;i++){
            System.out.println("i=  "+i);
            httpPost();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("执行时间："+(endTime-startTime)/1000 +"秒");
    }



    // get请求
    // 实际的请求头设置还不完善，以后再补充
    public static void httpGet() throws IOException {
//        HttpClient client = new HttpClient();
//        GetMethod getMethod = new GetMethod("http://。。。");
//        int i = client.executeMethod(getMethod);
//        System.out.println(new String(getMethod.getResponseBody()));
    }

    public static String todoString(int length){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    // 向第三方接口发送一个post 请求的参数的看具体的要求，该接口想要的数据是什么类型，如果是json，那就把参数转换为json类型，其他的转换为其它类型，如阿里的接口参数就有的不是json类型
    public static void httpPost() throws Exception {

        // json格式的参数，我们可以用map来封装参数，然后将参数转换为json格式
        //Map<String ,Object> params = new HashMap<>();
        JSONObject params = new JSONObject();
        JSONObject arg0 = new JSONObject();
        arg0.put("key", todoString(12));
        arg0.put("link", "http://www.baidu.com");
        arg0.put("type", "1");
        arg0.put("level", "3");
        arg0.put("ztxfl", "01");
        arg0.put("param1", "ff99959c-0aaf-4635-a97f-6bf19f5def82");
        arg0.put("param2", "cc66959c-0aaf-4635-a97f-6bf19f5def82");
        int j = (int)((Math.random()*8)+1);
        System.out.println("j="+j);
        if(j==1){
            arg0.put("appName", "slxt");
            arg0.put("modelName", "slxt");
            arg0.put("targets", "{\"LoginName\":\"youqinghong\"}");
            arg0.put("docCreator", "{\"LoginName\":\"landray01\"}");
        } else if(j==2){
            arg0.put("appName", "H3");
            arg0.put("modelName", "H3");
            arg0.put("targets", "{\"LoginName\":\"lvzhichao01\"}");
            arg0.put("docCreator", "{\"LoginName\":\"landray01\"}");
        } else if(j==3){
            arg0.put("appName", "BPMS");
            arg0.put("modelName", "BPMS");
            arg0.put("targets", "{\"LoginName\":\"zycshiyan\"}");
            arg0.put("docCreator", "{\"LoginName\":\"youqinghong\"}");
        } else if(j==4){
            arg0.put("appName", "BPMSOSC");
            arg0.put("modelName", "BPMSOSC");
            arg0.put("targets", "{\"LoginName\":\"xiongqingchun10\"}");
            arg0.put("docCreator", "{\"LoginName\":\"youqinghong\"}");
        } else if(j==5){
            arg0.put("appName", "myerp");
            arg0.put("modelName", "myerp");
            arg0.put("targets", "{\"LoginName\":\"landray01\"}");
            arg0.put("docCreator", "{\"LoginName\":\"xiongqingchun10\"}");
        } else if(j==6){
            arg0.put("appName", "NC6");
            arg0.put("modelName", "NC6");
            arg0.put("targets", "{\"LoginName\":\"yuting27\"}");
            arg0.put("docCreator", "{\"LoginName\":\"youqinghong\"}");
        } else if(j==7){
            arg0.put("appName", "myerp");
            arg0.put("modelName", "myerp");
            arg0.put("targets", "{\"LoginName\":\"chenqianbin\"}");
            arg0.put("docCreator", "{\"LoginName\":\"yuting27\"}");
        } else {
            arg0.put("appName", "NC6");
            arg0.put("modelName", "NC6");
            arg0.put("targets", "{\"LoginName\":\"zengjiajun01\"}");
            arg0.put("docCreator", "{\"LoginName\":\"chenqianbin\"}");
        }
        arg0.put("modelId", todoString(12));
        arg0.put("subject", "测试长度测试长度测试"+j);
        arg0.put("deadlineR", "");
        arg0.put("deadlineY", "");
        arg0.put("deadline","1");
        arg0.put("isdeadline","1");
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        arg0.put("createTime", sdf1.format(date));// yyyy-MM-dd HH:mm:ss
        arg0.put("mobileLink", "http://www.baidu.com");
        params.put("arg0",arg0);
        String paramsJson = JSON.toJSONString(params); // 将参数转换为json字符串
        System.out.println(paramsJson);

        //String params="{\"articleID\":44,\"columnID\":44,\"desColumnID\":44,\"title\":\"44\",\"subTitle\":\"44\",\"leadTitle\":\"44\",\"abstract\":\"44\",\"articleType\":0,\"source\":44\",\"tag\":\"44\",\"optUser\":\"44\",\"author\":\"44\",\"editor\":\"44\",\"liability\":\"44\",\"status\":1,\"content\":\"44\",\"imgUrl\":\"http://dev-file.aimingtai.com/webdata/45/images/2018/0829/15355154473121002.jpg\"}";


        // 服务端通常是根据请求头（headers）中的 Content-Type 字段来获知请求中的消息主体是用何种方式编码，再对主体进行解析。所以说到 POST 提交数据方案，包含了 Content-Type 和消息主体编码方式两部分
        HttpClient client = new HttpClient(); // 客户端实例化
        PostMethod postMethod = new PostMethod("https://opentest-api.bgy.com.cn/env-101/por-2903/bip/todo/BipSB/Bip/Todo/ProxyServices/BipTodoDeliveryRestProxy"); // 请求方法post，可以将请求路径传入构造参数中
        postMethod.addRequestHeader("Content-type", "application/json; charset=utf-8");
        postMethod.addRequestHeader("apikey","ybFXLBBg6FQNLiy3rPJpMRwS6SokhUe4");


        byte[] requestBytes = paramsJson.getBytes("utf-8"); // 将参数转为二进制流
        InputStream inputStream = new ByteArrayInputStream(requestBytes, 0,
                requestBytes.length);
        RequestEntity requestEntity = new InputStreamRequestEntity(inputStream,
                requestBytes.length, "application/json; charset=utf-8"); // 请求体
        postMethod.setRequestEntity(requestEntity);   // 将参数放入请求体

        int i = client.executeMethod(postMethod);  // 执行方法
        System.out.println("请求状态"+i);
        // 这里因该有判断的，根据请求状态判断请求是否成功，然后根据第三方接口返回的数据格式，解析出我们需要的数据

        byte[] responseBody = postMethod.getResponseBody(); // 得到相应数据
        String s = new String(responseBody);
        System.out.println(s);

    }



}


