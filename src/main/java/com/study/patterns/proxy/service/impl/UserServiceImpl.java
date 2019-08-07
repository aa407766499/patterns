package com.study.patterns.proxy.service.impl;

import com.study.patterns.proxy.dao.User;
import com.study.patterns.proxy.dto.UserDao;
import com.study.patterns.proxy.service.UserService;

/**
 * Created by Huzi on 2019/8/6.
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDao();

    @Override
    public int insertUser(User user) {
        System.out.println("调用DAO插入一个用户");
        return userDao.insertUser(user);
    }

}
