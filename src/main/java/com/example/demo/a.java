package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

@RestController
@RequestMapping("/a")
public  class  a {
    @Autowired
    private RedisTemplate<String, Object> template;

    @PostMapping("/s")
    public String a(@RequestBody String xc){
        return "c";
    }
    @RequestMapping("d")
    public String v(){
        System.out.println("s");
        return "s";
    }

    @GetMapping("/test")
    public String test() {
        template.opsForValue().set("demo", "hello world! 你好，世界");
        String str = (String) template.opsForValue().get("demo");
        Stream a= Stream.of(new ArrayList<>());

        return str;
    }
}
