package com.weiyu.proxy.circularBean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Wei Yu on 2017/8/15.
 */
public class Client {
    public static void main(String[] args) {
        BeanFactory context = new ClassPathXmlApplicationContext("spring-aspect.xml");
        CircularDependencyA circA = (CircularDependencyA) context.getBean(CircularDependencyA.class);
    }
}
