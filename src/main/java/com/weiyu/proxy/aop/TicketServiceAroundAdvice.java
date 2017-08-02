package com.weiyu.proxy.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by Wei Yu on 2017/8/1.
 */
public class TicketServiceAroundAdvice implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("AROUND_SERVICE:BEGIN:");
        Object returnObject = methodInvocation.proceed();
        System.out.println("AROUND_SERVICE:END");
        return returnObject;
    }
}
