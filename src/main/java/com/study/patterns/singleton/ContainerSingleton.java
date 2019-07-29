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

    private ContainerSingleton() {
        if (MAP != null) {
            throw new RuntimeException("无法创建实例");
        }
    }

    public static Object getInstance(String name) throws ClassNotFoundException {
        synchronized (MAP) {
            if (!MAP.containsKey(name)) {
                MAP.put(name, Class.forName(name));
            }
        }
        return MAP.get(name);
    }

    private Object readResolve() {
        return MAP;
    }

}
