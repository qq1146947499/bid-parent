package com.bid.springcloud.controller;


import com.bid.springcloud.entities.PtUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class HelloController {


    @PostMapping("/register/couser")
    public  String hello(PtUser user){
        System.out.println(user);
        System.out.println("hello resoulver");
        return "success";
    }

    //查出用户数据，在页面展示
    @RequestMapping("/")
    public String success(Map<String,Object> map){
        System.out.println("success");
        return "index";
    }



}
