package com.atguigu.dubbo.service;

import com.atguigu.dubbo.entities.UserAddress;

import java.util.List;

public interface OrderService {
    public List<UserAddress> initOrder(String userId);
}
