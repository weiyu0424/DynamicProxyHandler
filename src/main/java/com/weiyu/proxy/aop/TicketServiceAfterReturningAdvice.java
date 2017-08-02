package com.weiyu.proxy.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by Wei Yu on 2017/8/1.
 */
public class TicketServiceAfterReturningAdvice implements AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("AFTER RETURNING: 本次服务已经结束了..");

    }
}
