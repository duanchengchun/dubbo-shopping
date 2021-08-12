package com.oracle.shopping.orders.mapper;

import com.oracle.shopping.orders.po.Orders;

public interface OrdersMapper {
    int deleteByPrimaryKey(String ordersId);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(String ordersId);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}