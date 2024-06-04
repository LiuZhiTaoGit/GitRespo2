package com.msb.controller;

import com.msb.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/**
 * @author: liuzt
 * @date: 2024/6/3 - 06 - 03 - 13:51
 * @description: com.msb.controller
 * @version: 1.0
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello world");
        return "Hello workd";
    }

//    @RequestMapping("/simple")
//    public String simpleParm(HttpServletRequest request){
//        String name = request.getParameter("name");
//        String age = request.getParameter("age");
//        int a = Integer.parseInt(age);
//        System.out.println(name + " +  " + a);
//        return "ok";
//    }
//    springboot方式
    @RequestMapping("/simple")
    public String simpleParm(String name, Integer age){
//        String name = request.getParameter("name");
//        String age = request.getParameter("age");
//        int a = Integer.parseInt(age);
        System.out.println(name + " +  " + age);
        return "ok";
    }
    @RequestMapping("/complexpojo")
    public String complexPojo(User user){
        System.out.println(user);
        return "ok";
    }
    @RequestMapping("/hobby")
    public String array(String[] hobby){
        System.out.println(Arrays.toString(hobby));
        return "ok";
    }
    @RequestMapping("/listParam")
    public String listParam(@RequestParam List<String> hobby){
        System.out.println(hobby);
        return "ok";
    }
    @RequestMapping("/dateParam")
    public String dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime localDateTime){
        System.out.println(localDateTime);
        return "0k";
    }


}
