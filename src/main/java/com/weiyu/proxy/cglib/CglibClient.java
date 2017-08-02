package com.weiyu.proxy.cglib;

/**
 * Created by Wei Yu on 2017/7/31.
 */
public class CglibClient {
    public static void main(String[] args) {
        BookProxyLib cglib = new BookProxyLib();
        IBookProxy bookCglib = (BookProxyImpl) cglib.getInstance(new BookProxyImpl());
        bookCglib.addBook();
    }
}
