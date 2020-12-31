package com.xiao.base;

public class BslTest {

    public static void main(String[] args) {
        String redirect_uri = "/third/pda/indexdefault.jsp";
        if (redirect_uri.indexOf("")!=-1){
            boolean flag = redirect_uri.indexOf("https")!=-1;
            if(!flag){
                redirect_uri = redirect_uri.replaceAll("http","https");
            }
        }
        System.out.println(redirect_uri);
    }

}
