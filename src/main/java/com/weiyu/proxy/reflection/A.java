package com.weiyu.proxy.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Wei Yu on 2017/8/15.
 */
public class A {
    public void foo(String name){
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.weiyu.proxy.reflection.A");
            Object obj = clazz.newInstance();
            Method method = clazz.getMethod("foo",String.class);
            for(int i = 0;i < 16;i++){
                method.invoke(obj,String.valueOf(i));
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
