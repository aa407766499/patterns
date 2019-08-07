package com.study.patterns.proxy.service;

import com.study.patterns.proxy.dao.User;

/**
 * Created by Huzi on 2019/8/6.
 */
public interface UserService {

    int insertUser(User user) throws Throwable;

}
