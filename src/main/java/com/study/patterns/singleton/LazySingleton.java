package com.study.patterns.singleton;

/**
 * 懒汉式单例
 *
 * Created by ASUS on 2019/7/29.
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    //防止反射暴力攻击单例
    private LazySingleton() {
        if (lazySingleton != null) {
            throw new RuntimeException("无法创建实例");
        }
    }

    //线程安全，双重校验锁相比同步方法性能更高
    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

    //防止序列化攻击单例
    private Object readResolve() {
        return lazySingleton;
    }

}
