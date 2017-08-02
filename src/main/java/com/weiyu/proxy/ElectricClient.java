package com.weiyu.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by Wei Yu on 2017/7/31.
 */
public class ElectricClient {
    public static void main(String[] args) {
        ElectricCar car =  new ElectricCar();
        ProxyUtils.generateClassFile(car.getClass(),"ElectricCarProxy");
        ClassLoader classLoader = car.getClass().getClassLoader();
        Class[] interfaces = car.getClass().getInterfaces();
        Object o = Proxy.newProxyInstance(classLoader, interfaces, new ElectricCarHandler(car));
        Vehicle vehicle = (Vehicle) o;
        vehicle.drive();

        Rechargable rechargable = (Rechargable) o;
        rechargable.recharge();
    }
}
