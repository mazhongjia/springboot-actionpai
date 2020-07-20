package com.mzj.springboot.actionpai.controller;

import com.mzj.springboot.actionpai.common.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class HelloWorldController3 {

    //----------------------方法1、获取路径中的值----------------------------
    /**
     * URL：http://localhost:8081/addUser0/MAZHONGJIA
     *
     * @param username
     * @return
     */
    @GetMapping("/addUser0/{username}")
    public String addUser0(@PathVariable String username) {
        System.out.println("username : " + username);
        return "success0";
    }

    //----------------------方法2、获取路径中的参数----------------------------
    /**
     * URL：http://localhost:8081/addUser1?username=mazhongjia
     *
     * @param username
     * @return
     */
    @GetMapping("/addUser1")
    public String addUser1(String username) {
        System.out.println("username : " + username);
        return "success1";
    }

    //----------------------方法3、通过bean接收HTTP提交的对象----------------------------
    /**
     * URL：http://localhost:8081/addUser2?username=mazhongjia&age=33
     *
     * @param user
     * @return
     */
    @GetMapping("/addUser2")
    public String addUser2(User user) {
        System.out.println("user ... " + user);
        return "success2";
    }

    //----------------------方法4、通过HttpServletRequest接收参数----------------------------
    /**
     * URL：http://localhost:8081/addUser3?username=mazhongjia
     *
     * @param request
     * @return
     */
    @GetMapping("/addUser3")
    public String addUser3(HttpServletRequest request) {
        System.out.println("username ... " + request.getParameter("username"));
        return "success3";
    }

    //----------------------方法5、用@RequestParam绑定入参----------------------------
    /**
     * 通过@RequestParam注解绑定入参
     * <p>
     * URL：http://localhost:8081/addUser1?username=mazhongjia
     *
     * @param username
     * @return
     */
    @GetMapping("/addUser4")
    public String addUser4(@RequestParam String username) {
        System.out.println("username : " + username);
        return "success4";
    }

    //----------------------方法6、用@RequestBody接收JSON数据----------------------------
    /**
     * URL：http://localhost:8081/addUser5
     * BODY：
     * [
     * {
     * "username": "mazhongjia",
     * "age": "35"
     * },
     * {
     * "username": "huan",
     * "age": "31"
     * }
     * ]
     * <p>
     * 通过@RequestBody接收JSON入参，同时需要设置http的header中Content-Type属性值为【application/json;charset=UTF-8】
     *
     * @param userList
     * @return
     */
    @PostMapping("/addUser5")
    public String addUser5(@RequestBody List<User> userList) {
        System.out.println("userList : " + userList);
        return "success5";
    }

    //----------------------方法7、用@ModelAttribute注解获取参数----------------------------
    /**
     * URL：http://localhost:8081/addUser6?username=mazhong&age=35
     * <p>
     * 通过@ModelAttribute注解，从Model、Form或者URL请求参数中获取属性值，上面的URL演示从URL参数中取值
     *
     * @param user
     * @return
     */
    @PostMapping("/addUser6")
    public String addUser6(@ModelAttribute("user") User user) {
        System.out.println("user ... " + user);
        return "success6";
    }

    /**
     * URL：http://localhost:8081/addUser7
     * <p>
     * 通过@ModelAttribute注解，从Model、Form或者URL请求参数中获取属性值，上面的URL演示从Model中取值
     *
     * @param user
     * @return
     */
    @PostMapping("/addUser7")
    public String addUser7(@ModelAttribute("user") User user) {
        System.out.println("user7 ... " + user);
        return "success7";
    }
    @ModelAttribute("user")
    public User addAccount() {
        return new User("jz", 55);
    }

}
