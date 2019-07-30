package com.study.patterns.singleton.test;

import com.study.patterns.singleton.LazySingleton;

/**
 * 单例并发测试
 * <p>
 * Created by ASUS on 2019/7/29.
 */
public class SingletonConcurrentTest {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            LazySingleton instance = LazySingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ":" + instance);
        };
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
    }

}
