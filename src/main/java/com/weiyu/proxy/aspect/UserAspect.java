package com.weiyu.proxy.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by Wei Yu on 2017/8/3.
 */
@Aspect
public class UserAspect {

    @Before("execution(* com.weiyu.proxy.aspect.UserDao.addUser(..))")
    public void before(){
        System.out.println("前置通知");
    }


    @AfterReturning(value = "execution(* com.weiyu.proxy.aspect.UserDao.addUser(..))",returning = "returnVal")
    public void afterReturning(Object returnVal){
        System.out.println("后置通知" + returnVal);
    }

    @Around("execution(* com.weiyu.proxy.aspect.UserDao.addUser(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知前...");
        Object obj = joinPoint.proceed();
        System.out.println("环绕通知后...");
        return obj;
    }


    @AfterThrowing(value = "execution(* com.weiyu.proxy.aspect.UserDao.addUser(..))",throwing = "e")
    public void afterThrowing(Throwable e){
        System.out.println("出现异常ex:" + e.getMessage());
    }

    @After("execution(* com.weiyu.proxy.aspect.UserDao.addUser(..))")
    public void after(){
        System.out.println("最终通知...");
    }


}
