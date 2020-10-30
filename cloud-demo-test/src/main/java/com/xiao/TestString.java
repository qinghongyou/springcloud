package com.xiao;

public class TestString {

    public static void main(String[] args) {
        String redirect_uri = "http://kms.bzlrobot.com/" + "?"
                + "null";;
        if (redirect_uri.indexOf("kms.bzlrobot.com")!=-1){
            redirect_uri = redirect_uri.replaceAll("http","https");

        }else{}
        System.out.println("redirect_uri 2:"+redirect_uri);
    }

}
