package com.mzj.springboot.actionpai.exceptionhandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyGlobalExceptionHandler {
    //    @ExceptionHandler(Exception.class)
//    public ModelAndView customException(Exception e) {
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("message123", e.getMessage());
//        mv.setViewName("myerror123");
//        return mv;
//    }
    @ExceptionHandler(Exception.class)
    public Map<String, Object> exceptionHandler(Exception e) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", "1002");
        map.put("message", e.getMessage());
        //发生异常进行日志记录，此处省略
        return map;
    }
}
