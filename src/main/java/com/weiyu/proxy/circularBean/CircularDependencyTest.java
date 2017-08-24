package com.weiyu.proxy.circularBean;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Wei Yu on 2017/8/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
public class CircularDependencyTest {
    @Autowired
    ApplicationContext context;

    @Bean
    public CircularDependencyA getCircularDependencyA(){
        System.out.println("helloA");
        return new CircularDependencyA();
    }

    @Bean
    public CircularDependencyB getCircularDependencyB(){
        System.out.println("HelloB");
        return new CircularDependencyB();
    }

    @Test
    public void givenCircularDependency_whenConstructorInjection_thenItFails() {
        CircularDependencyA circA = context.getBean(CircularDependencyA.class);
        System.out.println("hello1");
        System.out.println(circA.getCircB().getMessage());
        //Assert.assertEquals("Hi",circA.getCircB().getMessage());
    }
}
