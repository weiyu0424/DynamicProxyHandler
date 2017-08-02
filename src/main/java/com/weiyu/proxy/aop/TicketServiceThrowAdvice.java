package com.weiyu.proxy.aop;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * Created by Wei Yu on 2017/8/1.
 */
public class TicketServiceThrowAdvice implements ThrowsAdvice {
    public void afterThrowing(Exception e){
        System.out.println("AFTER_THROWING");
    }

    public void afterThrowing(Method method,Object[] args,Exception e){
        System.out.println("调用过程出错了");
    }
}
