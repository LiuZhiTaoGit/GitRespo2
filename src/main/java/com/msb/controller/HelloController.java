package com.msb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
