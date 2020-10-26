package com.atguigu.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.dubbo.entities.UserAddress;
import com.atguigu.dubbo.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Service(version = "1.0.0")
@Component

public class UserServiceImpl implements UserService {

    public List<UserAddress> getUserAddressList(String userId)  {
        UserAddress address1=new UserAddress(1,"北京地址","1","李老师","13590269355","Y");
        UserAddress address2=new UserAddress(2,"深圳地址","1","杨老师","13590269355","N");
        System.out.println("version==1.0.0");

        if(Math.random()>0.5){
            throw new RuntimeException();
        }
        return Arrays.asList(address1,address2);
    }


}
