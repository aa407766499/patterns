package com.study.patterns.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例（容器缓存式）
 *
 * Created by ASUS on 2019/7/29.
 */
public class ContainerSingleton {

    private static final Map<String, Object> MAP = new ConcurrentHashMap<>();

    //防止反射暴力攻击单例
    private ContainerSingleton() {
        if (MAP != null) {
            throw new RuntimeException("无法创建实例");
        }
    }

    public static Object getInstance(String className) throws ClassNotFoundException {
        synchronized (MAP) {
            MAP.putIfAbsent(className, Class.forName(className));
        }
        return MAP.get(className);
    }

    //防止序列化攻击单例
    private Object readResolve() {
        return MAP;
    }

}
