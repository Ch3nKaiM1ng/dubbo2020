package com.atguigu.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.dubbo.entities.UserAddress;
import com.atguigu.dubbo.service.OrderService;
import com.atguigu.dubbo.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Reference(version = "*")
    UserService userService;

    @HystrixCommand(fallbackMethod = "helloTest")
    public List<UserAddress> initOrder(String UserId){
        return userService.getUserAddressList(UserId);
    }

    public List<UserAddress> helloTest(String UserId){
        System.out.println("hello HystrixCommand");
        return Arrays.asList(new UserAddress(1,"北京地址","1","李老师","13590269355","Y"));
    }
}
