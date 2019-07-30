package com.study.patterns.prototype;

/**
 * Created by Huzi on 2019/7/30.
 */
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User();
        User cloneUser = (User) user.deepClone();
        System.out.println(user.getId() == cloneUser.getId());
        System.out.println(user.getName() == cloneUser.getName());
        System.out.println(user.getBirthday() == cloneUser.getBirthday());
    }

}
