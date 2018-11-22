package com.bid.springcloud;/*
@author zhoucong
@date ${date}-${time}

*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClien
@EnableFeignClients(basePackages= {"com.bid.springcloud"})
@ComponentScan("com.bid.springcloud")
public class ProtalApp {
    public static void main(String[] args) {
        SpringApplication.run(ProtalApp.class,args);
    }

}
