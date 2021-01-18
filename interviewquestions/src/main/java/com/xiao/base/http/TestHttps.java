package com.xiao.base.http;

public class TestHttps {

    public static void main(String[] args) {
        String redirect_uri = "http:kms.countrygarden.com.cn";
        if(redirect_uri.indexOf("https")==-1){
            if (redirect_uri.indexOf("kms.bzlrobot.com")!=-1){
                redirect_uri = redirect_uri.replaceAll("http","https");
            }else{}
            if (redirect_uri.indexOf("kms.countrygarden.com.cn")!=-1){
                redirect_uri = redirect_uri.replaceAll("http","https");
            }
        }
        System.out.println(redirect_uri);
    }
}
