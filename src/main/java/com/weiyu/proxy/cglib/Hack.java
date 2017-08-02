package com.weiyu.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Wei Yu on 2017/7/31.
 */
public class Hack implements MethodInterceptor {
    private Object target;

    public Hack(Object obj){
        this.target = obj;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Before executing the code!!!");
        Object invokeObject = method.invoke(target, objects);
        System.out.println("After executing the code!!");
        return invokeObject;
    }
}
