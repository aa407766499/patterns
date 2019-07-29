package com.study.patterns.singleton;

/**
 * 单例并发测试
 *
 * Created by ASUS on 2019/7/29.
 */
public class SingletonConcurrentTest {

    /*public static void main(String[] args) {
        Runnable runnable = () -> {
            try {
                Object instance0 = ContainerSingleton.getInstance("com.study.patterns.factory.product.book.ChineseBook");
                System.out.println(Thread.currentThread().getName() +":"+instance0.hashCode());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        };
        new Thread(runnable).start();
        new Thread(runnable).start();
    }*/


    public static void main(String[] args) {
        ThreadLocalSingleton instance1 = ThreadLocalSingleton.getInstance();
        ThreadLocalSingleton instance2 = ThreadLocalSingleton.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
    }

}
