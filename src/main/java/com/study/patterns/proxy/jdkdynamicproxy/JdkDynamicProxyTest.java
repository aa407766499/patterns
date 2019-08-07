package com.study.patterns.proxy.jdkdynamicproxy;

import com.study.patterns.proxy.dao.User;
import com.study.patterns.proxy.service.UserService;
import com.study.patterns.proxy.service.impl.UserServiceImpl;

/**
 * Created by Huzi on 2019/8/6.
 */
public class JdkDynamicProxyTest {

    public static void main(String[] args) throws Throwable {
        UserService userService = (UserService) new JdkTransactionAdvisor().getInstance(new UserServiceImpl());
        int i = userService.insertUser(new User());
        System.out.println(i);
    }

}
