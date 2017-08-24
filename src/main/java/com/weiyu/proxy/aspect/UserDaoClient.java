package com.weiyu.proxy.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Wei Yu on 2017/8/14.
 */
public class UserDaoClient {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-aspect.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        userDao.addUser();
    }
}
