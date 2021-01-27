package com.xiao.base;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;

public class TestJson {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        String str = "[{\"docId\":\"176ecf2a79cb80852378a9d458a8c8a5\",\"subject\":\"测试签名17\",\"isCreator\":\"true\",\"checked\":true,\"openRight\":\"true\",\"fdModelName\":\"com.landray.kmss.kms.multidoc.model.KmsMultidocKnowledge\"},{\"docId\":\"176da6a59e0d9bcea900e764dc1bd75b\",\"subject\":\"测试签名10\",\"isCreator\":\"true\",\"checked\":true,\"openRight\":\"true\",\"fdModelName\":\"com.landray.kmss.kms.multidoc.model.KmsMultidocKnowledge\"}]";
        JSONArray jsonArray = JSONArray.parseArray(str);
        if(jsonArray.size()>0){
            for(int i=0;i<jsonArray.size();i++){
                JSONObject json = jsonArray.getJSONObject(i);
                String docId = (String) json.get("docId");
                list.add(docId);
            }
        }
        System.out.println(list);

    }
}
