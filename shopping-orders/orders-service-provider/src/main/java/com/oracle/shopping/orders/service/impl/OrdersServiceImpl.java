package com.oracle.shopping.orders.service.impl;


import javax.annotation.Resource;

import com.oracle.shopping.orders.mapper.OrdersMapper;
import com.oracle.shopping.orders.po.Orders;

import com.oracle.shopping.orders.service.OrdersService;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl implements OrdersService{

    @Resource
    private OrdersMapper ordersMapper;

    @Override
    public int deleteByPrimaryKey(String ordersId) {
        return ordersMapper.deleteByPrimaryKey(ordersId);
    }

    @Override
    public int insert(Orders record) {
        return ordersMapper.insert(record);
    }

    @Override
    public int insertSelective(Orders record) {
        return ordersMapper.insertSelective(record);
    }

    @Override
    public Orders selectByPrimaryKey(String ordersId) {
        System.out.println(55555);
        return ordersMapper.selectByPrimaryKey(ordersId);
    }

    @Override
    public int updateByPrimaryKeySelective(Orders record) {
        return ordersMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Orders record) {
        return ordersMapper.updateByPrimaryKey(record);
    }

}
