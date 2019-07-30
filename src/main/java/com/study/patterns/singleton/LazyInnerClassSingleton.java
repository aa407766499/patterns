package com.study.patterns.singleton;

/**
 * 静态内部类单例
 *
 * Created by Huzi on 2019/7/30.
 */
public class LazyInnerClassSingleton {

    //防止反射暴力攻击单例
    private LazyInnerClassSingleton() {
        if (InstanceHolder.INSTANCE != null) {
            throw new RuntimeException("无法创建实例");
        }
    }

    public static LazyInnerClassSingleton getInstance() {
        return InstanceHolder.INSTANCE;
    }

    private static class InstanceHolder {
        private static final LazyInnerClassSingleton INSTANCE = new LazyInnerClassSingleton();
    }

    //防止序列化攻击单例
    private Object readResolve() {
        return InstanceHolder.INSTANCE;
    }

}
