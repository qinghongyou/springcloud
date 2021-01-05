package com.xiao;

import com.alibaba.fastjson.JSONObject;

public class JsonTest {

    public static void main(String[] args) {
        jsonToStr();
        personObj();
    }


    // json 转 string
    public static void jsonToStr(){
        String fdId = "12345678912345678912345678912345";
        String fdNumber = "NH123456789";
        JSONObject result = new JSONObject();
        result.put("fdId", fdId);
        result.put("fdNumber", fdNumber);
        System.out.println("result = "+result);
        String jsonStr = JSONObject.toJSONString(result);
        System.out.println("jsonStr = "+jsonStr);
    }

    // Person 对象
    public static void personObj(){
        Person person = new Person();
        person.setName("wjw");
        person.setAge(22);
        person.setSex("男");
        person.setSchool("商职");
        String personStr = JSONObject.toJSONString(person);  // 转换为json字符串
        System.out.println("personStr:"+personStr);
        JSONObject personObject = JSONObject.parseObject(personStr);  // 转换为json对象
        System.out.println("personObject:"+personObject);
        System.out.println("name:"+personObject.getString("name"));
    }
}
