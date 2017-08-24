package com.weiyu.proxy.circularBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Created by Wei Yu on 2017/8/24.
 */
@Component
public class CircularDependencyA {
    private CircularDependencyB circB;

    /*public CircularDependencyA(){
        System.out.println("hello2");
    }*/

    /*@Autowired
    public CircularDependencyA(@Lazy CircularDependencyB circB){
        this.circB = circB;
    }*/

    public CircularDependencyB getCircB() {
        return circB;
    }
    @Autowired
    public void setCircB(CircularDependencyB circB) {
        this.circB = circB;
    }
}
