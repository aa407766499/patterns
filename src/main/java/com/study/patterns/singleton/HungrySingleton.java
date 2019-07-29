package com.study.patterns.singleton;

/**
 * 饿汉式单例
 *
 * Created by ASUS on 2019/7/29.
 */
public class HungrySingleton {

    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    //防止反射暴力攻击单例
    private HungrySingleton() {
        if (HUNGRY_SINGLETON != null) {
            throw new RuntimeException("无法创建实例");
        }
    }

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }

    //防止序列化攻击单例
    private Object readResolve() {
        return HUNGRY_SINGLETON;
    }

}
