package com.atguigu.dubbo.controller;

import com.atguigu.dubbo.entities.UserAddress;
import com.atguigu.dubbo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;

@RestController
public class OrderController implements Serializable {
    @Autowired
    OrderService orderService;

    @ResponseBody
    @RequestMapping("/consumer/getUserAddress")
    public List<UserAddress> getUserAddress(@RequestParam("uid") String userId){
        return orderService.initOrder(userId);
    }

   
}
