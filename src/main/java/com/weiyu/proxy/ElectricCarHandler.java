package com.weiyu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Wei Yu on 2017/7/31.
 */
public class ElectricCarHandler implements InvocationHandler {
    private Object target;
    public ElectricCarHandler(Object obj){
        this.target = obj;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before the method");
        Object invokeObject = method.invoke(target, args);
        System.out.println("After the method");
        return invokeObject;
    }
}
