package com.weiyu.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * Created by Wei Yu on 2017/7/31.
 */
public class ProgrammerClient {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        Hack hacker = new Hack(programmer);
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(programmer.getClass());
        enhancer.setCallback(hacker);
        Programmer proxy = (Programmer) enhancer.create();
        proxy.code();
    }
}
