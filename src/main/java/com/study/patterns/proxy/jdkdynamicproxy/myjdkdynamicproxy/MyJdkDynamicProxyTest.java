package com.study.patterns.proxy.jdkdynamicproxy.myjdkdynamicproxy;

import com.study.patterns.proxy.dao.User;
import com.study.patterns.proxy.service.UserService;
import com.study.patterns.proxy.service.impl.UserServiceImpl;

/**
 * Created by Huzi on 2019/8/6.
 */
public class MyJdkDynamicProxyTest {

    public static void main(String[] args) throws Throwable {
        UserService userService = (UserService) new MyJdkTransactionAdvisor().getInstance(new UserServiceImpl());
        userService.insertUser(new User());
    }

}
