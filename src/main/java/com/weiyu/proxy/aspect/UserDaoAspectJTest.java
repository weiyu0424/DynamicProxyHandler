package com.weiyu.proxy.aspect;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Wei Yu on 2017/8/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= "classpath:spring-aspect.xml")
public class UserDaoAspectJTest {
    @Autowired
    UserDao userDao;

    @Test
    public void aspectJTest(){
        userDao.addUser();
    }
}
