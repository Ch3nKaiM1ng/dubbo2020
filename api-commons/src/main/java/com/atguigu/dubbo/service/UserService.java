package com.atguigu.dubbo.service;

import com.atguigu.dubbo.entities.UserAddress;

import java.util.List;

public interface UserService {
    public List<UserAddress> getUserAddressList(String userId);
}
