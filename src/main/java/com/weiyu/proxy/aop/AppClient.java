package com.weiyu.proxy.aop;

import org.aopalliance.aop.Advice;
import org.springframework.aop.framework.ProxyFactoryBean;

/**
 * Created by Wei Yu on 2017/8/1.
 */
public class AppClient {
    public static void main(String[] args) {
        //1.针对不同时期的Service类型，通过不同的service
        Advice beforeAdvice = new TicketServiceBeforeAdvice();
        Advice afterAdvice = new TicketServiceAfterReturningAdvice();
        Advice throwableAdvice = new TicketServiceThrowAdvice();
        Advice aroundAdvice = new TicketServiceAroundAdvice();


        RailwayStation railwayStation = new RailwayStation();

        //2.创建ProxyFactoryBean用于创建指定的Proxy对象
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        //3.设置Proxy的接口
        proxyFactoryBean.setInterfaces(railwayStation.getClass().getInterfaces());
        proxyFactoryBean.setTarget(railwayStation);
        //Spring默认使用jdk接口实现机制来生成动态代理对象，如果要使用cglib，可以将
        proxyFactoryBean.setProxyTargetClass(false);

        proxyFactoryBean.addAdvice(beforeAdvice);
        proxyFactoryBean.addAdvice(afterAdvice);
        proxyFactoryBean.addAdvice(throwableAdvice);
        proxyFactoryBean.addAdvice(aroundAdvice);

        proxyFactoryBean.setProxyTargetClass(false);

        //通过ProxyFactoryBean生成ITicketService接口的代理对象
        ITicketService service = (ITicketService) proxyFactoryBean.getObject();
        service.sellTicket();

    }
}
