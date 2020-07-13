package com.mzj.springboot.actionpai.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@ControllerAdvice
public class HelloWorldController {

    @GetMapping("/hello1")
    public String hello1() {
        return "hello1";
    }

    @ModelAttribute(name = "md")
    public Map<String, Object> mydata() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("age", 99);
        map.put("gender", "男");
        return map;
    }

    @GetMapping("/hello2")
    public Map hello(Model model) {
        Map<String, Object> map = model.asMap();//这个map不能直接返回给客户端，需要另外创建map并返回
        System.out.println(map);
        Map<String,Object> result = new HashMap<>(map);
        return result;
    }

    @GetMapping("/hello3exception")
    public String hello3() {
        int i = 1 / 0;
        return "hello controller advice";
    }

}
