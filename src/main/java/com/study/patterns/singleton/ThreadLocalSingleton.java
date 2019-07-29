package com.study.patterns.singleton;

/**
 * 线程局部单例
 * <p>
 * Created by ASUS on 2019/7/29.
 */
//需要修改
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            threadLocalSingleton = new ThreadLocalSingleton();
            return threadLocalSingleton;
        }
    };

    private static ThreadLocalSingleton threadLocalSingleton = null;

    private ThreadLocalSingleton() {
        if (THREAD_LOCAL.get() != null) {
            throw new RuntimeException("无法创建实例");
        }
    }

    public static ThreadLocalSingleton getInstance() {
        return THREAD_LOCAL.get();
    }

    private Object readResolve() {
        return THREAD_LOCAL.get();
    }

}
