package com.weiyu.proxy.circularBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Wei Yu on 2017/8/24.
 */
@Component
public class CircularDependencyB {

    private CircularDependencyA circA;

    private String message = "Hi";

    /*public CircularDependencyB(){
        System.out.println("hello3");
    }*/
    /*@Autowired
    public CircularDependencyB(CircularDependencyA circA){
        this.circA = circA;
    }*/

    public CircularDependencyA getCircA() {
        return circA;
    }

    @Autowired
    public void setCircA(CircularDependencyA circA) {
        this.circA = circA;
    }

    public String getMessage(){
        return message;
    }


}
