package com.xiao.controller;


import com.xiao.entity.UserEntity;
import com.xiao.utils.RedisUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 */
@Slf4j
@RequestMapping("/redis")
@RestController
public class RedisController {

    private static int ExpireTime = 60;   // redis中存储的过期时间60s

    @RequestMapping("expire")
    public boolean expire(String key){
        return redisUtil.expire(key,ExpireTime);
    }

    @Resource
    private RedisUtils redisUtil;

    // 设置对象
    @RequestMapping("setObj")
    public boolean redisSetObj(String key){
        UserEntity userEntity =new UserEntity();
        userEntity.setId(Long.valueOf(1));
        userEntity.setGuid(String.valueOf(1));
        userEntity.setName("zhangsan"+key);
        userEntity.setAge(String.valueOf(20));
        userEntity.setCreateTime(new Date());
        return redisUtil.set(key,userEntity);
    }

    // 获取对象
    @RequestMapping("getObj")
    public Object redisGetObj(String key){
        return redisUtil.get(key);
    }

    // 设置字符串
    @RequestMapping("setString")
    public boolean redisSetString(String key, String value){
        return redisUtil.set(key,value);
    }

    // 获取字符串
    @RequestMapping("getString")
    public Object redisGetString(String key){
        return redisUtil.get(key);
    }
}

