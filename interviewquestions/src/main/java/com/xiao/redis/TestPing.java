package com.xiao.redis;

import redis.clients.jedis.Jedis;

public class TestPing {
    public static void main(String[] args)
    {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        //输出PONG，redis连通成功
        System.out.println(jedis.ping());
    }
}
