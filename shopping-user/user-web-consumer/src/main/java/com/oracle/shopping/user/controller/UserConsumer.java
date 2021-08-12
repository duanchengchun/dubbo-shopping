package com.oracle.shopping.user.controller;

import com.oracle.shopping.orders.po.Orders;
import com.oracle.shopping.orders.service.OrdersService;
import com.oracle.shopping.user.po.SysUser;
import com.oracle.shopping.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: dcc
 * @CreateDate: 2021/8/10  20:39
 * @Version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UserConsumer {

    @Autowired(required = false)
    private SysUserService sysUserService;

    @Autowired(required = false)
    private OrdersService ordersService;

    @RequestMapping("/detail/{id}")
    public @ResponseBody
    Map detail(@PathVariable("id") String id){
        SysUser sysUser = sysUserService.selectByPrimaryKey(id);
        Orders orders = ordersService.selectByPrimaryKey("1");
        Map map = new HashMap();
        map.put(sysUser, orders);
        return map;
    }
}
