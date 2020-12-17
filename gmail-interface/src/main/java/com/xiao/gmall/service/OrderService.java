package com.xiao.gmall.service;

import com.xiao.gmall.bean.UserAddress;

import java.util.List;

public interface OrderService {
    /**
     * 初始化订单
     * @param userID
     */
    public List<UserAddress> initOrder(String userID);
}
