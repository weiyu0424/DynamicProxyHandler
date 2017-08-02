package com.weiyu.proxy;

/**
 * Created by Wei Yu on 2017/7/31.
 */
public class ElectricCar implements Vehicle,Rechargable {
    public void drive() {
        System.out.println("Electric car is moving slightly");
    }

    public void recharge() {
        System.out.println("Electric car is recharging...");
    }
}
