package com.oracle.shopping.orders.service.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Description:
 * @Author: dcc
 * @CreateDate: 2021/8/10  20:14
 * @Version: 1.0
 */
public class App {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring/spring-*.xml");
        System.in.read();
        System.out.println(222);
        System.out.println(333);
        System.out.println("fsa af ");
        System.out.println(333);
    }
}
