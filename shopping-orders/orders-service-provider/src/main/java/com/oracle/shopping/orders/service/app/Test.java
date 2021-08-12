package com.oracle.shopping.orders.service.app;

import com.oracle.shopping.orders.po.Orders;
import com.oracle.shopping.orders.service.OrdersService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author: dcc
 * @CreateDate: 2021/8/11  14:29
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-mybatis.xml");
        OrdersService service = context.getBean(OrdersService.class);
        Orders orders = service.selectByPrimaryKey("1");
        System.out.println(orders);
    }
}
