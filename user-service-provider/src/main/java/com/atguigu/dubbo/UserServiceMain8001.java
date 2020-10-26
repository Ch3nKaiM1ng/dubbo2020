package com.atguigu.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDubbo
@EnableHystrix
public class UserServiceMain8001 {
    public static void main(String args[]){
        SpringApplication.run(UserServiceMain8001.class,args);
    }
}
