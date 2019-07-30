package com.study.patterns.singleton;

/**
 * 线程局部单例
 *
 * Created by ASUS on 2019/7/29.
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL = ThreadLocal.withInitial(() -> new ThreadLocalSingleton());

    private ThreadLocalSingleton() {
    }

    public static ThreadLocalSingleton getInstance() {
        return THREAD_LOCAL.get();
    }

    private Object readResolve() {
        return THREAD_LOCAL.get();
    }

}
