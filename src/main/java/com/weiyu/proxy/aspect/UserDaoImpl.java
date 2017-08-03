package com.weiyu.proxy.aspect;

import org.springframework.stereotype.Repository;

/**
 * Created by Wei Yu on 2017/8/3.
 */

@Repository
public class UserDaoImpl implements UserDao {
    public int addUser() {
        System.out.println("add user...");
        return 666;
    }

    public void updateUser() {
        System.out.println("update user...");
    }

    public void deleteUser() {
        System.out.println("delete user...");
    }

    public void findUser() {
        System.out.println("find user...");
    }
}
