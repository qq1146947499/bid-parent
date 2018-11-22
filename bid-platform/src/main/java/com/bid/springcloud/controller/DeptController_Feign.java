package com.bid.springcloud.controller;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;


@RestController
public class DeptController_Feign
{
/*
    @Resource
    private CoUserService coUserService;

    @RequestMapping("/hello")
    public String hello(){
        return  "Hello";
    }
    @RequestMapping(value = "/demo/dept/get/{id}")
    public CoUser get(@PathVariable Integer id){
        System.out.println("get resolver");
       return  coUserService.get(id);
    }*/


}

