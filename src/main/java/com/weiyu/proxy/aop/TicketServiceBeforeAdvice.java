package com.weiyu.proxy.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by Wei Yu on 2017/8/1.
 */
public class TicketServiceBeforeAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("欢迎光临代售点...");
    }
}
