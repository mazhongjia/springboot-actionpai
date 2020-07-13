package com.mzj.springboot.actionpai.controller;

import com.mzj.springboot.actionpai.common.ServerResponse;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloWorldController2 {

    @GetMapping("/helloObject")
    public ServerResponse helloObject() {
        ServerResponse result = ServerResponse.createByErrorMsg("失败信息....");
        return result;
    }

    @GetMapping("/helloMap")
    public Map<String,String> helloMap() {
        Map<String,String> result = new HashMap<>();
        result.put("key1","value1");
        result.put("key2","value2");
        return result;
    }

}
