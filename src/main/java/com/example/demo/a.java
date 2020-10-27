package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/a")
public class a {
    @RequestMapping("/s")
    public String a(){
        return "c";
    }
    @RequestMapping("d")
    public String v(){
        System.out.println("s");
        return "s";
    }
}
