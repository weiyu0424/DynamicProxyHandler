package com.weiyu.proxy.aop;

/**
 * Created by Wei Yu on 2017/8/1.
 */
public class RailwayStation implements ITicketService{

    public void sellTicket() {
        System.out.println("售票...");
    }

    public void inquire() {
        System.out.println("询问...");
    }

    public void withdraw() {
        System.out.println("退票...");
    }
}
