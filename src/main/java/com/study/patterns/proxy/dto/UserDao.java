package com.study.patterns.proxy.dto;

import com.study.patterns.proxy.dao.User;

/**
 * Created by Huzi on 2019/8/6.
 */
public class UserDao {

    public int insertUser(User user) {
        System.out.println("插入一个用户，插入成功");
        return 1;
    }

}
