package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private JedisPool jedisPool;
    @Test
    void contextLoads() {
        Long aa=Long.MAX_VALUE;
        Jedis jedis = jedisPool.getResource();
        jedis.select(1);
        List<String> a = jedis.lrange("15038203907",0,-1);
//        JedisConfig jedisConfig = new JedisConfig();
//        JedisPool jedisPool = jedisConfig.jedisPool();
        //jedis.rename("15038203907","myphone");
        Boolean exists = jedis.exists("15038203907");
        System.out.println(exists);
        System.out.println(a);
    }

}
