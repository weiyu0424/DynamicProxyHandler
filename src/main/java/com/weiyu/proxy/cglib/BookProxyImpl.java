package com.weiyu.proxy.cglib;

/**
 * Created by Wei Yu on 2017/7/31.
 */
public class BookProxyImpl implements IBookProxy{
    public void addBook(){
        System.out.println("增加图书的普通方法");
    }
}
