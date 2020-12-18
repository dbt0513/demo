package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    /**
     * 集群连接测试
     */
    @Test
    public void testJedisCluster(){
        Set<HostAndPort> nodes = new HashSet<>();
        nodes.add(new HostAndPort("47.114.53.46", 6379));
        nodes.add(new HostAndPort("47.114.53.46", 6380));
        nodes.add(new HostAndPort("47.114.53.46", 6381));
        nodes.add(new HostAndPort("47.114.53.46", 6382));
        nodes.add(new HostAndPort("47.114.53.46", 6383));
        nodes.add(new HostAndPort("47.114.53.46", 6384));
        JedisCluster cluster = new JedisCluster(nodes );
        cluster.set("key1", "1000");
        System.out.println(cluster.get("key1"));

    }
}
